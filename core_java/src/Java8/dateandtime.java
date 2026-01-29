package Java8;

import java.time.*;

public class dateandtime
{
    static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("DateTime: " + dateTime);
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current time in India: " + zonedDateTime);
        ZonedDateTime nyTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current time in New York: " + nyTime);
        LocalDate start = LocalDate.of(2026, 1, 1);
        LocalDate end = LocalDate.of(2026, 1, 21);
        Period period = Period.between(start, end);
        System.out.println("Period: " + period.getDays() + " days");
        Duration duration = Duration.ofHours(5);
        System.out.println("Duration: " + duration.toHours() + " hours");
    }
}
