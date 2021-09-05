package co.com.sofka.exercise3;

import java.util.Scanner;

public final class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radio;
        System.out.print("Ingrese el radio del circulo a calcular: ");
        radio = Double.parseDouble(scanner.nextLine());
        CircleArea circleArea = new CircleArea(radio);
        System.out.println("El area del circulo es: "+ circleArea.areaCalculate());
        scanner.close();

    }


}
