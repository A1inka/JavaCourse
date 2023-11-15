package homework6.task11;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Set;

public class Feast {
    private LocalDate feastDate;
    private Set<String> availableProducts;

    public Feast(LocalDate feastDate, Set<String> availableProducts) {
        this.feastDate = feastDate;
        this.availableProducts = availableProducts;
    }

    public DayOfWeek getFeastDayOfWeek() {
        DayOfWeek dayOfWeek = feastDate.getDayOfWeek();
        return dayOfWeek;
    }

    public void addProduct(String product) {
        availableProducts.add(product);
    }

    public void removeProduct(String product) {
        availableProducts.remove(product);
    }

    public Set<String> getAvailableProducts() {
        return availableProducts;
    }
}
