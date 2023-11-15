package homework4.task7.orderStatus;

import java.time.LocalDateTime;
import java.time.ZoneId;

public interface AvailableForReceiving {

    LocalDateTime getAssemblyDate();
    OrderStatus getOrderStatus();
    default boolean isAvailableForReceiving() throws Exception {
        if (getAssemblyDate() == null) {
            return false;
        }
        else if (getAssemblyDate().plusWeeks(2).equals(LocalDateTime.now(ZoneId.of("Europe/Moscow"))) &&
                getOrderStatus() == OrderStatus.COLLECTED) {
            return true;
        }
        else {
            throw new Exception("Время выдачи заказа истекло");
        }
    }
}
