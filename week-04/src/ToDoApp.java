import javax.sound.midi.Soundbank;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class ToDoApp {
  List<Task> taskList = new ArrayList<>();

  ToDoApp() {
    this.addTask("Walk the dog");
    this.addTask("Buy milk");
    this.addTask("Do homework");

  }

  void content() {
    System.out.println("Command Line Todo application");
    System.out.println("------------------------------");
    System.out.println("\n");
    System.out.println("Command line arguments:");
    System.out.println("-l Lists all the tasks");
    System.out.println("-a Adds a new task");
    System.out.println("-r Removes a task");
    System.out.println("-c Completes a task");
  }

  void listTask() {
    if (this.taskList.size() != 0) {
      int i = 0;
      for (Task each : taskList) {
        System.out.println(i + 1
            + " - "
            + this.taskList.get(i).getName());
        i++;
      }

    } else {
      System.out.println("No todos for today! :)");
    }
  }

  void addTask (String str){
    this.taskList.add(new Task(str));
  }

  void addTask (){
    System.out.println("Unable to add: no task provided");
  }

  void removeTask(int i){
    this.taskList.remove(i-1);

  }


}
