package GreenFoxOrganization;

public class Mentor extends Person {
    public Mentor(String name, Integer age, String gender) {
        super(name, age, gender);
    }

    String level;

    @Override
    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    @Override
    protected void introduce() {
        System.out.println(super.stringIntroduce() + " " + level + " mentor.");
    }

    public Mentor(String name, Integer age, String gender, String level){
        super(name, age, gender);
        this.level = level;
    }

    public Mentor(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.level = "intermediate";
    }
}
