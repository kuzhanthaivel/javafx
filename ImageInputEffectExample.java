import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.effect.ImageInput; 
import javafx.scene.image.Image; 
import javafx.scene.shape.Rectangle; 
import javafx.stage.Stage; 
         
public class ImageInputEffectExample extends Application { 
   @Override  
   public void start(Stage stage) {       
      //Creating an image 
      Image image = new Image("http://www.tutorialspoint.com/green/images/logo.png"); 
             
      //Instantiating the Rectangle class 
      Rectangle rectangle = new Rectangle(); 
     
      //Instantiating the ImageInput class 
      ImageInput imageInput = new ImageInput(); 
      
      //Setting the position of the image
      imageInput.setX(150); 
      imageInput.setY(100);       
      
      //Setting source for image input  
      imageInput.setSource(image); 
       
      //Applying image input effect to the rectangle node 
      rectangle.setEffect(imageInput);    
         
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
