import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)




/**
 * Write a description of class Zconstructor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZConstructor extends Zerg
{
    /**
     * Act - do whatever the Zconstructor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int y= getY();
       
        if(Greenfoot.isKeyDown("g"))
        {
            move(4); 
        }
        if(Greenfoot.isKeyDown("7"))
        {
            move(-4); 
        }
        if(Greenfoot.isKeyDown("/"))
        {
            y--; 
        }
        if(Greenfoot.isKeyDown("8"))
        {
            y++; 
        }
        setLocation(getX(),y);
    }  
}

