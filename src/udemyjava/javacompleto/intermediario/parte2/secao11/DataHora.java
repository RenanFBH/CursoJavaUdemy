package udemyjava.javacompleto.intermediario.parte2.secao11;

import javax.swing.text.DateFormatter;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHora {

    public static void main(String[] args) {

        //https://docs.oracle.com/javase/10/docs/api/java/text/SimpleDateFormat.html
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        LocalDate d1 = LocalDate.now();
        LocalDateTime d2 = LocalDateTime.now();
        Instant d3 = Instant.now();

        LocalDate d4 = LocalDate.parse("2007-09-28");
        LocalDateTime d5 = LocalDateTime.parse("2007-09-28T18:30:26");
        Instant d6 = Instant.parse("2007-09-28T23:30:26Z");
        Instant d7 = Instant.parse("2007-09-28T18:30:26-03:00");

        LocalDate d8 = LocalDate.parse("28/09/2007", dtf);
        LocalDateTime d9 = LocalDateTime.parse("28/09/2007 06:29:01", dtf2);
        LocalDate d10 = LocalDate.parse("28/09/2007", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        LocalDate d11 = LocalDate.of(2022, 7, 20);
        LocalDateTime d12 = LocalDateTime.of(2022, 7, 20, 1, 30);

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter dtf6 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter dtf7 = DateTimeFormatter.ISO_INSTANT;

        System.out.println(d4.format(dtf));
        System.out.println(dtf3.format(d4));
        System.out.println(d4.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println(d5.format(dtf4));
        System.out.println(d5.format(dtf3));
        System.out.println(d5.format(dtf6));

        System.out.println(dtf5.format(d6));
        System.out.println(dtf7.format(d6));

        LocalDate r1 = LocalDate.ofInstant(d6, ZoneId.systemDefault());
        LocalDateTime r2 = LocalDateTime.ofInstant(d6, ZoneId.of("Portugal"));
        System.out.println(r1);
        System.out.println(d2.getYear());
        System.out.println(d1.getDayOfMonth());
        System.out.println(d8.getMonth());


    }

}
