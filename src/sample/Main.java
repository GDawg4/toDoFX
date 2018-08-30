package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

/*Rodrigo Garoz 18102
Advierto de una vez que no funciona
Tuve muchos problemas con lo de Observable List, y luego ya no hubo tiempo de terminarlo
 */

public class Main extends Application {

    public static void main(String[] args) {
        launch(Main.class, args);
    }
    @Override
    //Creación de primera ventana
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Mis Listas");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

}
