public class UpperCaseCharacters {
    public static void main(String[] args) {
        /*
    Exercise 6
    Write a Stream Expression to find the uppercase characters in a string!
     */
        String text = "ABcdEFghIJKLmnoPQRst";


        text.chars()
                //    .filter(Character::isUpperCase)
                //    .filter(x -> Character.isUpperCase(x));
                .filter(Character::isUpperCase)
                .mapToObj(x -> (char) x)
                .forEach(System.out::println);


    }

}
