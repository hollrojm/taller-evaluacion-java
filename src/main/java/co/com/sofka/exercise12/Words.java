package co.com.sofka.exercise12;

import java.util.Scanner;

public final class Words {
    private String wordOne;
    private String wordTwo;
    private int count;

    public Words(String wordOne, String wordTwo) {
        this.wordOne = wordOne;
        this.wordTwo = wordTwo;
        this.count = 0;
    }

    public String getWordOne() {
        return wordOne;
    }

    public void setWordOne(String wordOne) {
        this.wordOne = wordOne;
    }

    public String getWordTwo() {
        return wordTwo;
    }

    public void setWordTwo(String wordTwo) {
        this.wordTwo = wordTwo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean compareWords() {


        if (getWordOne().equals(getWordTwo())) {
            return true;
        } else
            return false;

    }

    public void compareEquals() {
        if (compareWords()) {
            System.out.print("La palabra " + getWordOne() + " y " + getWordTwo() + " son iguales!!!");

        } else if (this.wordOne.length() >= this.wordTwo.length()) {
            System.out.print("La palabra " + this.wordOne + " se diferencia de la palabra " + this.wordTwo + " en las letras: ");

            for (int i = 0; i < this.wordOne.length(); i++) {
                for (int j = 0; j < this.wordTwo.length(); j++) {
                    if (this.wordOne.charAt(i) == this.wordTwo.charAt(j)) break;
                    else if (this.wordOne.charAt(i) != this.wordTwo.charAt(j))
                        this.count++;

                    if (this.count == this.wordTwo.length())
                        System.out.println(this.wordOne.charAt(i));
                }
                this.count = 0;
            }
        } else {
            System.out.print("La palabra " + this.wordTwo + " se diferencia de la palabra " + this.wordOne + " en las letras:  ");
            for (int i = 0; i < this.wordTwo.length(); i++) {
                for (int j = 0; j < this.wordOne.length(); j++) {
                    if (this.wordTwo.charAt(i) == this.wordOne.charAt(j)) break;
                    else if (this.wordTwo.charAt(i) != this.wordOne.charAt(j)) this.count++;

                    if (this.count == this.wordOne.length()) System.out.print(this.wordTwo.charAt(i));
                }
                this.count = 0;

            }
        }
    }
}
