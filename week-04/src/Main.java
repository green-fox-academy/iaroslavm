public class Main {

    public static void main(String[] args) {
        ToDoApp newApp = new ToDoApp();
//        newApp.content();
        newApp.listTask();
        newApp.removeTask(2);
        newApp.listTask();
        newApp.addTask("Feed the monkey");
        newApp.listTask();
    }
}
