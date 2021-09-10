import co.com.sofka.exercise1.Exercise1;
import co.com.sofka.exercise10.Remove;
import co.com.sofka.exercise11.Length;
import co.com.sofka.exercise12.Words;
import co.com.sofka.exercise13.DateTimeNow;
import co.com.sofka.exercise14.Pairs;
import co.com.sofka.exercise15.Menu;
import co.com.sofka.exercise16.Person;
import co.com.sofka.exercise17.ExeElectrodomestico;
import co.com.sofka.exercise2.Exercise2;
import co.com.sofka.exercise3.CircleArea;
import co.com.sofka.exercise4.Product;
import co.com.sofka.exercise5.ParImpar;
import co.com.sofka.exercise6.ParImparFor;
import co.com.sofka.exercise7.GreaterZero;
import co.com.sofka.exercise8.Day;
import co.com.sofka.exercise9.Replace;


import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        Scanner ScannerOpt = new Scanner(System.in);
        System.out.print("Ingresa el ejercicio a validar: )");
        int opcion = ScannerOpt.nextInt();
        switch (opcion) {
            case 1:
                Exercise1 exercise1 = new Exercise1(1, 5);
                System.out.println(exercise1.compareNumber());
                break;
            case 2:
                Scanner scanner1 = new Scanner(System.in);
                double number1 = scanner1.nextDouble();
                double number2 = scanner1.nextDouble();
                Exercise2 exercise2 = new Exercise2(number1, number2);
                System.out.println(exercise2.compareNumber());
                break;
            case 3:
                Scanner scanner2 = new Scanner(System.in);
                double radio;
                System.out.print("Ingrese el radio del circulo a calcular: ");
                radio = Double.parseDouble(scanner2.nextLine());
                CircleArea circleArea = new CircleArea(radio);
                System.out.println("El area del circulo es: " + circleArea.areaCalculate());
                scanner2.close();

                break;
            case 4:
                double finalPrice;
                Scanner inputPrice = new Scanner(System.in);
                System.out.print("Ingrese el valor del producto: ");
                finalPrice = inputPrice.nextDouble();
                Product product = new Product(finalPrice);
                System.out.print("El precio del producto final es: " + product.calculatePrice());

                break;
            case 5:
                ParImpar parImpar = new ParImpar();
                parImpar.separate();
                break;

            case 6:
                ParImparFor parImparFor = new ParImparFor();
                parImparFor.separate();
                break;
            case 7:
                GreaterZero greaterZero = new GreaterZero();
                greaterZero.compareNumber();
            case 8:
                Day day = new Day();
                day.workingDay();
                break;
            case 9:
                Replace replace = new Replace();
                System.out.println(replace.replaceText());
                break;
            case 10:
                Remove remove = new Remove();
                System.out.println(remove.removeSpaces());

                break;

            case 11:
                Length length = new Length();
                System.out.println(length.PhraseLength());

                break;
            case 12:

                Scanner scanner4 = new Scanner(System.in);
                System.out.print("Ingresa la primera palabra: ");
                String wordOne = scanner4.nextLine();
                System.out.print("Ingresa la segunda palabra: ");
                String wordTwo = scanner4.nextLine();

                Words words = new Words(wordOne, wordTwo);
                words.compareEquals();
                break;

            case 13:

                DateTimeNow dateTimeNow = new DateTimeNow();
                System.out.println(dateTimeNow.getDateTimeNow());

                break;

            case 14:
                System.out.println("Ingrese un numero: ");
                Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();
                Pairs pairs = new Pairs(number);
                pairs.inPairs();

                break;
            case 15:
                Menu menu = new Menu();
                Scanner scanner5 = new Scanner(System.in);
                menu.getMenu();
                try {
                    System.out.println("Ingresa una de las opciones: ");
                    int option = scanner5.nextInt();

                    do {
                        menu.setOption(option);
                        menu.optionMenu();

                        System.out.println("Ingresa una de las opciones: ");
                        option = scanner5.nextInt();

                    } while (menu.getOption() != 8);

                } catch (Exception e) {
                    System.out.println("Debes ingresar un numero ENTRE 1 Y 8!!!");

                }


                break;

            case 16:
                Person personThree = new Person();
                personThree.setName("Hollman");
                personThree.setAge(37);
                personThree.setSex('H');
                personThree.setWeight(70.5);
                personThree.setHeight(176.5);


                Scanner scanner6 = new Scanner(System.in);
                System.out.print("Ingresa nombre: ");
                String name = scanner6.nextLine();
                System.out.print("Ingresa edad: ");
                int age = scanner6.nextInt();
                System.out.print("Ingrese sexo: ");
                char sex = scanner6.next().charAt(0);
                System.out.print("Ingresa tu peso en Kgs: ");
                Double weight = scanner6.nextDouble();
                System.out.print("Ingresa tu a altura en metros: ");
                Double height = scanner6.nextDouble();
                Person person = new Person(name, age, sex, weight, height);
                Person personTwo = new Person(name, age, sex);


                System.out.println("Persona1");
                person.workoutIMC();
                person.viewOlderAge(person);
                System.out.println(person.toString());

                System.out.println("Persona2");
                personTwo.workoutIMC();
                person.viewOlderAge(personTwo);
                System.out.println(personTwo.toString());


                System.out.println("Persona2");
                personThree.workoutIMC();
                person.viewOlderAge(personThree);
                System.out.println(personThree.toString());


                break;

            case 17:
                ExeElectrodomestico exeElectrodomestico = new ExeElectrodomestico();
                exeElectrodomestico.ArregloElectrodomestico();
                exeElectrodomestico.PrecioElectrodomesticos();
                break;

            case 18:
                break;
            case 19:
                System.out.println("Gracias por su atencion hasta pronto...");
                break;

            default:
                System.out.println("Opcion Invalida");
        }

    }
    }
