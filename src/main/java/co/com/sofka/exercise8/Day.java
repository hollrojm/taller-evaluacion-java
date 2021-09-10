package co.com.sofka.exercise8;

import java.util.Locale;
import java.util.Scanner;

public final class Day {

    private String day;

    public Day(String day) {
        this.day = day;
    }

    public void workingDay() {

            switch (day) {
                case "lunes":
                case "martes":
                case "miercoles":
                case "jueves":
                case "viernes":
                    System.out.println("Es un dia laboral!!!");
                    break;
                case "sabado":
                case "domingo":
                    System.out.println("Este dia no es laboral");
                default:
                    System.out.println("Introduce un dia valido!!!");

            }
    }
}
