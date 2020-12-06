package EncapsulationAndConstructor;

public class Sharpie {
    String color;
    double width;
    double inkAmount = 100;

    public Sharpie(String color, double width) {
        this.color = color;
        this.width = width;
    }

    public Sharpie(double inkAmount) {

        this.inkAmount = inkAmount;
    }

    public void eat(double dec) {

        inkAmount = inkAmount - dec;
    }

  /*  public boolean isUsable() {
        boolean usable;
        if (this.inkAmount >= 0) {
            usable = true;
        } else {
            usable = false;
        }
        return usable;
    } */


}
