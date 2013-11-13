import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Class.*;
import java.awt.Color;
import java.awt.Font;

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (BHARAT SAVANI and PAWAN SHRIVASTAVA) 
 * @version version 1.0 (18th September 2013)
 * This class is used to display various text that are passed from the methods "pennymoved(), quartermoved() and fakequarter()" of GumballMachine class
 */
public class ImageLabel extends Actor
{
    /**
     * Act - do whatever the ImageLabel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  
    public ImageLabel(String str)// ImageLabel is a parameterized constructor ;
    {    
        setImage(new GreenfootImage(str,20,Color.black,new Color(0,0,0,0)));        
    }

    

}
