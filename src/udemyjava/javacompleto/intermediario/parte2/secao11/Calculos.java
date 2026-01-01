package udemyjava.javacompleto.intermediario.parte2.secao11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.Duration;

public class Calculos {
    public static void main(String[] args) {

        LocalDate d1 = LocalDate.parse("2022-07-20");
        LocalDateTime d2 = LocalDateTime.parse("2022-07-20T16:30:26");
        Instant d3 = Instant.parse("2022-07-20T16:30:26Z");
        LocalDate pastWeekLocalDate = d1.minusWeeks(1);
        LocalDate nextWeekLocalDate = d1.plusYears(7);
        //System.out.println(pastWeekLocalDate);
        //System.out.println(nextWeekLocalDate);
        LocalDateTime pastWeekLocalDateTime = d2.minusWeeks(1);
        LocalDateTime nextWeekLocalDateTime = d2.plusYears(7);
        //System.out.println(pastWeekLocalDateTime);
        //System.out.println(nextWeekLocalDateTime);
        Instant pastWeekInstant = d3.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d3.plus(7, ChronoUnit.DAYS);
        //System.out.println(pastWeekInstant);
        //System.out.println(nextWeekInstant);
        Duration t1 = Duration.between(pastWeekLocalDateTime, d2);
        Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d1.atStartOfDay());
        Duration t3 = Duration. between(pastWeekInstant, d3);
        Duration t4 = Duration. between(d3, pastWeekInstant);
        System.out.println(t1.toDays());
        System.out.println(t2.toDays());
        System.out.println(t3.toDays());
        System.out.println(t4.toDays());



    }
}
