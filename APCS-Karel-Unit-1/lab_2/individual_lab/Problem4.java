package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem4 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem4(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }
    
    public void three() {
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        
    }
    
    public void returnHome() {
        move();
        turnLeft();
        move();
        move();
        move();
        move();
        turnLeft();
    }
    
    public void two() {
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        turnLeft();
        move();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    
    public void one() {
        move();
        putBeeper();
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
    }

}
