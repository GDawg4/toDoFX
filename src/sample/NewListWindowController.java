package sample;

import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NewListWindowController {

    @FXML
    private Button backButton;

    @FXML
    private Button newListButton;

    @FXML
    private TextField textF1;

    @FXML
    private TextField textF2;

    public void closeWindow(ActionEvent event){
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();
    }

    public void addNewList(ActionEvent event){
        String newDate = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        TasksList newTaskList = new TasksList(
                "1",
                "1",
                newDate
        );
        
    }

    public void saveText(ActionEvent event){
        System.out.println(textF1.getText());
        System.out.println(textF2.getText());
    }

}
