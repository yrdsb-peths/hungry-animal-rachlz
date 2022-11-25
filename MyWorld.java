import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A beautiful animal farm where all animals are hungry. 
 * 
 * @author Rachel Zhang 
 * @version November 25, 2022
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Camel camel = new Camel(); 
        addObject(camel, 300, 200);
        
        Apple apple = new Apple(); 
        addObject(apple, 300, 0); 
    }
}
