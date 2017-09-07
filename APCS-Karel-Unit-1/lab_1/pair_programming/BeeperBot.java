package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  A. Archer
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAllBeepers() {
        turnAround();
        move2();
        pickBeeper();
        turnRight();
        move3();
        pickLeftmove3();
        pickLeftmove3();
        pickLeft();
        move5();
        turnOff();
      
     
        
    }
    
    public void turnAround() {
        turnLeft();
        turnLeft();
    }
   
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void pickLeft() {
        pickBeeper();
        turnLeft();
    }
    public void pickLeftmove3() {
        pickBeeper();
        turnLeft();
        move3();
    }
    
    public void move2() {
        move();
        move();
    }
    
    public void move3() {
        move();
        move();
        move();
    }
    
    public void move5() {
        move();
        move();
        move();
        move();
        move();
    }
}

