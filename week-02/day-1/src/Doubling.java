public class Doubling {
    public static void main(String[] args) {
        int baseNum = 123;
        doubling(baseNum);
        System.out.println("The double of the base number is: " + doubling(baseNum));
    }
    // - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`

    public static int doubling(int n1) {
        int db;
        db = 2 * n1;
        return db;
    }
}

