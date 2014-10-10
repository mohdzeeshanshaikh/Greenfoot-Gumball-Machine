import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @Zeeshan 
 * @v1.0
**/

public class Inspector extends Alien
{
    String s;
    
    public void act() 
    {
        //Act
    }  

    public void hascoin(Actor a,Actor b, Actor c)
    {
        if(a!=null)
        {
            GreenfootImage drawedImageagain = new GreenfootImage("Pennynotaccepted.png");
            getWorld().getBackground().drawImage(drawedImageagain, 600, 100); 
            
            GreenfootImage drawedImageagain1 = new GreenfootImage("nogumforpenny.png");
            getWorld().getBackground().drawImage(drawedImageagain1, 720, 330);  
        }
        else if(b!=null)
        {
            GreenfootImage drawedImageagain = new GreenfootImage("correctcoin.png"); 
            getWorld().getBackground().drawImage(drawedImageagain, 600, 100);  

            GreenfootImage drawedImageagain1 = new GreenfootImage("getyourgums.png"); 
            getWorld().getBackground().drawImage(drawedImageagain1, 720, 330);  
            
            if(Greenfoot.getRandomNumber(2)>0)
            {
                GumballWorld gw = (GumballWorld) getWorld();   
                RandomPicker randompicker = gw.getRandomPicker();
                randompicker.pickRandom();
            }
            else
            {
                GumballWorld gw = (GumballWorld) getWorld();   
                GreenPicker greenpicker = gw.getGreenPicker();
                greenpicker.greenPick();
            }            
        }
        else if(c!=null)
        {
            GreenfootImage drawedImageagainfake = new GreenfootImage("fakecoin.png"); 
            getWorld().getBackground().drawImage(drawedImageagainfake, 600, 100);  

            GreenfootImage drawedImageagain1fake = new GreenfootImage("fakecoinnogum.png");  
            getWorld().getBackground().drawImage(drawedImageagain1fake, 720, 330);  
        }
    }
}