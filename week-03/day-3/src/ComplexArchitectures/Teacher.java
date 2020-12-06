package ComplexArchitectures;

public class Teacher {

    public void answer(){
        System.out.println("The teacher is answering a question...");
    }

    public void teach(Student std){
        std.learn();
    }


}
