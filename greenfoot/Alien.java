import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (BHARAT SAVANI and PAWAN SHRIVASTAVA) 
 * @version version 1.0 (18th September 2013)
 */
public class Alien extends Actor
{

    public Alien()
    {
        GreenfootImage image = getImage() ;
        image.scale( 150, 180 ) ; 

    }

   /* public void p(GreenfootImage g)
    {
        //just to see wether working or not
        getWorld().getBackground().drawImage(g,550,100);
        return;
    }*/

    public void act() 
    {
        int mouseX, mouseY ;

        if(Greenfoot.mouseDragged(this)) 
        {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            setLocation(mouseX, mouseY);

        }
       
    }

    public void movinggreenpicker()
    {
    }  
}
