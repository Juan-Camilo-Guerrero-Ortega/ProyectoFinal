import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zerg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zerg extends Especies
{
    
    
    public void act() 
    {
        
        move(-6);
        
        if (Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber (40)-20);
        }
        
        if (getX() <=5 || getX() >= getWorld().getWidth()-5)
        {
           turn(180); 
        }
        
        if (getY() <=5 || getY() >= getWorld().getWidth()-5)
        {
           turn(180); 
        }
        
    }
    
     
    
}
