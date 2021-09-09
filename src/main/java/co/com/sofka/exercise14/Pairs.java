package co.com.sofka.exercise14;

public final class Pairs {
    private int number = 0;
    int numberLimit = 1000;

    public Pairs(int number) {
        this.number = number;
    }

    public void inPairs() {
        while (this.number <= this.numberLimit) {
            if (this.number % 2 == 0) {
                System.out.println(this.number);
            }
            number++;
        }

    }
}
