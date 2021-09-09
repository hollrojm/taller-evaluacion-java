package co.com.sofka.exercise13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class DateTimeNow {
    public DateTimeNow() {

    }
    public String getDateTimeNow(){

        DateTimeFormatter dateNow = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm");
        return "La fecha actual es -> "+dateNow.format(LocalDateTime.now());

    }
}
