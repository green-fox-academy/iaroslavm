public class Mentor {
    private String name;
    private int age;
    private String gender;
    private String level;

    Mentor(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.level = "intermediate";

    }

    public String getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    Mentor(String name, int age, String gender, String level){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.level = level;
    }

    void introduce(){
        System.out.println("Hi, I'm " + this.name
                + " a " + this.age + " year old " + this.gender + " "
        + this.level + " mentor.");
    }

    void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }


    public static void main(String[] args){
        Person ksunya = new Person("Ksu",28,"female");
//        System.out.println(ksunya.gender);
        ksunya.introduce();
    }
}
