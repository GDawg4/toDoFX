package sample;

import javafx.beans.Observable;
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
import javafx.scene.control.skin.TextAreaSkin;
import javafx.stage.Stage;


import java.io.IOException;


public class Controller {
    @FXML
    TableView<TasksList> mainList;

    @FXML
    private TableColumn<TasksList, String > name;

    @FXML
    private TableColumn<TasksList, String >  date;

    @FXML
    private TableColumn<TasksList, String >  pending;

    @FXML
    private TableColumn<TasksList, String >  estimate;

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
/*
    @FXML
    public void initialize(){
        ObservableList<TasksList> listOfLists = FXCollections.observableArrayList(
             new TasksList(
                     "1",
                     "2",
                     "3"
                )
        );
        name.setCellValueFactory(
                new PropertyValueFactory<TasksList, String >("Nombre")
        );
        date.setCellValueFactory(
                new PropertyValueFactory<TasksList, String>("Fecha")
        );
        pending.setCellValueFactory(
                new PropertyValueFactory<TasksList, String>("Pendiente")
        );
        estimate.setCellValueFactory(
                new PropertyValueFactory<TasksList, String>("Precio estimado")
        );

        mainList.setItems(listOfLists);

    }
    */

}
