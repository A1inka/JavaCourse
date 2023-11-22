package homework7.task14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public void start(String serverAddress, int serverPort) {
        try (Socket socket = new Socket(serverAddress, serverPort);
             BufferedReader serverReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter clientWriter = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {

            new Thread(() -> {
                String serverMessage;
                try {
                    while ((serverMessage = serverReader.readLine()) != null) {
                        System.out.println(serverMessage);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

            String message;
            while ((message = consoleReader.readLine()) != null) {
                clientWriter.println(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start("127.0.0.1", 12345);
    }
}
