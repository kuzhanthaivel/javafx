import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.effect.ColorInput; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Rectangle; 
import javafx.stage.Stage; 
         
public class ColorInputEffectExample extends Application { 
   @Override  
   public void start(Stage stage) {            
      //creating a rectangle 
      Rectangle rectangle = new Rectangle();
      
      //Instantiating the Colorinput class 
      ColorInput colorInput = new ColorInput();         
       
      //Setting the coordinates of the color input 
      colorInput.setX(50); 
      colorInput.setY(140); 
      
      //Setting the height of the region of the collor input 
      colorInput.setHeight(50); 
      
      //Setting the width of the region of the color input 
      colorInput.setWidth(400); 
      
      //Setting the color the color input 
      colorInput.setPaint(Color.CHOCOLATE);  
      
      //Applying coloradjust effect to the Rectangle 
      rectangle.setEffect(colorInput);    
         
      //Creating a Group object  
      Group root = new Group(rectangle);   
               
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300);  
      
      //Setting title to the Stage 
      stage.setTitle("Sample Application"); 
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show();          
   } 
   public static void main(String args[]){ 
      launch(args); 
   }
}   
