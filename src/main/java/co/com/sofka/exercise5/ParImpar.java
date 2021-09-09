package co.com.sofka.exercise5;

/*
Muestra los números impares y pares del 1 al 100
(ambos incluidos). Usa un bucle while.*/

public  class ParImpar {
    protected int count;

    public ParImpar() {
        this.count = 1;
    }

    public void separate() {
        while (true) {
            while (count <= 100) {
                if (count %2 == 0) {
                    System.out.print(count + " ");
                }
                count++;


            }
            count = 1;
            System.out.println();
            while (count <= 100) {
                if (count %2 != 0) {
                    System.out.print(count + " ");
                }
                count++;
            }

            break;

        }
    }


}

