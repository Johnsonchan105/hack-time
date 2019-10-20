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
import java.util.*;

public class test extends Application {
    private ArrayList<String> totals = new ArrayList<String>();
    private int numOfGroups;
    private int p = 5;
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
        Button b = new Button("Store Name");
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
            
            Text addition = new Text(tx.getText());
            
            pane.add(addition, 0, ++p);
            tx.clear();
        });
        pane.add(new Label("Number of Groups"), 0, 4, 2, 1);
        TextField tt = new TextField();
        pane.add(tt, 2, 4);
        tt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(tt.getText() != null && !tt.getText().isEmpty()){
                    sets(Integer.valueOf(tt.getText()));
                }
                tt.clear();
            }
        });
        Scene scene = new Scene(pane, 300, 275);
        primaryStage.setTitle("Enter Student Names");
        primaryStage.setScene(scene);
        primaryStage.show();

        b2.setOnAction((ActionEvent e) -> {
            //randomize group method
        	for(int f = 0; f < totals.size(); f++) {
        		System.out.println(totals.get(f));
        	}
            primaryStage.close();
            GridPane pane2 = new GridPane();
            pane2.setPadding(new Insets(50, 50, 50, 50));
            pane2.setHgap(10);
            pane2.setVgap(10);
            //creates a new object
            int pc = totals.size();
            randomize();
            for(int j = 0; j < numOfGroups; j++){
                String aaa = "Group " + (j+1);
                pane2.add(new Label(aaa), j , 0);
                for(int m = 0; m < (pc / numOfGroups) ; m++){
                    
                	pane2.add(new Label(totals.get(m)), j, m+1);
                    
                }
                
                
            }
            
            Scene scene2 = new Scene(pane2, 1000, 1000);
            primaryStage.setTitle("Groups");
            primaryStage.setScene(scene2);
            primaryStage.show();
        });


    }
    private void randomize(){
    	Collections.shuffle(totals);
    	for(int i = 0; i < totals.size(); i++) {
    		System.out.println(totals.get(i));
    	}
    	
    }
    private void sets(int a) {
    	numOfGroups = a;
    }


}
