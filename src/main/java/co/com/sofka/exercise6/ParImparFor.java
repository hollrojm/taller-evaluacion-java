package co.com.sofka.exercise6;

import co.com.sofka.exercise5.ParImpar;

public final class ParImparFor extends ParImpar {
    public ParImparFor() {
        super();
    }

    @Override
    public void separate() {


            for (int j = 1; j<=100; j++){
                if (j % 2 == 0) System.out.print( + j + " ");

            }
            System.out.println();
            for (int k = 1; k<=100; k++){
            if (k % 2 != 0) System.out.print( + k+ " ");
            }

    }
}
