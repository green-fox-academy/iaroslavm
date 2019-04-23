import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String previousOrganization;
    private int skippedDays;

    Student(){
        name = "Jane Doe";
        age = 30;
        gender = "female";
        previousOrganization = "School of life";
        skippedDays = 0;
    }

    Student(String name, int age, String gender, String previousOrganization){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    void introduce(){
        System.out.println("Hi, I'm " + this.name
                + " a " + this.age + " year old " + this.gender
                + " from " + this.previousOrganization
                + " who skipped " + this.skippedDays
                + " from the course already");
    }

    void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    String getGender() {
        return this.gender;
    }

    void skipDays(int numberOfDays) {
        this.skippedDays += numberOfDays;
    }


    public static void main(String[] args){
        List<Person> people = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        List<Mentor> mentors = new ArrayList<>();
        List<Sponsor> sponsors = new ArrayList<>();

        Person mark = new Person("Mark", 46, "male");
        people.add(mark);
        Person jane = new Person();
        people.add(jane);
        Student john = new Student("John Doe", 20, "male", "BME");
        students.add(john);
        Student student = new Student();
        students.add(student);
        Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
        mentors.add(gandhi);
        Mentor mentor = new Mentor();
        mentors.add(mentor);
        Sponsor sponsor = new Sponsor();
        sponsors.add(sponsor);
        Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");
        sponsors.add(elon);

        student.skipDays(3);

        for (int i = 0; i < 5; i++) {
            elon.hire();
        }

        for (int i = 0; i < 3; i++) {
            sponsor.hire();
        }

        for (Person person : people) {
            person.introduce();
            person.getGoal();
        }

        for (Student person : students) {
            person.introduce();
            person.getGoal();
        }

        for (Mentor person : mentors) {
            person.introduce();
            person.getGoal();
        }

        for (Sponsor person : sponsors) {
            person.introduce();
            person.getGoal();
        }
    }
}
