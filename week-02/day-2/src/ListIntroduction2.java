import java.util.ArrayList;

public class ListIntroduction2 {
    public static void main(String[] args) {
        ArrayList <String> ListA = new ArrayList<>();

        ListA.add("Apple");
        ListA.add("Avocado");
        ListA.add("Blueberries");
        ListA.add("Durian");
        ListA.add("Lychee");

        ArrayList <String> ListB = new ArrayList<>();
        ListB.addAll(ListA);
        for (String list : ListB) {
            System.out.println(list);
        }

        System.out.println();

        ListA.remove("Durian");

        ListA.add(3 + 1, "Kiwifruit");      // add after index 3
        System.out.println(ListA.get(4));

        System.out.println();

        if (ListA.size() > ListA.size()) {
            System.out.println("ListA list is bigger than ListB");
        } else{
            System.out.println("ListB list is bigger than ListA");
        }
        System.out.println();

        System.out.println("The index of Avocado is: " + ListA.indexOf("Avocado"));
        System.out.println("The index of Durian is: " + ListA.indexOf("Durian"));

        System.out.println();

        ListB.add("Passion Fruit");
        ListB.add("Pomelo");

        for (String listSecond : ListB) {
            System.out.println(listSecond);
        }

        System.out.println();

        System.out.println("The third element of ListA is: " + ListA.get(2));
    }

}
