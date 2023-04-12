import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.shape.Polygon; 
import javafx.stage.Stage;  

public class PolygonExample extends Application { 
   @Override 
   public void start(Stage stage) {        
      //Creating a Polygon 
      Polygon polygon = new Polygon();  
       
      //Adding coordinates to the polygon 
      polygon.getPoints().addAll(new Double[]{ 
         300.0, 50.0, 
         450.0, 150.0, 
         300.0, 250.0, 
         150.0, 150.0, 
      }); 
          
      //Creating a Group object  
      Group root = new Group(polygon); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300);  
      
      //Setting title to the Stage 
      stage.setTitle("Drawing a Polygon"); 
         
      //Adding scene to the stage 
      stage.setScene(scene); 
      
      //Displaying the contents of the stage 
      stage.show(); 
   } 
   public static void main(String args[]){ 
      launch(args); 
   } 
}
