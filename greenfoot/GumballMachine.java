import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Class.*;
import java.awt.Color;
import java.awt.Font;

/**
 * @Zeeshan 
 * @v1.0
**/

public class GumballMachine extends Actor
{
    static int gumball=10;
    Penny actorpenny;
    Quarter actorquarter;
    FakeQuarter actorfakequarter;
    MouseInfo m=Greenfoot.getMouseInfo();
    Inspector ins;
    Actor tempquarter=null;
    Actor temppenny=null;
    Actor tempfakequarter=null;
    int mouseX, mouseY;  
    
    public GumballMachine(Penny p, Quarter q, FakeQuarter f,Inspector i)
    {
        actorpenny = p;
        actorquarter=q;
        actorfakequarter=f;
        ins=i;
        
    }
    
    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 250, 400 ) ; 
    }
    
    public void act() 
    {   int mouseX, mouseY ;
        pennymoved();
        fakequartermoved();       
        quartermoved();   
        
        if(Greenfoot.mousePressed(this)) {          
            Message msg = new Message() ;
            MouseInfo mouse = Greenfoot.getMouseInfo();
            mouseX=mouse.getX();  
            mouseY=mouse.getY(); 
            msg.setText("Crank Turned!");
            getWorld().addObject( msg, mouseX, mouseY ) ;
        }
    }
      
    public void pennymoved()
    {         
        if(Greenfoot.mousePressed(actorpenny))
        { 
            if(m.getX()>310 && m.getX()<470 &&  m.getY()>240 && m.getY()<380)
            {
                Actor worldActorpenny= getOneIntersectingObject(Penny.class);  

                if(worldActorpenny!=null)
                {
                    temppenny=worldActorpenny;
                    getWorld().removeObject(worldActorpenny);  
                    getWorld().addObject(new ImageLabel("Penny Moved"), 50,100);  
                    tempfakequarter=null;
                    tempquarter=null;
                    GumballWorld gw = (GumballWorld) getWorld();    
                    Message msg = new Message() ;
                    MouseInfo mouse = Greenfoot.getMouseInfo();
                    mouseX=mouse.getX();  
                    mouseY=mouse.getY(); 
                    msg.setText( "Have Coin!" );
                    gw.addObject( msg, mouseX, mouseY ) ;
                    Greenfoot.delay(50);                 
                    Inspector ins = gw.getInspector();
                    ins.hascoin(temppenny,tempquarter,tempfakequarter);
                    temppenny=null;
                }
            }
        }
    }

    void quartermoved()
    {   
        m=Greenfoot.getMouseInfo();
        if(Greenfoot.mousePressed(actorquarter)){
            if(m.getX()>310 && m.getX()<470 &&  m.getY()>240 && m.getY()<380)
            {
                Actor worldqpenny= getOneIntersectingObject(Quarter.class); 
                {  
                    tempquarter=worldqpenny;
                    getWorld().removeObject(worldqpenny);  
                    if(tempquarter!=null){
                        getWorld().addObject(new ImageLabel("Quarter Moved"), 50,200);  
                    }
                    temppenny=null;
                    tempfakequarter=null;
                    GumballWorld gw = (GumballWorld) getWorld();   
                    Message msg = new Message() ;
                    MouseInfo mouse = Greenfoot.getMouseInfo();
                    mouseX=mouse.getX();  
                    mouseY=mouse.getY(); 
                    msg.setText( "Crank Turned!" );
                    gw.addObject( msg, mouseX, mouseY ) ;  
                    Greenfoot.delay(50);                 
                    Inspector ins = gw.getInspector();
                    ins.hascoin(temppenny,tempquarter,tempfakequarter);
                    tempquarter=null;
                }
            }
        }
    }

    void fakequartermoved()
    {    
        m=Greenfoot.getMouseInfo();
        if(Greenfoot.mousePressed(actorquarter)){
            if(m.getX()>310 && m.getX()<470 &&  m.getY()>240&& m.getY()<380 )
            {
                Actor worldActor = getOneIntersectingObject(FakeQuarter.class);  
                if (worldActor != null) 
                {
                    tempfakequarter=worldActor;
                    getWorld().removeObject(worldActor);  
                    getWorld().addObject(new ImageLabel("Fake Moved"), 50,300);  
                    GumballWorld gw = (GumballWorld) getWorld();   
                    Message msg = new Message() ;
                    MouseInfo mouse = Greenfoot.getMouseInfo();
                    mouseX=mouse.getX();  
                    mouseY=mouse.getY(); 
                    msg.setText( "Have Coin!" );
                    gw.addObject( msg, mouseX, mouseY ) ;
                    Greenfoot.delay(50);                 
                    Inspector ins = gw.getInspector();
                    tempquarter=null;
                    temppenny=null;
                    ins.hascoin(temppenny,tempquarter,tempfakequarter);        
                }
            }
        }        
    }
}