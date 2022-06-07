import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Sort mySort = new Sort();

        List<LocalDate> unsortedDates = new ArrayList<>();
        unsortedDates.add(LocalDate.of(2005,07,01));
        unsortedDates.add(LocalDate.of(2005,01,02));
        unsortedDates.add(LocalDate.of(2005,01,01));
        unsortedDates.add(LocalDate.of(2005,05,03));
        unsortedDates.add(LocalDate.of(2005,8,13));
        unsortedDates.add(LocalDate.of(2005,8,14));
        unsortedDates.add(LocalDate.of(2005,12,24));
        unsortedDates.add(LocalDate.of(2022,05,24));
        unsortedDates.add(LocalDate.of(2022,9,24));

        System.out.println("------------------------------------------");
        System.out.println("Show unsorted list");
        System.out.println(unsortedDates);
        System.out.println("------------------------------------------");
        System.out.println("Show sorted list");
        System.out.println(mySort.sortDates(unsortedDates));
    }
}
