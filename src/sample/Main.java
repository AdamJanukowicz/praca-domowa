package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
    Stage stage = new Stage();
    List<Internal> internals = FileController.readFromFile();

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(20);
        root.setVgap(30);

        Scene scene = new Scene(root, 800, 800);

        stage.setTitle("Internal");
        stage.setScene(scene);
        stage.show();

        Text text1 = new Text("Srednia ocnea: " + Internals.getAverageOfGrade(internals));
        root.add(text1,0,1);

        Text text2 = new Text("Srednia ilość punktów: " + Internals.getAverageOfPoints(internals));
        root.add(text2,0,2);

        Text text3 = new Text("Najlepiej punktowany internal: " + Internals.getMaxPointInternal(internals));
        root.add(text3,0,3);

        Text text4 = new Text("Procent siódemek: "+ Internals.getPercentOfSeven(internals));
        root.add(text4,0,4);

        stage.getScene().setRoot(root);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
