package co.com.sofka.exercise8;

import java.util.Locale;
import java.util.Scanner;

public final class Day {
    Scanner scanner = new Scanner(System.in);
    private String day = scanner.nextLine().toLowerCase();

    public Day() {
        this.day = day;
    }
    public void workingDay() {
        try {
            System.out.print("Introduzca un dia de la semana: ");



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

        } catch (Exception e) {
            System.out.println("Introduce un dia valido!!!!");
        }
    }
}
