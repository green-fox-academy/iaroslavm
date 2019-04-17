public class Student {

    Student() {
    }

    void learn() {
        System.out.println("Student learning");
    }

    void question(Teacher teacher) {
        teacher.answer();
        System.out.println("Student asking");
    }
}
