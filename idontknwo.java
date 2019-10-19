import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.text.*;

public class idontknwo extends Application {
    ArrayList<String> totals = new ArrayList<String>();
    int numOfGroups = 0;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
      //create pane
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(50, 50, 50, 50));
        pane.setHgap(10);
        pane.setVgap(10);
      //creates the buttons and displays
        Text enter = new Text("Welcome");
        enter.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        pane.add(enter, 0, 0, 2, 1);
        pane.add(new Label("Name: "), 0, 2, 2, 1);
        Button b = new Button("Next");
        pane.add(b, 0,3);
        Button b2 = new Button();
        b2.setText("Randomize");
        pane.add(b2, 0, 5, 2, 1);
        TextField tx = new TextField();
        pane.add(tx, 1, 2);
        //every time that next is pressed, total names increases
        b.setOnAction((ActionEvent e) -> {
            if (tx.getText() != null && !tx.getText().isEmpty())
                totals.add(tx.getText());
            tx.clear();
        });
        pane.add(new Label("People per Group"), 0, 4, 2, 1);
        TextField tt = new TextField();
        pane.add(tt, 2, 4);
        tt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(tt.getText() != null && !tt.getText().isEmpty()){
                    numOfGroups = Integer.valueOf(tt.getText());
                }
                tt.clear();
            }
        });
        Scene scene = new Scene(pane, 300, 275);
        primaryStage.setTitle("Enter the Student's FULL NAME:");
        primaryStage.setScene(scene);
        primaryStage.show();

        b2.setOnAction((ActionEvent e) -> {
            //randomize group method
            primaryStage.close();
            GridPane pane2 = new GridPane();

        });


    }
    private void store(int a) {
      num = a;
    }
}
