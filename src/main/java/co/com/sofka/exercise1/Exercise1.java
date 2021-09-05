package co.com.sofka.exercise1;

public class Exercise1 {
    double number1;
    double number2;

    public Exercise1(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public String compareNumber(){
        if (number1 >= number2){
            if(number1 == number2){
                return "El numero " + this.number1 + " y el numero " + this.number2 + " son iguales";
            }else {
                return "El numero " + this.number1 + " es mayor que el numero " + this.number2;
            }
            }else{
                return "El numero " + this.number2 +" es mayor que el numero " + this.number1;
        }
    }
}
