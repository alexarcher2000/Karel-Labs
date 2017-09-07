package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        turnLeftmove2();
        turnRightmove2();
        pickBeeper();
        turnRight();
        move();
        pickbeepMove2();
        pickBeeper();
        move();
        pickBeeper();
        turnLeftmove2();
        turnLeftmove2();
        putBeeper();
        turnLeft();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        turnLeftmove2();
        turnRightmove2();
        turnLeft();
        turnLeft();
        turnOff();
        
        
        
        
        
    }
    public void turnRightmove2() {
        turnRight();
        move();
        move();
    }
    public void pickbeepMove2() {
        pickBeeper();
        move();
        move();
    }        
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void turnLeftmove2() {
        turnLeft();
        move();
        move();
    }
}