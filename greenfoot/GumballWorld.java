import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (BHARAT SAVANI and PAWAN SHRIVASTAVA) 
 * @version version 1.0 (18th September 2013)
 */



public class GumballWorld extends World
{
   
    
   
    Penny pennyact;
    Quarter quarteract;
    FakeQuarter fakequarteract;
    Inspector inspectoract;
    
    
    public Inspector inspector;
    public GreenPicker greenpicker;
    public RandomPicker randompicker;
     /**
     * Constructor for objects of class GumballWorld.
     * 
     */
    public GumballWorld()
    {    
        // Create a new world with 1000x700 cells with a cell size of 1x1 pixels.
        super(1000,700, 1); 
        prepare();
        GumballMachine g = new GumballMachine(pennyact,quarteract,fakequarteract,inspectoract);

        
        //GumballMachine gg=new GumballMachine(inspectoract);
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    public void prepare()
    {
        GumballMachine gumballmachine = new GumballMachine();
        addObject(gumballmachine, 367, 237);
        addObject( new Penny(), 57, 71 ) ;
        addObject( new Quarter(), 68, 156 ) ;
        addObject( new FakeQuarter(), 66, 248 ) ;

        inspector = new Inspector();
        addObject(inspector, 533, 291);
        randompicker = new RandomPicker();
        addObject(randompicker, 643, 104);
        randompicker.setLocation(655, 94);
        greenpicker = new GreenPicker();
        addObject(greenpicker, 686, 454);
        greenpicker.setLocation(669, 456);
        inspector.setLocation(659, 282);
        randompicker.setLocation(789, 86);
        greenpicker.setLocation(786, 461);
        greenpicker.setLocation(816, 467);
        randompicker.setLocation(810, 83);
        randompicker.setLocation(813, 94);
        inspector.setLocation(591, 275);
        greenpicker.setLocation(819, 411);
        greenpicker.setLocation(904, 421);
        randompicker.setLocation(730, 413);
        randompicker.setLocation(711, 534);
        greenpicker.setLocation(922, 494);
        randompicker.setLocation(748, 483);
        randompicker.setLocation(751, 449);
        greenpicker.setLocation(917, 459);
        greenpicker.setLocation(907, 438);
        randompicker.setLocation(743, 430);
        randompicker.setLocation(756, 584);
        greenpicker.setLocation(922, 589);
        inspector.setLocation(590, 307);
        inspector.setLocation(589, 296);

        gumballmachine.setLocation(368, 236);
        inspector.setLocation(600, 296);
        inspector.setLocation(626, 298);
        randompicker.setLocation(756, 553);
        greenpicker.setLocation(922, 565);
        greenpicker.setLocation(922, 556);
        randompicker.setLocation(756, 547);
        greenpicker.setLocation(922, 547);
        randompicker.setLocation(756, 538);
    }
    
    public Inspector getInspector()
    {
        return inspector;
    }
    
    public GreenPicker getGreenPicker()
    {
        return greenpicker;
    }
    
    public RandomPicker getRandomPicker()
    {
        return randompicker;
    }
    
}
