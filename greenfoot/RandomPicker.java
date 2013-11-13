import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (BHARAT SAVANI and PAWAN SHRIVASTAVA) 
 * @version version 1.0 (18th September 2013)
 * ROLE: RandomPicker picks a coin randomly means it either picks Red Gumball or Blue Gumball
 */
public class RandomPicker extends Picker
{
    /**
     * Act - do whatever the RandomPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
    /*
     *      Random Picker selection is randomized Randomnumber generator is actually caled pseudo random number generator. 
            A function is called and a limit value is passed to function say 10 so for 10 times that generator will give 10 different number.
            NOTE: generator starts generating number from 0 to (limit-1)
            When called 11th time it will give same number as generated before from series. So it is important to define proper range.
            
            Now, below has a randomnumber generator funtion I will add a simple code which will make easier for you to understand
            randomnumber generator will generate only 2 values
            
            If generator generates number 0 then
            if(0>0)
            {
                dispatch red gumball
            }
            else
            {
                dispatch blueball
            }

            If generator generates number 1 then
            if(1>0)
            {
                dispatch red gumball
            }
            else
            {
                dispatch blue gumball
            }   
    */
    public void pickRandom()
    {

        if(Greenfoot.getRandomNumber(2)>0)
        {
            RedGumball redball=new RedGumball(); // Red Gumball will be added to world on specified Co - ordinate
            getWorld().addObject(redball,368,463);
            Greenfoot.delay(40);// delay denotes the time amount till the gumball will be displayed in the world
            getWorld().removeObject(redball);// Gumball will be removed from the world after a delay
        }
        else
        {
            BlueGumball blueball=new BlueGumball();
            getWorld().addObject(blueball,368,463);// Blue Gumball will be added to world on specified Co - ordinate
            Greenfoot.delay(40);// delay denotes the time amount till the gumball will be displayed in the world
            getWorld().removeObject(blueball);// Gumball will be removed from the world after a delay
        }
    }
}

