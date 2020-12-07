package GreenFoxOrganization;

public class Student extends Person {

    String previousOrganization;
    Integer skippedDays;

    public Student(String name, Integer age, String gender) {
        super(name, age, gender);
    }

    public Student(String name, Integer age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.skippedDays = 0;
    }

    public Student(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    @Override
    public void introduce() {
        System.out.println(super.stringIntroduce() + " I'm from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(Integer numberOfDays) {
        this.skippedDays = this.skippedDays + numberOfDays;
    }


}
