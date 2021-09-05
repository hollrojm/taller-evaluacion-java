package co.com.sofka.exercise4;

/*
 *  Lee un número por teclado que pida el precio de un producto
 *  (puede tener decimales) y calcule el precio final con IVA.
 *  El IVA sera una constante que sera del 21%.
 * */

public final class Product {
    //atribute
    private final double IVA = 0.21;
    private double productPrice;

    public Product(double price) {
        this.productPrice = price;
    }
    public double calculatePrice(){
        return this.productPrice + (this.productPrice*this.IVA);
    }

}
