package co.com.sofka.exercise11;

import java.util.Scanner;

public final class Length {
    Scanner scanner = new Scanner(System.in);

    private int count = 0;
    public Length() {

    }

    public String  PhraseLength(){
        System.out.print("Ingrese la palabra a validar: ");
        String sentence = scanner.nextLine();
        for (int i=0; i<sentence.length(); i++)
            if(sentence.charAt(i)=='a' ||
                    sentence.charAt(i)=='e' ||
                    sentence.charAt(i)=='i' ||
                    sentence.charAt(i)=='o' ||
                    sentence.charAt(i)=='u'){
                count++;
            }
        return "En la frase ingresada tiene  " + sentence.length() + " caracteres y  "+ count + " vocales";
        }
    }


