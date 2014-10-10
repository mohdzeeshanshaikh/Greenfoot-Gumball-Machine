import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @Zeeshan 
 * @v1.0
**/

public class RandomPicker extends Picker
{
    public void randompicking()
    {
        GreenfootImage gg=new GreenfootImage("blue-gumball.png");
        gg.scale(50,50);
        getWorld().getBackground().drawImage(gg,500,500);
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

    public void pickRandom()
    {

        if(Greenfoot.getRandomNumber(2)>0)
        {
            RedGumball redball=new RedGumball(); 
            getWorld().addObject(redball,368,463);
            Greenfoot.delay(500);
            getWorld().removeObject(redball);
        }
        else
        {
            BlueGumball blueball=new BlueGumball();
            getWorld().addObject(blueball,368,463);
            Greenfoot.delay(500);
            getWorld().removeObject(blueball);
        }
    }
}

