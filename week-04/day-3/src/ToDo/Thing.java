package ToDo;

public class Thing implements Comparable<Thing> {
    private String description;
    private boolean completed;

    public Thing(String description) {
        this.description = description;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + description;
    }

    @Override
    public int compareTo(Thing other) {
        int thisCompleted = 0;
        int otherCompleted = 0;
        if (this.completed){
            thisCompleted = 1;
        }
        if (other.completed){
            otherCompleted = 1;
        }
        int result = Integer.compare(otherCompleted,thisCompleted);
        if (result == 0){
            result = Character.compare(this.description.toLowerCase().charAt(0),other.description.toLowerCase().charAt(0));
        }
        return result;
    }
}