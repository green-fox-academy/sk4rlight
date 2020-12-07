package GreenFoxOrganization;

public class Sponsor extends Person {

    public Sponsor(String name, Integer age, String gender){
        super(name, age, gender);
    }

    String company;
    Integer hiredStudents;

    @Override
    protected void introduce() {
        System.out.println(super.stringIntroduce() + " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    public void hire(){
        this.hiredStudents++;
    }

    @Override
    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }

    public Sponsor(String name, Integer age, String gender, String company){
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.company = "Google";
        this.hiredStudents = 0;
    }
}
