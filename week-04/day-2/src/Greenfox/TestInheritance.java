package Greenfox;

public class TestInheritance {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.introduce();
        Student studentKsu = new Student("Ksu",28,"female","KPMG");
        studentKsu.introduce();
        studentKsu.getGoal();
        studentKsu.skipDays(1);
        studentKsu.introduce();
        System.out.println(studentKsu.getAge());
        System.out.println(student1.getAge());

        Mentor mentor1 = new Mentor();
        mentor1.introduce();
        mentor1.getGoal();

        Mentor mentorKsu = new Mentor("Ksu", 28,"female,","superSayan");
        mentorKsu.introduce();
        mentorKsu.getGoal();

        Sponsor sponsor1 = new Sponsor();
        Sponsor sponsorKsu = new Sponsor("Ksu",28,"female","KPMG");

        sponsor1.introduce();
        sponsorKsu.introduce();
        sponsor1.getGoal();
        sponsorKsu.hire();
        sponsorKsu.introduce();

        Cohort cohort1 = new Cohort("Good boyz");
        cohort1.addStudent();
        cohort1.addStudent(studentKsu);
        cohort1.addMentor();
        cohort1.addStudent();
        cohort1.addMentor(mentor1);
        cohort1.info();

        cohort1.getCohortStudents().get(0).introduce();
        cohort1.getCohortStudents().get(1).introduce();
        cohort1.getCohortStudents().get(2).introduce(cohort1);


    }
}
