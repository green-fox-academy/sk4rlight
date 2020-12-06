package ClassesAsFields;


import EncapsulationAndConstructor.Sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    Sharpie sharpieOne = new Sharpie(0);
    Sharpie sharpieTwo = new Sharpie(2);
    Sharpie sharpieThree = new Sharpie(0);
    Sharpie sharpieFour = new Sharpie(4);
    Sharpie sharpieFive = new Sharpie(0);
    Sharpie sharpieSix = new Sharpie(6);
    Sharpie sharpieSeven = new Sharpie(7);

    List<Sharpie> listOfSharpies = new ArrayList<>();

    public SharpieSet() {
        this.listOfSharpies = new ArrayList<>();
    }

    public void add(Sharpie sharpie) {
        listOfSharpies.add(sharpie);
    }

   /* public int countUsable(){
        int number = 0;
        for (Sharpie sharpie : this.listOfSharpies) {
            if (sharpie.isUsable() == true) {
                number++;
            }
        }
        return number;
    }

    public void removeTrash(){
        for (Sharpie sharpie : this.listOfSharpies) {
            if (sharpie.isUsable() == false) {
                listOfSharpies.remove(sharpie);
            } else {

            }
        }
    }

    */

    public static void main(String[] args) {



        SharpieSet sharpieSet = new SharpieSet();

        sharpieSet.add(sharpieSet.sharpieOne);
        sharpieSet.add(sharpieSet.sharpieTwo);
        sharpieSet.add(sharpieSet.sharpieThree);
        sharpieSet.add(sharpieSet.sharpieFour);
        sharpieSet.add(sharpieSet.sharpieFive);
        sharpieSet.add(sharpieSet.sharpieSix);
        sharpieSet.add(sharpieSet.sharpieSeven);

    //    System.out.println(sharpieSet.countUsable());
    //    sharpieSet.removeTrash();
        System.out.println(sharpieSet);
    }
}
