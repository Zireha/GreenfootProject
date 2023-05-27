import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class play extends World
{

    /**
     * Constructor for objects of class play.
     * 
     */
    public play()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1); 
    }
    
    private void prepare()
    {
        robot robot = new robot();
        addObject(robot, 146, 468);
    }
    
    public void act()
    {
        if(Greenfoot.getRandomNumber(500)<3
        {
            addObject(new food+Greenfoot.getRandomNumber(5)(), Greenfoot.getRandomNumber(1000), 1));
        }
    }
}
