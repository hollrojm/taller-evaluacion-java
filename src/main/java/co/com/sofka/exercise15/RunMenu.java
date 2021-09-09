package co.com.sofka.exercise15;

import java.util.Scanner;

public final class RunMenu {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        menu.getMenu();
        try{
            System.out.println("Ingresa una de las opciones: ");
            int option = scanner.nextInt();

            do{
                menu.setOption(option);
                menu.optionMenu();

                System.out.println("Ingresa una de las opciones: ");
                option = scanner.nextInt();

            }while (menu.getOption() != 8);

        }catch (Exception e){
            System.out.println("Debes ingresar un numero ENTRE 1 Y 8!!!");

        }

    }
}
