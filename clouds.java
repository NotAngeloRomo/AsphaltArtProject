import org.code.neighborhood.*;
public class clouds extends background {

  public void clouds (String color, int size) {
  while (canMove("east")) {
    paintLine(color, size);
  turnRight();
    move();
    turnRight();
    paintLine(color, size);


    
    }
}


  // this is the code to make the sun look correct to add the spikes.  
  
public void sun (String color) {
    while (hasPaint()) {
      move();
      turnRight();
      paint(color);
      move();
      paint(color);
      
  }
  }
  




  

}
