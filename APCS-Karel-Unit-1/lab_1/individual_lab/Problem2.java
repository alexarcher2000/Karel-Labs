package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        turnLeft();
        move();
        turnRightmove2();
        turnRightmove2();
        turnLeftmove2();
        turnLeftmove2();
        turnLeftmove2();
        turnLeftmove2();
        turnRightmove2();
        turnRight();
        move();
        
        
        
        
    }
    public void turnLeftmove2() {
        turnLeft();
        move();
        move();
    }
        
   
   public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
   }
   public void turnRightmove2() {
       turnRight();
       move();
       move();
    }
}