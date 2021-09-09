package co.com.sofka.exercise7;

import java.util.Scanner;

public final class GreaterZero {
    private double number = 0;

    public GreaterZero() {
        this.number = 0;
    }


    public void compareNumber() {

        do {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Introduce un numero mayor que 0: ");
            try {
                this.number = scanner.nextDouble();

            }catch (Exception e){
                System.out.println("Tienes que introducir números");
                }
            System.out.println("El numero que ingresaste es: " + this.number);


        } while (number <= 0);



    }

}
