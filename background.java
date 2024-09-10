import org.code.neighborhood.*;

public class background extends PainterPlus {

//this paints the background 
  
  public void paintBackground(String color, int size) {
    while (canMove("south")) {
      paintLine(color, size);
      turnToWest();
      paintLine(color, size);
      turnToEast();
      
    }

    paintLine(color, size);
    
  }

  /*
   * Paints a line with the color where the length
   * of the line is specified by spaces
   */
  public void paintLine(String color, int spaces) {
    setPaint(spaces);

    while (hasPaint()) {
      paint(color);

      if (canMove()) {
        move();
      }
    }
  }

  /*
   * Turns the MuralPainter to the next row to
   * face west if it is currently facing east
   */
  public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
      move();
      turnRight();
    }
  }

  /*
   * Turns the MuralPainter to the next row to
   * face east if it is currently facing west
   */
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
      move();
      turnLeft();
    }
  }

  /*
   * Turns the MuralPainter around to face the opposite direction
   */
  public void turnAround() {
    turnLeft();
    turnLeft();
  }

  /*
   * Resets the MuralPainter object to the starting location
   */
  public void resetPosition() {
    if (isFacingEast()) {
      turnLeft();

      while (canMove()) {
        move();
      }

      turnLeft();

      while (canMove()) {
        move();
      }

      turnAround();
    }
  }

  /*
   * Moves the MuralPainter to the bottom right corner
   */
  public void moveToCorner() {
    while (canMove()) {
      move();
    }
    
    turnRight();

    while (canMove()) {
      move();
    }
  }

// here is my very simple yet very annoying to write code for the beach bc it kept giving me errors everytime
// I tried to use if or eles statements :|
  
public void paintbeach(String color) {
  setPaint(1000);
  if(canMove()){
  turnLeft();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  turnLeft();
    move();
    turnRight();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    turnLeft();
    paint(color);
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
    move();
    turnLeft();
    paint(color);
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
    move();
    turnLeft();
    paint(color);
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
    move();
    paint(color);
   move();
    paint(color);
    turnLeft();
    move();
   paint(color);
    move();
    turnLeft();
    paint(color);
    paintEast(color);
    turnLeft();
    move();
    turnLeft();
    paint(color);  
    paintWest(color);
   turnRight();
    move();
    turnRight();
      

    }
    
  }

public void paintEast (String color){
   while(canMove("east")){
      move();
      paint(color);
    
}
}
public void paintWest (String color){
   while(canMove("West")){
      move();
      paint(color);
   }
}
}
    