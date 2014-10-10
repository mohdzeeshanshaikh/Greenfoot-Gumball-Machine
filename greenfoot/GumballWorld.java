import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @Zeeshan 
 * @v1.0
**/

public class GumballWorld extends World
{
    Penny pennyact;
    Quarter quarteract;
    FakeQuarter fakequarteract;
    Inspector inspectoract;
    
    private Inspector inspector;
    public GreenPicker greenpicker;
    public RandomPicker randompicker;
    
    public GumballWorld()   //Constructor for objects of class GumballWorld.
    {    
        super(1080,740, 1); 
        prepare();
        GumballMachine g = new GumballMachine(pennyact,quarteract,fakequarteract,inspectoract);
    }

    public void prepare()   //Prepare the world for the start of the program.
    {                       // i.e. Create the initial objects and add them to the world.
        GumballMachine gumballmachine = new GumballMachine();
        addObject(gumballmachine, 368, 236);
        addObject( new Penny(), 57, 71 ) ;
        addObject( new Quarter(), 68, 156 ) ;
        addObject( new FakeQuarter(), 66, 248 ) ;
        
        inspector = new Inspector();
        addObject(inspector, 533, 291);
        inspector.setLocation(626, 298);
        
        randompicker = new RandomPicker();
        addObject(randompicker, 643, 104);
        randompicker.setLocation(756, 538);
        
        greenpicker = new GreenPicker();
        addObject(greenpicker, 686, 454);
        greenpicker.setLocation(922, 547);
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
