import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @Sophia Hobie 
 * @09/02/2021
 */
public class Crab extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(3);
        turnAtEdge();
        checkKeyPress();
        onCollision();
    }  
     
    
    private void turnAtEdge()
    { 
        if(isAtEdge())
        
        {
            turn(50);
        }
    }
        
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("right"))
        
        {
         turn(4);
        }
    
        if(Greenfoot.isKeyDown("left"))
        {
        turn(-4);
        }
      
            
    }   
    
    // Check for collisions with other objects private void onCollision()
    private void onCollision()
    {
        if(isTouching(worm.class))
        {
              removeTouching(worm.class);
              Greenfoot.playSound("slurp.wav");
            
              // Winning the game
              if(getWorld().getObjects(worm.class).size()==0)
            {
               Greenfoot.setWorld(new Winsplash());
               Greenfoot.playSound("fanfare.wav");
               Greenfoot.stop();
            }
        }
    
        if(isTouching(Lobster.class))
        {
         Greenfoot.playSound("au.wav");
         Greenfoot.stop();
        }
        
       
    }
} 