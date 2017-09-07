package lab_1.pair_programming;

import kareltherobot.*;
import java.awt.Color;

public class RobotDriver implements Directions
{
    public static void main(String args[])  {
        BeeperBot eric = new BeeperBot(4,1,West,0);
        eric.findAllBeepers();
        eric.turnOff();
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/lab-1-pair.kwld");
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(40);  
        World.setVisible(true);
    }
}