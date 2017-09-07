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

public class Problem3Driver implements Directions
{
    public static void main(String args[])  {
        Problem3 karel = new Problem3(3, 1, East, -1);
        Problem3 bob = new Problem3(4, 1, East, -1);
        Problem3 mike = new Problem3(5, 1, East, -1);
        Problem3 ed = new Problem3(6, 1, East, -1);
        Problem3 nick = new Problem3(7, 1, East, -1);
        karel.rowone();
        bob.rowtwo();
        mike.rowthree();
        ed.rowtwo();
        nick.rowfive();
        karel.turnOff();
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/world1.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}