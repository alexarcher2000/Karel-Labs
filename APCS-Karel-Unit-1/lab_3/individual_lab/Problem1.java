package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }
    
    public void faceEast()
    {
        if (facingWest()) {
                turnLeft();
                turnLeft();
            }
        if(facingNorth()){ 
                turnRight();
                    }
        if (facingSouth()) {
                turnLeft();
                  }      
        }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

