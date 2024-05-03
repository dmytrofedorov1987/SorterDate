import sample.DateSorter;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LocalDate dateOne = LocalDate.of(2004, 07, 01);
        LocalDate dateTwo = LocalDate.of(2005, 01, 02);
        LocalDate dateThree = LocalDate.of(2007, 01, 01);
        LocalDate dateFour = LocalDate.of(2032, 05, 03);

        List<LocalDate> dates = List.of(dateOne, dateTwo, dateThree, dateFour);

        DateSorter sorter = new DateSorter();
        System.out.println(sorter.sortDates(dates));


    }
}