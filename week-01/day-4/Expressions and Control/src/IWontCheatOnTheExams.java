public class IWontCheatOnTheExams {
    public static void main(String[] args) {
        // Create a program that writes this line 100 times:
        // "I won't cheat on the exam!"
        int a = 1;
        while (a < 101) {
            System.out.println("I won't cheat on the exam!" + " #" + a);
            a += 1;
        }
    }
}
