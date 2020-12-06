package ComplexArchitectures;

public class TeacherAndStudent {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();

        student.learn();
        teacher.answer();

        student.question(teacher);
        teacher.teach(student);


    }





}
