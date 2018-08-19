package sample;

import java.util.ArrayList;

public class TasksList {
    private String name;
    private ArrayList<Task> tasks = new ArrayList();
    private String date;
    private Float totalCost;

    public TasksList(String name, String date) {
        this.name = name;
        this.date = date;
    }
}