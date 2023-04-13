import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.shape.CubicCurve; 
         
public class CubicCurveExample extends Application {  
   @Override 
   public void start(Stage stage) { 
      //Drawing a cubic curve 
      CubicCurve cubicCurve = new CubicCurve(); 
       
      //Setting properties to cubic curve
      cubicCurve.setStartX(100.0f); 
      cubicCurve.setStartY(150.0f); 
      cubicCurve.setControlX1(400.0f); 
      cubicCurve.setControlY1(40.0f); 
      cubicCurve.setControlX2(175.0f); 
      cubicCurve.setControlY2(250.0f); 
      cubicCurve.setEndX(500.0f); 
      cubicCurve.setEndY(150.0f);      
         
      //Creating a Group object  
      Group root = new Group(cubicCurve); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300);  
      
      //Setting title to the Stage 
      stage.setTitle("Drawing a cubic curve"); 
         
      //Adding scene to the stage
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show(); 
   }      
   public static void main(String args[]){ 
      launch(args); 
   } 
}
