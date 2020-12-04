// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears
// across all the bunnies recursively (without loops or multiplication).

public class Bunnies {

    public static void main(String[] args) {

        int n = 37;
        int ears = 2;

        System.out.println(countTheEars(n, ears));
    }

    public static int countTheEars(int n, int ears){
        if (n == 1){
            return ears;
        } else {
            return countTheEars(n-1, ears) + ears;
        }

    }
}
