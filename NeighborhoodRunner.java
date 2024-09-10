import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    
    PainterPlus s = new PainterPlus();
  background h = new background();
    clouds a = new clouds();


    h.setPaint(1000);
  a.setPaint(1000);
 s.setPaint(10);
 h.turnRight();
 h.move();
   h.move();
    h.move();
    h.turnLeft();
  h.paintBackground("skyblue", 22);
  a.clouds("Cornsilk", 16);
a.turnRight();
    a.move();
    a.move();
    a.turnRight();
    a.paintLine("Cornsilk", 16);


    // this moves the painter then runs the cde to paint it after the clouds are finished.  
    s.move();
  s.move();
  s.move(); 
  s.turnRight();
  s.move();
  s.move();
  s.paintSun("yellow");
   s.turnLeft();
    s.move();
    s.setPaint(5);
    s.paint("yellow");
    s.turnLeft();
    s.turnLeft();
    s.move();
    s.move();
    s.paint("yellow");
    s.turnRight();
    s.move();
    s.move();
    s.paint("yellow");
    s.turnLeft();
    s.turnLeft();
    s.moveFast();
    s.paint("yellow");
    s.turnLeft();
    s.turnLeft();
    s.move();
    s.move();
    s.turnLeft();
    s.move();
    s.move();
    s.paint("yellow");
    
// this gets the background painter that is also my beach painter into position to start the paining of the beach 
    h.turnLeft();
    h.move();
    h.move();
    h.move();
    h.move();
    h.move();
    h.move();

    // this is the last of the code on this page but it allows for the beach to be painted.  
    h.paintbeach ("Khaki");

 
  }
}



