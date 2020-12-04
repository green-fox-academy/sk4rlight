// We have bunnies standing in a line,
// numbered 1, 2, 3, 4, ...
// The odd bunnies (1, 3, ...) have the normal 2 ears.
// The even bunnies (2, 4, ..) we'll say have 3 ears,
// because they each have a raised foot.
// Recursively return the number of "ears" in
// the bunny line 1, 2, ... n (without loops or multiplication).

public class BunniesAgain {

    public static void main(String[] args) {

        int n = 4;
        int oddEars = 2;
        int evenEars = 3;

        System.out.println(countTheEars(n, evenEars, oddEars));

    }

    public static int countTheEars(int n, int a, int b) {

        if (n == 1) {
            return a;
        } else if (n > 1 && (n % 2) == 0) {
            return countTheEars(n - 1, a, b) + b;
        } else if (n > 1 && (n % 2) == 1) {
            return countTheEars(n - 1, a, b) + a;
        } else {
            return countTheEars(n - 1, a, b);
        }
    }


}
