public class Teacher {

    Teacher() {
    }

    void teach(Student student){
        student.learn();
        System.out.println("Teacher teaching");
    }

    void answer() {
        System.out.println("Teacher answering");
    }
}
