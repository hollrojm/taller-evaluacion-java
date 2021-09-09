package co.com.sofka.exercise13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class DateTime {
    public static void main(String[] args) {
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm");
        System.out.println("yyyy/MM/dd hh:mm:ss -> "+dtf5.format(LocalDateTime.now()));
    }
}
