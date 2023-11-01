package homework4.task7;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface AvailableForCollection {
    LocalDateTime getAssemblyDate();
    default boolean isAvailableForCollection() throws Exception {
        if (getAssemblyDate() == null) { //не уверена, что это значение по умолчанию
            return false;
        }
        else if (getAssemblyDate().plusWeeks(2).equals(LocalDate.now())) {
            return true;
        }
        else {
            throw new Exception("Время выдачи заказа истекло");
        }
    }
}
