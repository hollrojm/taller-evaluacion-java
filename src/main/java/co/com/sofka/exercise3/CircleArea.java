package co.com.sofka.exercise3;

public final class CircleArea {
    private double radio;

    public CircleArea(double radio) {
        this.radio = radio;
    }

    public double areaCalculate(){
        return Math.PI * Math.pow(this.radio,2);
    }
}
