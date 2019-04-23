package Greenfox;

public class Sponsor extends Person{
    private String company;
    private int hireStudents;

    Sponsor(){
        super();
        this.company = "Google";
    }

    Sponsor(String name, int age, String gender, String company) {
        super(name,age, gender);
        this.company = company;
    }

    @Override
    void introduce() {
        System.out.println("Hi, I'm "
                + this.getName() + " a " + this.getAge()
                + " year old " + this.getGender() + " who represents "
                + this.company
                + " and hired "
                + this.hireStudents + " students so far.");
    }

    void hire () {
        this.hireStudents++;
    }

    @Override
    void getGoal(){
        System.out.println("Hire brilliant junior software developers.");
    }
}
