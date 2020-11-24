public class TakesLonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occurred. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        System.out.println(quote);

        int indexYou = quote.indexOf("you");
        String subQuote1 = quote.substring(0, indexYou - 1);
        String subQuote2 = quote.substring(indexYou, quote.length());

        System.out.println(indexYou);
        System.out.println(subQuote1);
        System.out.println(subQuote2);
        System.out.println();
        quote = subQuote1 + " always takes longer than " + subQuote2;

        System.out.println(quote);
    }
}
