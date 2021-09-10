package co.com.sofka.exercise15;

public final class Menu {
    private int option;
    private boolean exit = false;

    public Menu() {

    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public void getMenu() {

        System.out.println(
                "****** GESTION CINEMATOGRÁFICA ******** \n" +
                        "1-NUEVO ACTOR \n" +
                        "2-BUSCAR ACTOR\n" +
                        "3-ELIMINAR ACTOR\n" +
                        "4-MODIFICAR ACTOR\n" +
                        "5-VER TODOS LOS ACTORES\n" +
                        "6- VER PELICULAS DE LOS ACTORES\n" +
                        "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                        "8-SALIR");

    }

    public void optionMenu() {
        switch (this.option) {
            case 1:
            case 2:
            case 4:
            case 3:
            case 5:
            case 6:
            case 7:
                getMenu();
                break;
            case 8:
                System.out.println("Gracias por utilizar nuestros servicios...Feliz dia");
                break;
            default:
                System.out.println("OPCION INCORRECTA!!!");
        }

    }

}
