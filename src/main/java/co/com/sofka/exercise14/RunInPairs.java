package co.com.sofka.exercise14;

import java.util.Scanner;

public final class RunInPairs {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Pairs pairs = new Pairs(number);
        pairs.inPairs();
    }
}
