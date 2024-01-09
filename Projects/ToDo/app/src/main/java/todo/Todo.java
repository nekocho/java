package todo;

import java.util.ArrayList;

class Todo {
    public ArrayList<String> taskList = new ArrayList<>();

    public ArrayList<String> createEmptyList() {
        return taskList;
    }

    public ArrayList<String> addTask(String task) {
        taskList.add(task);
        return taskList;
        
    }

    public ArrayList<String> getTaskList(){
        return taskList;
    }

    public static void main(String[] args){

    }
}