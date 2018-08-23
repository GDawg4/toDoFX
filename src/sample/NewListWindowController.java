package sample;

import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NewListWindowController {

    @FXML
    private Button backButton;

    @FXML
    private Button newListButton;

    public void closeWindow(ActionEvent event){
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();
    }

    private void addNewList(String newName, String newDescription){
        String newDate = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        TasksList newTaskList = new TasksList(
                newName,
                newDescription,
                newDate
        );
    }

}
