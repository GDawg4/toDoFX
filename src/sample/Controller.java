package sample;

import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;
import sample.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import sample.TasksList;


import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Controller {
    @FXML
    TableView<TasksList> mainList;

    @FXML
    private TableColumn name;

    @FXML
    private TableColumn date;

    @FXML
    private TableColumn pending;

    @FXML
    private TableColumn estimate;

    public void show(ActionEvent event){
        Parent root;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("newList.fxml"));
            root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Creación de nueva lista");
            stage.setScene(new Scene(root, 450,450));
            stage.show();

        }catch (IOException e){
            e.printStackTrace();
        }
    }



    @FXML
    public void initialize() {
        MainList mainListObject = new MainList();
        ObservableList<TasksList> listOfLists =  FXCollections.observableArrayList(mainListObject.getMainList());

        name.setCellValueFactory (
                new PropertyValueFactory <TasksList, String>("Name")
        );

        date.setCellValueFactory(
                new PropertyValueFactory<TasksList, String>("Date")
        );
        pending.setCellValueFactory(
                new PropertyValueFactory<TasksList, String>("Description")
        );
        estimate.setCellValueFactory(
                new PropertyValueFactory<TasksList, String>("Prueba")
        );
        mainList.setItems(listOfLists);

    }
}
