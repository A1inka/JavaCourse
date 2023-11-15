package homework6.task11;

import java.time.DayOfWeek;
import java.util.Set;

public class Kitchener {
    private String fullName;
    private Set<DayOfWeek> workingDays;

    public Kitchener(String fullName, Set<DayOfWeek> workingDays) {
        this.fullName = fullName;
        this.workingDays = workingDays;
    }

    public Set<DayOfWeek> getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(Set<DayOfWeek> workingDays) {
        this.workingDays = workingDays;
    }

    public String getFullName() {
        return fullName;
    }
}
