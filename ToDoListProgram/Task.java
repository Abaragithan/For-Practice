package ToDoListProgram;

public class Task {
    private String description;
    private int taskID;
    private boolean completed;

    public Task(String description, int taskID){

        this.description = description;
        this.taskID = taskID;
        completed = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

}
