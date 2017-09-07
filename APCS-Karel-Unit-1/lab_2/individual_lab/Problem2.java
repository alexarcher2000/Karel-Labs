package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setField(){
        begin();
        turnaround();
        rowone();
        repositionRight();
        rowtwo();
        repositionLeft();
        rowthree();
        repositionRight();
        rowfour();
        returnHome();
        rowtwo();
        repositionLeft();
        rowthree();
        repositionRight();
        rowfour();
        starting();
    }
    
    public void starting() {
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        move();
        move();
        move();
        move();
        move();
        move();
        turnaround();
    }
    public void turnaround(){
        turnLeft();
        turnLeft();
    }
    
    public void movePut(){
        move();
        move();
        putBeeper();
    }
    
    public void rowone(){
        movePut();
        movePut();
        movePut();
        movePut();
    }
    
    public void repositionRight(){
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void rowtwo() {
        move();
        putBeeper();
        movePut();
        movePut();
    }
    
    public void repositionLeft() {
        turnLeft();
        move();
        turnLeft();
    }
    
    public void rowthree() {
        move();
        putBeeper();
        movePut();
    }
    
    public void rowfour() {
        move();
        putBeeper();
    }
    
    public void returnHome() {
        move();
        move();
        move();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        move();
        move();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
        move();
    }
    
    public void begin() {
        move();
        turnLeft();
        move();
        move();
        move();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        move();
        move();
        turnLeft();
    }
}
