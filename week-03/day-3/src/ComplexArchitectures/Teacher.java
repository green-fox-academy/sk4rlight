package ComplexArchitectures;

public class Teacher {

    String text = "...is answering a question...";

    public void teach() {
        System.out.println(this.text);
    }

    public Teacher() {

    }

    public Teacher answer(Student method){
        System.out.println("text " + method);

    }
}
