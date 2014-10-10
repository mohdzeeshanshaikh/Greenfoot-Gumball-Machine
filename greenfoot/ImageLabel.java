import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Class.*;
import java.awt.Color;
import java.awt.Font;

/**
 * @Zeeshan 
 * @v1.0
**/

public class ImageLabel extends Actor
{
    public ImageLabel()
    {
        this("");
    }

    public ImageLabel(String str)
    {    
        setLabel(str);         
    }

    public void setLabel(String str)
    {
        setImage(new GreenfootImage(str,20,Color.black,new Color(0,0,0,0)));
    }
}
