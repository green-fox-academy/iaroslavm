

public class Person {
    private String name;
    private int age;
    private String gender;

    Person () {
        this.name = "Jane Doe";
        this.gender = "female";
        this.age = 30;
    }

    Person(String name, int age, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    void introduce() {
        System.out.println("Hi, I'm "
        + this.name + " a " + this.age
        + " year old " + this.gender);
    }

    void getGoal() {
        System.out.println("My goal is: Live for the moment!");
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
}
