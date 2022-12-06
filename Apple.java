import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A class where apples exist as a food source. 
 * 
 * @author Rachel Zhang 
 * @version December 1st, 2022 (Version 2)
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        // make an Apple instance fall 
        setLocation(getX(), getY() + 1); 
        
        // Remove apple and draw game over when apple gets to the bbottom
        MyWorld world = (MyWorld) getWorld(); 
        if (getY() >= world.getHeight())
        {
            world.gameOver(); 
            world.removeObject(this); 
        }
    }
}
