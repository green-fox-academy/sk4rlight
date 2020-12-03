package ComplexArchitectures;

public class TeacherAndStudent {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();

        student.question(teacher.answer());
        teacher.answer(student.question());



    }





}
