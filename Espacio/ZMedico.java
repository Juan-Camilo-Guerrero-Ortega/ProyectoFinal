import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zmedico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zmedico extends Zerg
{
    /**
     * Act - do whatever the Zmedico wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int y= getY();
       
        if(Greenfoot.isKeyDown("3"))
        {
            move(4); 
        }
        if(Greenfoot.isKeyDown("1"))
        {
            move(-4); 
        }
        if(Greenfoot.isKeyDown("5"))
        {
            y--; 
        }
        if(Greenfoot.isKeyDown("2"))
        {
            y++; 
        }
        setLocation(getX(),y);
    }   
}
