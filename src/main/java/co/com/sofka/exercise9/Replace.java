package co.com.sofka.exercise9;

public final class Replace {
    private String text = "La sonrisa sera la mejor arma contra la tristeza,";
    public Replace() {
        this.text = text;
    }
    public String replaceText(){
       this.text =  text.replace('a','e');
        return  this.text + " nunca dejes sonreir...";
    }
}
