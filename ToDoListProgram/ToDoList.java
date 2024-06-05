package ToDoListProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    ArrayList<Task> toDoList;

    public ToDoList() {
        toDoList = new ArrayList<>();
    }

    public void addTask(Task task){
        toDoList.add(task);
    }

    public void removeTask(int taskID){

        for(int i=0; i<toDoList.size(); i++){
            if(toDoList.get(i).getTaskID()==taskID){
                toDoList.remove(i);
            }
        }
    }

    public void taskCompleted(int taskID){
        for(int i=0; i<toDoList.size(); i++){
            if(toDoList.get(i).getTaskID()==taskID){
                toDoList.get(i).setCompleted(true);
            }
        }
    }
    public void displayTasks(){
        for (int i = 0; i <toDoList.size() ; i++) {
            System.out.println("Task ID : "+toDoList.get(i).getTaskID()+"--> "+toDoList.get(i).getDescription()+"\tis completed: "+toDoList.get(i).isCompleted());
        }
    }

    public void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("N --> create and add new task \nR --> remove task\nS --> task status\nD --> display tasks : ");
        String in = scanner.next();
        char c = in.toUpperCase().charAt(0);
        switch (c) {
            case 'N':
                System.out.print("Enter the  task description : ");
                String d = scanner.next();
                System.out.println();
                System.out.print("Enter the  task ID(integer) : ");
                int id = scanner.nextInt();
                Task t = new Task(d, id);
                addTask(t);
                System.out.println("Your task added");
                break;
            case 'R':
                System.out.print("Enter the  task id to remove : ");
                int i = scanner.nextInt();
                removeTask(i);
                System.out.println("task is removed from toDo list ");
                break;
            case 'D':
                displayTasks();
                break;
            default:
                System.out.println("Invalid input");

        }


    }
}
