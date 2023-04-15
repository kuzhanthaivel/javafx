import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.effect.ColorAdjust; 
import javafx.scene.image.Image; 
import javafx.scene.image.ImageView; 
import javafx.stage.Stage; 
         
public class ColorAdjustEffectExample extends Application {   
   @Override 
   public void start(Stage stage) {       
      //Creating an image 
      Image image = new Image("data:image/jpeg;base64,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");
      
      //Setting the image view 
      ImageView imageView = new ImageView(image); 
      
      //Setting the position of the image 
      imageView.setX(100);  
      imageView.setY(70); 
      
      //setting the fit height and width of the image view 
      imageView.setFitHeight(200); 
      imageView.setFitWidth(400); 
      
      //Setting the preserve ratio of the image view 
      imageView.setPreserveRatio(true); 
    
      //Instantiating the ColorAdjust class 
      ColorAdjust colorAdjust = new ColorAdjust(); 
      
      //Setting the contrast value 
      colorAdjust.setContrast(0.4);     
      
      //Setting the hue value 
      colorAdjust.setHue(-0.05);     
      
      //Setting the brightness value 
      colorAdjust.setBrightness(0.9);  
      
      //Setting the saturation value 
      colorAdjust.setSaturation(0.8);   
       
      //Applying coloradjust effect to the ImageView node 
      imageView.setEffect(colorAdjust);    
         
      //Creating a Group object  
      Group root = new Group(imageView);   
               
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300);  
      
      //Setting title to the Stage 
      stage.setTitle("Coloradjust effect example");
      
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show();         
   } 
   public static void main(String args[]){ 
      launch(args); 
   } 
}      
