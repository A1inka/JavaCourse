package homework7.task14;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private final List<PrintWriter> clientOutputStreams = new ArrayList<>();

    public void start(int port) {
        try (ServerSocket serverSocket = new ServerSocket(port)) {

            while (true) {
                Socket clientSocket = serverSocket.accept();

                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
                clientOutputStreams.add(writer);

                new Thread(() -> handleClient(clientSocket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void handleClient(Socket clientSocket) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            String message;
            while ((message = reader.readLine()) != null) {
                System.out.println(message);
                broadcastMessage(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private synchronized void broadcastMessage(String message) {
        for (PrintWriter writer : clientOutputStreams) {
            writer.println(message);
            writer.flush();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start(12345);
    }
}

