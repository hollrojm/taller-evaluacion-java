package co.com.sofka.exercise17;

public class WashingMachine extends Appliance {

    public static final float cargaPorDefecto = 5;

    private float carga;

    public WashingMachine(){
        super();
        this.carga = cargaPorDefecto;
    }

    public WashingMachine(float precio, float peso){
        super(precio, peso);
        this.carga = cargaPorDefecto;
    }

    public WashingMachine(float carga){
        super();
        this.carga = carga;
    }

    @Override
    public float precioFinal() {
        float precioFinal = super.precioFinal();

        if(this.carga > 30){
            precioFinal += 50;
        }

        return precioFinal;
    }

    public float getCarga() {
        return carga;
    }

}
