package DataStructure;

public class PostIt {

    String backgroundColor;
    String text = "text";
    String textColor;


    public PostIt(String backgroundColor, String text, String textColor) {
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }

    public PostIt() {
    }


    public static void main(String[] args) {
        PostIt objectOne = new PostIt("Orange", "Idea 1", "blue");
        PostIt objectTwo = new PostIt();
            objectTwo.backgroundColor = "pink";
            objectTwo.text = "Awesome";
            objectTwo.textColor = "black";
        PostIt objectThree = new PostIt("yellow", "Superb", "green");

    }
}