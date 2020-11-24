import java.sql.SQLOutput;
import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("William");

        System.out.println("The number of elements in the list is: " + names.size());
        System.out.println();
        if (names == null) {
            System.out.println("The list is empty");
        } else {
            System.out.println("The list is not empty.");
        }
        System.out.println();
        names.add("John");
        names.add("Amanda");

        System.out.println("The number of elements in the list is: " + names.size());
        System.out.println();
        System.out.println("The third element of the list is " + names.get(2) + ".");
        System.out.println();
        for (int i = 0; i < names.size(); i++) {        // printing each name
            System.out.println((i + 1) + ". " + names.get(i));
        }

        System.out.println(

        );
        for (String name : names) {             // printing the list
            System.out.println(name);

        }
        System.out.println();

        names.remove(1);

        for (int j = names.size() - 1; j >= 0; j--) {
            System.out.println(names.get(j));
        }
        System.out.println();

        names.clear();

        if (names.size() == 0) {
            System.out.println("The list is now empty.");
        } else {
            System.out.println("The list is not empty yet.");
        }
        for (String nev : names) {

            System.out.println(nev);
        }
    }
}
