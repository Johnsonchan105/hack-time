
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.text.*;
public class UI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(25, 25, 25, 25));
        pane.setHgap(10);
        pane.setVgap(10);

        Text enter = new Text("Enter Name");
        enter.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        pane.add(enter, 0, 0, 2, 1); 
        pane.add(new Label("Name: "), 0, 1);
        Button b = new Button("Next");
        pane.add(b, 0,2);
        Button b2 = new Button();
        b2.setText("Randomize");
        pane.add(b2, 0, 4, 2, 1);
        while(true) {
            TextField tx = new TextField();
            pane.add(tx, 1, 1);
            b.setOnAction((ActionEvent e) -> {
                //method.setName(tx.getText());
                tx.clear();
            });

            break;


        }
        pane.add(new Label("People per Group"), 0, 3, 2, 1);
        TextField tt = new TextField();
        pane.add(tt, 2, 3);


        Scene scene = new Scene(pane, 300, 275);
        primaryStage.setTitle("Enter Student Name");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
