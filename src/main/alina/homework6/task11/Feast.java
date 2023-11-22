package homework6.task11;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Set;

public class Feast {
    private LocalDate feastDate;
    private Set<String> notAvailableProducts;

    public Feast(LocalDate feastDate, Set<String> availableProducts) {
        this.feastDate = feastDate;
        this.notAvailableProducts = availableProducts;
    }

    public DayOfWeek getFeastDayOfWeek() {
        DayOfWeek dayOfWeek = feastDate.getDayOfWeek();
        return dayOfWeek;
    }

    public void addProduct(String product) {
        notAvailableProducts.add(product);
    }

    public void removeProduct(String product) {
        notAvailableProducts.remove(product);
    }

    public Set<String> getNotAvailableProducts() {
        return notAvailableProducts;
    }
}
