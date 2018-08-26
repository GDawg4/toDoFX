package sample;

import java.util.ArrayList;

public class MainList {
    private ArrayList<TasksList> mainList;

    public MainList() {
        this.mainList = new ArrayList<>();
    }

    public void addList(TasksList newList) {
        mainList.add(newList);
    }

    public ArrayList<TasksList> getMainList() {
        return mainList;
    }
}
