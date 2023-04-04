import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyComboBoxApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        ComboBox<String> myComboBox = new ComboBox<>();
        myComboBox.getItems().addAll("Option 1", "Option 2", "Option 3");
        myComboBox.setOnAction(e -> {
            System.out.println("Selected option: " + myComboBox.getValue());
        });

        VBox root = new VBox();
        root.getChildren().add(myComboBox);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("My ComboBox App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
