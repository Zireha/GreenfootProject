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
        myImage.scale(60, 60);
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
        food a = (food)getOneIntersectingObject(food.class);
        if (a!=null){
            getWorld().removeObject(a);
            CountTracker.foodCount--;
            play.score.add(1);
        }
        chicken aa = (chicken)getOneIntersectingObject(chicken.class);
        if (aa!=null){
            getWorld().removeObject(aa);
            CountTracker.foodCount--;
            play.score.add(1);
        }
        apple ab = (apple)getOneIntersectingObject(apple.class);
        if (ab!=null){
            getWorld().removeObject(ab);
            CountTracker.foodCount--;
            play.score.add(2);
        }
        trash b = (trash)getOneIntersectingObject(trash.class);
        if (b!=null){
            getWorld().removeObject(b);
            CountTracker.trashCount--;
            play.hp.add(-1);
        }
        trashh ba = (trashh)getOneIntersectingObject(trashh.class);
        if (ba!=null){
            getWorld().removeObject(ba);
            CountTracker.trashCount--;
            play.hp.add(-1);
        }
    }

}
