public class PrintEven {
    public static void main(String[] args) {
        // Create a program that prints all the even numbers between 0 and 500

        int numbers = 0;
        while (numbers < 501) {
            if (numbers % 2 == 0) {
                System.out.println(numbers);
                numbers += 1;
            }
            numbers += 1;
        }
    }
}
