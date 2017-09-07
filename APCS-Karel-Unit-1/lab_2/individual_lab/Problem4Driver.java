package lab_2.individual_lab;

/**
   @Author:
      Date:
   Teacher: Appel
       Lab: Problem Set 3
      Misc: Karel plants a garden in a cross-shape
  */
import kareltherobot.*;
import java.awt.Color;

public class Problem4Driver implements Directions
{
    public static void main(String args[])  {
        Problem4 karel = new Problem4(1, 1, East, -1);
        Eraser bob = new Eraser(1, 1, East, -1);
        karel.three();
        karel.returnHome();
        bob.three();
        bob.returnHome();
        karel.two();
        karel.returnHome();
        bob.two();
        bob.returnHome();
        karel.one();
        karel.returnHome();
        bob.one();
        bob.returnHome();
        karel.turnOff();
        bob.turnOff();
    } 

    static {
        World.reset(); 
        World.readWorld("fig3-8.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}