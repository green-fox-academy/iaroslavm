package Greenfox;

public class Mentor extends Person {
    private String level;

    Mentor(){
        super();
        this.level = "intermediate";
    }

    Mentor(String name, int age, String gender, String level) {
        super(name,age, gender);
        this.level = level;
    }

    @Override
    void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    @Override
    void introduce() {
        System.out.println("Hi, I'm "
                + this.getName() + " a " + this.getAge()
                + " year old " + this.getGender() + " "
                + this.level
                + " mentor.");
    }
}
