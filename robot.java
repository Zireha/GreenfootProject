import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class robot extends Actor
{
    public robot()
    {
        GreenfootImage myImage = getImage();
        myImage.scale(72, 72);
    }
    
    /**
     * Act - do whatever the robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5, getY());
        }else
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5, getY());
        }
    }

}
