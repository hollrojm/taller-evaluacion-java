package co.com.sofka.exercise17;

import java.util.ArrayList;

public class ExeElectrodomestico {

    ArrayList<Appliance> electrodomesticos;

    public ExeElectrodomestico(){

        electrodomesticos = new ArrayList<>();
    }

    public void ArregloElectrodomestico(){

        Appliance electrodomestico_1 = new Appliance();
        Appliance electrodomestico_2 = new Appliance(300, 12);
        Appliance      electrodomestico_3 = new Appliance(220, 15, Appliance.negro, Appliance.B);
        WashingMachine lavadora_1         = new WashingMachine();
        WashingMachine lavadora_2         = new WashingMachine(215, 8);
        WashingMachine lavadora_3         = new WashingMachine(98);
        Tv             tv_1               = new Tv();
        Tv tv_2 = new Tv(500, 10);
        Tv tv_3 = new Tv(55, true);
        Tv tv_4 = new Tv(90, true);

        electrodomesticos.add(electrodomestico_1);
        electrodomesticos.add(electrodomestico_2);
        electrodomesticos.add(electrodomestico_3);
        electrodomesticos.add(lavadora_1);
        electrodomesticos.add(lavadora_2);
        electrodomesticos.add(lavadora_3);
        electrodomesticos.add(tv_1);
        electrodomesticos.add(tv_2);
        electrodomesticos.add(tv_3);
        electrodomesticos.add(tv_4);

    }

    public void PrecioElectrodomesticos(){

        float Electrodomesticos = 0;
        float precioLavadoras = 0;
        float precioTvs = 0;

        for(int i = electrodomesticos.size() -1; i >= 0; i--){
            if(electrodomesticos.get(i) instanceof Tv){
                System.out.println("Precio del tv en la posicion "+ i +": " + electrodomesticos.get(i).precioFinal());
                precioTvs += electrodomesticos.get(i).precioFinal();
            }else if (electrodomesticos.get(i) instanceof WashingMachine){
                System.out.println("Precio de la lavadora en la posicion" + i + ": " + electrodomesticos.get(i).precioFinal());
                precioLavadoras += electrodomesticos.get(i).precioFinal();
            }else{
                System.out.println("Precio del electrodomestico en la posicion" +i+": " + electrodomesticos.get(i).precioFinal());
                Electrodomesticos += electrodomesticos.get(i).precioFinal();
            }

        }

        System.out.println("Precio tvs: " + precioTvs);
        System.out.println("Precio lavadoras: " + precioLavadoras);
        System.out.println("Precio electrodomesticos: " + (precioTvs + precioLavadoras + Electrodomesticos));
    }
}
