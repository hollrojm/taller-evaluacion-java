package co.com.sofka.exercise12;

import java.util.Scanner;

public final class RunCompareWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la primera palabra: ");
        String wordOne = scanner.nextLine();
        System.out.print("Ingresa la segunda palabra: ");
        String wordTwo = scanner.nextLine();

        Words words = new Words(wordOne, wordTwo );
        words.compareEquals();


    }
}
