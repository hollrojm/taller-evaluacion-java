package co.com.sofka.exercise4;


import java.util.Scanner;

public final class RunExercise4 {
    public static void main(String[] args) {
        double finalPrice;
        Scanner inputPrice = new Scanner(System.in);
        System.out.print("Ingrese el valor del producto: ");
        finalPrice = inputPrice.nextDouble();
        Product product = new Product(finalPrice);
        System.out.print("El precio del producto final es: " + product.calculatePrice());
    }

}
