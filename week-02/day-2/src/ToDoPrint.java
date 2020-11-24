public class ToDoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        String todoWithColon = "My todo:\n";
        String downloadGames = " - Download games\n";
        String diablo = " - Diablo";
        todoText = todoWithColon + todoText + downloadGames + diablo.indent(3);

        System.out.println(todoText);
    }
}
