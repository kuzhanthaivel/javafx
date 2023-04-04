import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MyButtonApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button myButton = new Button("Click me!");
        myButton.setOnAction(e -> System.out.println("Button clicked!"));

        StackPane root = new StackPane();
        root.getChildren().add(myButton);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("My Button App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
