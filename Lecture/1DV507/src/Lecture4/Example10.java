package Lecture4;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Example10 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today it is " + today);
        System.out.println("Tomorrow will be " + today.plusDays(1));
        System.out.println("Next week it will be " + today.plusWeeks(1));
        System.out.println("The day is " + today.getDayOfWeek());

        if (today.isLeapYear()) {
            System.out.println("The is a leap year.");
        }
        else
            System.out.println("This is not a leap year.");

        Period until = today.until(LocalDate.of(2020, Month.FEBRUARY, 21));
        System.out.println("Time before Star Wars: The Clone Wars Season 7: " + until.getYears() +
                " year(s), " + until.getMonths() + " months and " + until.getDays() + " days.");
    }
}
