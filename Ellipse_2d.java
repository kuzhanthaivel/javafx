import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.shape.Ellipse; 
         
public class EllipseExample extends Application { 
   @Override 
   public void start(Stage stage) { 
      //Drawing an ellipse 
      Ellipse ellipse = new Ellipse(); 
         
      //Setting the properties of the ellipse 
      ellipse.setCenterX(300.0f); 
      ellipse.setCenterY(150.0f); 
      ellipse.setRadiusX(150.0f); 
      ellipse.setRadiusY(75.0f); 
         
      //Creating a Group object  
      Group root = new Group(ellipse); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300); 
      
      //Setting title to the Stage 
      stage.setTitle("Drawing an Ellipse"); 
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show();
   } 
   public static void main(String args[]){ 
      launch(args); 
   } 
} 
