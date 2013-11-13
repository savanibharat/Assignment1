import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (BHARAT SAVANI and PAWAN SHRIVASTAVA) 
 * @version version 1.0 (18th September 2013)
 * 
 * ROLE: Inspector checks the conditional variable and accordingly passes control to GreenPicker or RandomPicker
 */

public class Inspector extends Alien
{
    /**
     * Act - do whatever the Inspector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Inspector()
    {

    }

    public void act() 
    {

    }  
    //hascoin method.
    /**
     * conditional_var = 1 denotes penny is moved
     * conditional_var = 2 denotes quarter is moved
     * conditional_var = 3 denotes fakequarter is moved
    */
    public void hascoin(int conditional_var)
    {

        if(conditional_var==1)
        {
            GreenfootImage drawedImageagain = new GreenfootImage("Pennynotaccepted.png");//the image that is drawed; It prints "Penny not accepted. No Gums. Sorry" 
            getWorld().getBackground().drawImage(drawedImageagain, 600, 100);            

            GreenfootImage drawedImageagain1 = new GreenfootImage("nogumforpenny.png");//the image that is drawed;  
            getWorld().getBackground().drawImage(drawedImageagain1, 720, 330);  

            GreenfootImage pennycoin = new GreenfootImage("pennyfacenew.png");//the image that is drawed;  This is smily which represents the irritated face of kid. JUST FOR FUN
            pennycoin.scale(100,100);
            getWorld().getBackground().drawImage(pennycoin, 180, 560);  
        }

        else if(conditional_var==2)
        {
            GreenfootImage drawedImageagain = new GreenfootImage("correctcoin.png");//the image that is drawed;  Inspector says, "Correct coin"
            getWorld().getBackground().drawImage(drawedImageagain, 600, 100);  

            GreenfootImage drawedImageagain1 = new GreenfootImage("getyourgums.png");//the image that is drawed;  
            getWorld().getBackground().drawImage(drawedImageagain1, 720, 330);  

            GreenfootImage happyface = new GreenfootImage("havegumfacenew.png");//the image that is drawed;  Smily
            happyface.scale(90,90);
            getWorld().getBackground().drawImage(happyface, 180, 560);
            /*
            Picker selection is randomized Randomnumber generator is actually caled pseudo random number generator. 
            A function is called and a limit value is passed to function say 10 so for 10 times that generator will give 10 different number.
            NOTE: generator starts generating number from 0 to (limit-1)
            When called 11th time it will give same number as generated before from series. So it is important to define proper range.
            
            Now, below has a randomnumber generator funtion I will add a simple code which will make easier for you to understand
            randomnumber generator will generate only 2 values
            
            If generator generates number 0 then
            if(0>0)
            {
                call randompicker
            }
            else
            {
                call greenpicker
            }

            If generator generates number 1 then
            if(1>0)
            {
                call randompicker
            }
            else
            {
                call greenpicker
            }
            
            */
            if(Greenfoot.getRandomNumber(2)>0)
            {
                GumballWorld gw = (GumballWorld) getWorld();   
                RandomPicker randompicker = gw.getRandomPicker();
                randompicker.pickRandom();// Random picker will either pick red or blue gumball
            }
            else
            {
                GumballWorld gw = (GumballWorld) getWorld();   
                GreenPicker greenpicker = gw.getGreenPicker();
                greenpicker.greenPick();// green picker will always pick green gumball
            }
        }
        else if(conditional_var==3)
        {
            GreenfootImage drawedImageagainfake = new GreenfootImage("fakecoin.png");//the image that is drawed;  The message will be displayed as Fake Coin no Gum.
            getWorld().getBackground().drawImage(drawedImageagainfake, 600, 100);  

            GreenfootImage drawedImageagain1fake = new GreenfootImage("fakecoinnogum.png");//the image that is drawed;  
            getWorld().getBackground().drawImage(drawedImageagain1fake, 720, 330);  

            GreenfootImage fakecoin = new GreenfootImage("fakecoinnew.png");//the image that is drawed;  
            fakecoin.scale(90,90);
            getWorld().getBackground().drawImage(fakecoin, 180, 560);
        }
    }
}