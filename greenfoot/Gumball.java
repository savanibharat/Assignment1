import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class GumballMachine here.
 * 
 * @author (BHARAT SAVANI and PAWAN SHRIVASTAVA) 
 * @version version 1.0 (18th September 2013)
 */
public class Gumball extends Actor
{

    public Gumball()
    {
        GreenfootImage image = getImage() ;
        image.scale( 50, 50 ) ; 
    }

    public void act() 
    {move(10);
        turn(90);
        // Add your action code here.
    }    
    public boolean inWorldRange()
    {
        if(getX() > getWorld().getWidth() - 10)
            return true;
        else
            return false;
    }
}
