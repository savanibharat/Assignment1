import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (BHARAT SAVANI and PAWAN SHRIVASTAVA) 
 * @version version 1.0 (18th September 2013)
 */
public class Penny extends Coin
{   

    public Penny()
    {
        GreenfootImage image = getImage() ;
        image.scale( 50, 50 ) ;    
    }
    public void act() 
    {
        int mouseX, mouseY ;

        if(Greenfoot.mouseDragged(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            setLocation(mouseX, mouseY);

            
        } 

    } 
    
}
