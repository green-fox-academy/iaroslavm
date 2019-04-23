public class Sponsor {
    private String name;
    private int age;
    private String gender;
    private String company;
    private int hiredStudents;

    Sponsor(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.hiredStudents = 0;
        this.company = "Google";
    }

    Sponsor(String name, int age, String gender, String company){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hiredStudents = 0;
    }

    void introduce(){
        System.out.println("Hi, I'm " + this.name
                + " a " + this.age + " year old " + this.gender
                + " who represents " + this.company
                + " and hired " + this.hiredStudents + " students so far.");
    }

    void getGoal() {
        System.out.println("Hire brilliant junior software developers");
    }

    void hire() {
        this.hiredStudents++;
    }


    public static void main(String[] args){
        Sponsor ksunya = new Sponsor("Ksu",28,"female","KPMG");
        ksunya.introduce();
        ksunya.hire();
        ksunya.introduce();
    }
}
