package homework7.task13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Random;

public class Auction {
    public static void main(String[] args) {

        try {

            Path path = Paths.get("src/main/alina/homework7/task/participants.txt");
            List<String> participants = Files.readAllLines(path);

            // изменить время
            AuctionLot auctionLot = new AuctionLot(ZonedDateTime.of(2023, 11, 22, 10, 55,
                    50, 0, ZoneId.of("Europe/Moscow")));

            Random random = new Random();

            for (String participant : participants) {
                new Thread(() -> {
                    for (int i = 0; i < 100; i++) {
                        double newBid = auctionLot.getPrice() + random.nextInt(10000);
                        if (auctionLot.isActive()) {
                            auctionLot.bid(newBid, participant);
                            System.out.println(participant);
                            System.out.println(newBid);
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}