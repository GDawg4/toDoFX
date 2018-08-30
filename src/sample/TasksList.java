package sample;
import sample.*;

import javafx.beans.property.SimpleStringProperty;

import java.util.ArrayList;

public class TasksList {
    SimpleStringProperty name;
    SimpleStringProperty description;
    SimpleStringProperty date;

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

    //Setters y Getters
    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getDescription() {
        return description.get();
    }

    public SimpleStringProperty descriptionProperty() {
        return description;
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public String getDate() {
        return date.get();
    }

    public SimpleStringProperty dateProperty() {
        return date;
    }

    public void setDate(String date) {
        this.date.set(date);
    }


    public Float getTotalCost() {
        float totalCost = 0;
        for (Task task : tasks) {
            totalCost += task.getPrice() * task.getQuantity();
        }
        return totalCost;
    }
}