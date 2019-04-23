package Greenfox;

public class Student extends Person {
    private String previousOrganization;
    private int skippedDays;

    Student(){
        super();
        this.previousOrganization = "School of life";
        this.skippedDays = 0;
    }

    Student(String name, int age, String gender, String previousOrganization) {
        super(name,age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    @Override
    void introduce() {
        System.out.println("Hi, I'm "
                + this.getName() + " a " + this.getAge()
                + " year old " + this.getGender()
                + " from " + this.previousOrganization
                + " who skipped " + this.skippedDays
                + " days so far.");
    }


    void introduce(Cohort cohort) {
        System.out.println("Hi, I'm "
                + this.getName() + " a " + this.getAge()
                + " year old " + this.getGender()
                + " from " + this.previousOrganization
                + " who skipped " + this.skippedDays
                + " days so far."
                + " My cohort is " + cohort.getName() + ".");
    }

    @Override
    void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    void skipDays(int number) {
        this.skippedDays += number;
    }


}
