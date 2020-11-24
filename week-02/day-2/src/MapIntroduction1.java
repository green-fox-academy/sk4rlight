import java.util.HashMap;

public class MapIntroduction1 {

    public static void main(String[] args) {
        HashMap<Integer, Character> justMap = new HashMap();

        if (justMap.isEmpty()) {
            System.out.println("HashMap is empty.");
        } else {
            System.out.println("HashMap is not empty.");
        }

        justMap.put(97, 'a');
        justMap.put(98, 'b');
        justMap.put(99, 'c');
        justMap.put(65, 'A');
        justMap.put(66, 'B');
        justMap.put(67, 'C');

        for (Integer map : justMap.keySet()) {
            System.out.println(map);
        }

        justMap.put(68, 'D');

        System.out.println(justMap.size() + " amount of key-value pairs are in the map.");

        System.out.println("The value associated with key 99 is: " + justMap.get(99));

        justMap.remove(97);

        if (justMap.get(100) == null) {
            System.out.println("There is no associated value-key pair for key 100.");
        }   else {
            System.out.println("The value-key pair for key 100 is: " + justMap.get(100));
        }

        justMap.clear();

    }


}
