import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
/**
 * Write a description of class GumballMachine here.
 * 
 * @author (BHARAT SAVANI and PAWAN SHRIVASTAVA) 
 * @version version 1.0 (18th September 2013)
 */
public class Quarter extends Coin
{
    int x,y;
    public Quarter() 
    {
        GreenfootImage image = getImage() ;
        image.scale( 80, 80 ) ;

    }

    public void act()
    {
        int mouseX, mouseY ;

        if(Greenfoot.mouseDragged(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            setLocation(mouseX, mouseY);
            //   removeQuater();
            //  addFakeQuarter();move(1);
        }

    } 
}

