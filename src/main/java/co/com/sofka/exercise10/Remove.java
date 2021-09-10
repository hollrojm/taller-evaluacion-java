package co.com.sofka.exercise10;

import java.util.Scanner;

public final class Remove {
    Scanner scanner = new Scanner(System.in);

    private String noSpaces ="";

    public Remove() {
        this.scanner = scanner;

    }
    public String removeSpaces(){
        System.out.print("Ingresa una frase de varias palabras: ");
        String text = scanner.nextLine();
            for(int i=0;i<text.length();i++){
                char remove = text.charAt(i);
                if(remove != ' '){
                    noSpaces += String.valueOf(remove);
                }
            }
            return noSpaces;
    }
}
