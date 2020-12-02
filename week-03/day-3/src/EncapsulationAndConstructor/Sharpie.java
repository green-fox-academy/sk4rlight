package EncapsulationAndConstructor;

public class Sharpie {
    String color;
    double width;
    double inkAmount = 100;

    public Sharpie (String color, double width){
        this.color = color;
        this.width = width;
    }

    public void eat(double dec){
        inkAmount = inkAmount - dec;
    }











}
