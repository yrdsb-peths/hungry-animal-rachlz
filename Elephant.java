import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant, our hero. 
 * 
 * @author Rachel Zhang
 * @version December 5, 2022 (Version 2)
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        //Keyboard function (get the user's keys to press)
        if (Greenfoot.isKeyDown("left"))
        {
            move(-1); 
        }
        
        else if (Greenfoot.isKeyDown("right"))
        {
            move(1); 
        }
        
        // Remove apple if elephant eats it
        eat();  
        
    }
    
    /**
     * Eat the apple and spawn new apple if an apple is eaten. 
     */
    public void eat()
    {
        if (isTouching(Apple.class))
        {
            removeTouching(Apple.class); 
            MyWorld world = (MyWorld) getWorld(); 
            world.createApple(); 
            world.increaseScore(); 
        }
    }
}
