import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyCheckBoxApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        CheckBox myCheckBox = new CheckBox("Enable feature");
        myCheckBox.setOnAction(e -> {
            if (myCheckBox.isSelected()) {
                System.out.println("Feature enabled!");
            } else {
                System.out.println("Feature disabled!");
            }
        });

        VBox root = new VBox();
        root.getChildren().add(myCheckBox);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("My CheckBox App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
