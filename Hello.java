import java.time.LocalDateTime;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

class Hello{
    public static void main(String[] args) {
        NavigableSet<LocalDateTime> appointments = new TreeSet<>();
        appointments.add(LocalDateTime.of(2023, 3,4,10,30));
        appointments.add(LocalDateTime.of(2023, 3,4,11,0));
        appointments.add(LocalDateTime.of(2023, 3,4,11,30));
        appointments.add(LocalDateTime.of(2023, 3,4,12,0));

        LocalDateTime nextAppt = appointments.ceiling(LocalDateTime.of(2023, 3, 4, 10, 45));
        System.out.println("next appointment = " + nextAppt);
    }
}