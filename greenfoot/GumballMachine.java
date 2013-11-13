/*
Lab done by BHARAT SAVANI and PAWAN SHRIVASTAV
 */

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Class.*;
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class GumballMachine here.
 * 
 * @author (BHARAT SAVANI and PAWAN SHRIVASTAVA) 
 * @version version 1.0 (18th September 2013)
 * Gumball Machine is class which will accept the 3 coins in itself and execute a method turncrank with will pass control to inspector
 */

public class GumballMachine extends Actor
{
    Penny actorpenny;
    Quarter actorquarter;// We initialize several objects and a variable which we will need to use in this class which contains 4 modules.
    FakeQuarter actorfakequarter;
    Inspector inspector;
    MouseInfo m=Greenfoot.getMouseInfo();
    int conditional_var =0;
    Actor tempquarter=null;
    Actor temppenny=null;
    Actor tempfakequarter=null;

    public GumballMachine(Penny p, Quarter q, FakeQuarter f,Inspector i)//Gumball machine has 4 important parameters that are passed from GumballWorld which will be 
    {                                                                   //used for referencing purpose.
        actorpenny = p;
        actorquarter=q;
        actorfakequarter=f;
        inspector=i;
    }

    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 250, 400 ) ; // scale function is used to shrink or expand the image.

    }

    public void act() //Execution in greenfoot always starts from the act method.
    {   int mouseX, mouseY ;// MouseX and MouseY are used for absorbing values of X-Co-ordinate and Y-Co-ordinate respectively
        pennymoved();       // The method to check whether penny is moved or not.  
        fakequartermoved(); // The method to check whether fakequarter is moved or not.      
        quartermoved();     // The method to check whether quarter is moved or not.

        turncrank(conditional_var);

    }

    //If penny is moved then pennymoved method is initiated
    public void pennymoved()
    {         

        if(Greenfoot.mouseDragEnded(actorpenny))//coin will disappear only after mouse is presssed
        { 
             m=Greenfoot.getMouseInfo();
             
            if(m.getX()>310 && m.getX()<470 &&  m.getY()>240&& m.getY()<380)// Co ordinates to insert the coin
            {

                Actor worldActorpenny= getOneIntersectingObject(Penny.class);  //Return an object that intersects this object. 

                if(worldActorpenny!=null)//If the object is returned then value in worldActorpenny will not be null;
                {
                    conditional_var=1;        //This is a conditional variable which uses an integer value to decide which coin is inserted into the machine.
                    temppenny=worldActorpenny;//Create a temporary variable that will hold value of worldActorpenny as we will use it for the displaying various images. 
                    Greenfoot.playSound("coinsound.wav");                    
                    getWorld().removeObject(worldActorpenny);  //coin will disappear as intersecting object is Gumball Machine.
                    getWorld().addObject(new ImageLabel("Penny Inserted"), 50,100);  //ImageLabel is a class that is used to display the string

                    turncrank(conditional_var);// turn crank is funtion is called with conditional variable as prime parameter
                }
            }
        }
    }

    //If quarter is moved then this method is initiated
    void quartermoved()
    {   

        if(Greenfoot.mouseDragEnded(actorquarter))//coin will disappear only after mouse is presssed
        {
            m=Greenfoot.getMouseInfo();
            if(m.getX()>310 && m.getX()<470 &&  m.getY()>240&& m.getY()<380 )// Co ordinates to insert the coin
            {
                Actor worldquarteractor = getOneIntersectingObject(Quarter.class);  //Return an object that intersects this object. 

                if (worldquarteractor != null) //If the object is returned then value in worldActorpenny will not be null;
                {
                    conditional_var=2;            //This is a conditional variable which uses an integer value to decide which coin is inserted into the machine.
                    tempquarter=worldquarteractor;//Create a temporary variable that will hold value of worldquarteractor as we will use it for the displaying various images. 
                    Greenfoot.playSound("coinsound.wav");
                    getWorld().removeObject(worldquarteractor);  //coin will disappear as intersecting object is Gumball Machine.
                    getWorld().addObject(new ImageLabel("Quarter Inserted"), 50,200);  //ImageLabel is a class that is used to display the string

                    turncrank(conditional_var); // turn crank is funtion is called with conditional variable as prime parameter
                }
            }
        }
    }
    //If quarter is moved then this method is initiated
    void fakequartermoved()
    {    
        if(Greenfoot.mouseDragEnded(actorfakequarter))//coin will disappear only after mouse is presssed
        {
            m=Greenfoot.getMouseInfo();
            if(m.getX()>310 && m.getX()<470 &&  m.getY()>240&& m.getY()<380 )// Co ordinates to insert the coin
            {
                Actor worldfakeactor = getOneIntersectingObject(FakeQuarter.class);  //Return an object that intersects this object. 

                if (worldfakeactor != null)        //If the object is returned then value in worldfakeactor will not be null;
                {
                    conditional_var=3;             //This is a conditional variable which uses an integer value to decide which coin is inserted into the machine.
                    tempfakequarter=worldfakeactor;//Create a temporary variable that will hold value of worldfakequarter as we will use it for the displaying various images. 
                    Greenfoot.playSound("coinsound.wav");                  
                    getWorld().removeObject(worldfakeactor);  //coin will disappear as intersecting object is Gumball Machine.
                    getWorld().addObject(new ImageLabel("Fake Coin Inserted"), 70,300);  //ImageLabel is a class that is used to display the string

                    turncrank(conditional_var); // turn crank is funtion is called with conditional variable as prime parameter
                }
            }
        }
    }
    /* Turncrank method plays important role as it calls inspector who will decide the further actions to be mobilized.
    Turncrank method is communicator between gumball machine and Inspector.
    It takes a conditional variable with it and presents to Inspector*/
    void turncrank(int condition)
    {
        if(Greenfoot.mouseClicked(this)&& condition>0)//By clicking on specific co ordinates the turncrank intiates the Inspector's method hascoin().
        {
           
            m=Greenfoot.getMouseInfo();
            
            if(m.getX()>268 && m.getX()<440 &&  m.getY()>295 && m.getY()<350)
            {
                GumballWorld gw = (GumballWorld) getWorld();   
                inspector = gw.getInspector();                   

                inspector.hascoin(condition);
                conditional_var=0;
            }
        }
    }
}