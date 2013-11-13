import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (BHARAT SAVANI and PAWAN SHRIVASTAVA) 
 * @version version 1.0 (18th September 2013)
 * ROLE: Green Picker will always pick a Green Gumball 
 */
public class GreenPicker extends Picker
{
    /**
     * Act - do whatever the GreenPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GreenPicker()
    {
        
        
    }
    public void greenPick()
    {   
        GreenGumball greenball=new GreenGumball();    
        getWorld().addObject(greenball, 368,463);// Display a new Green Gumball in world
        Greenfoot.delay(50);                    
        getWorld().removeObject(greenball);      // Gumball will be removed from the world after a delay
        
           
    }
    public void act() 
    {
        // Add your action code here.
        // void quartermoved()
        //{
        int mouseX, mouseY ;


        if(Greenfoot.mouseDragged(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            setLocation(mouseX, mouseY);

        }
    }
}

