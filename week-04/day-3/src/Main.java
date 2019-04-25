public class Main {

    public static void main(String[] args) {
        Student john = new Student("John", 20, "male","BME");
        Person person = new Person("John", 20, "male");

        Person johnClone = (Student) john.clone();
        john.introduce();
        johnClone.introduce();
        System.out.println(john.equals(johnClone));

    }
}
