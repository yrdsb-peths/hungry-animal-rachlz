import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The World is where our hero lives. 
 * 
 * @author Rachel Zhang 
 * @version December 5th, 2022 (Version 2)
 */
public class MyWorld extends World
{
    public int score = 0; 
    Label scoreLabel; 
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        // Create a background
        Background bg = new Background(); 
        addObject(bg, 120, 120);
        
        //Create the Elephant instance
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300); 
        
        // call the createApple() method to create a new randomized apple
        // Create a Label 
        scoreLabel = new Label(0, 90); //get rid of Label in front of scoreLabel to avoid creating a new object and causing NullPointerException since no reference is made.
        addObject(scoreLabel, 50, 50); 
        
        createApple(); 
    }
    
    /**
     * End the game and draw "Game Over"
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over",100);
        addObject(gameOverLabel, 300, 200); 
    }
    
    /**
     * Increase score
     */
    public void increaseScore()
    {
        score++; 
        scoreLabel.setValue(score); 
    }
    
    /**
     * Create a new apple at random location at top of screen
     */
    public void createApple() 
    {
        Apple apple = new Apple(); 
        int x = Greenfoot.getRandomNumber(600); 
        int y = 0; 
        addObject(apple, x, y); 
    }
}
