public class Task {
  private String name;
  private boolean isCompleted = false;

  Task(String str){
    this.name = str;

  }

  public String getName() {
    return name;
  }

  void completeTask(){
    this.isCompleted = true;
  }
}
