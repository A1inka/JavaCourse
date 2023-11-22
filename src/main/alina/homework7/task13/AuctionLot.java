package homework7.task13;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class AuctionLot {
    ReadFileByWords reader = new ReadFileByWords();
    private String nameUser;
    private double price;
    private final ZonedDateTime endTime;

    public AuctionLot(ZonedDateTime endTime) {
        this.nameUser = reader.readFile("lot.txt").get(1) + " "
                + reader.readFile("lot.txt").get(2);
        this.price = Double.parseDouble(reader.readFile("lot.txt").get(3));
        this.endTime = endTime;
    }

    public void bid(double price, String name) {
        if (getPrice() < price && isActive()) {
            this.price = price;
            this.nameUser = name;
        }
    }

    public boolean isActive() {
        ZonedDateTime currentTime = ZonedDateTime.now(ZoneId.of("Europe/Moscow"));
        return getEndTime().isAfter(currentTime);
    }

    public String winner() throws Exception {
        if (!isActive()) {
            return getName();
        }
        else {
            throw new Exception("Торги еще не закончились!");
        }
    }

    public String getName() {
        return nameUser;
    }

    public double getPrice() {
        return price;
    }

    public ZonedDateTime getEndTime() {
        return endTime;
    }

}
