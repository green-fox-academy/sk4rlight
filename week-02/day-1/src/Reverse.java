public class Reverse {
// - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `numbers`
// - Print the elements of the reversed `numbers`

    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 6, 7};
        for (int i = numbers.length - 1; i > -1; i--) {
            System.out.println(numbers[i]);
        }
    }

}
