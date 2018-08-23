package sample;

import javafx.beans.property.SimpleStringProperty;

import java.util.ArrayList;

public class TasksList {
    private SimpleStringProperty name;
    private SimpleStringProperty description;
    private SimpleStringProperty date;

    private Float totalCost = this.getTotalCost();
    private ArrayList<Task> tasks = new ArrayList();

    public TasksList(String name, String description, String date) {
        this.name = new SimpleStringProperty();
        this.name.set(name);

        this.description = new SimpleStringProperty();
        this.name.set(description);

        this.date = new SimpleStringProperty();
        this.name.set(date);
    }

    public Float getTotalCost() {
        float totalCost = 0;
        for (Task task: tasks){
            totalCost += task.getPrice() * task.getQuantity();
        }
        return totalCost;
    }
}