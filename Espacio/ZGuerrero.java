import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zguerrero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

//Para mover al guerrero de la especie zerg utilice las flechas 

 
 
  


public class ZGuerrero extends Zerg

{
    
    /**
     * Act - do whatever the Zguerrero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int y= getY();
       
        if(Greenfoot.isKeyDown("right"))
        {
            move(4); 
        }
        if(Greenfoot.isKeyDown("left"))
        {
            move(-4); 
        }
        if(Greenfoot.isKeyDown("up"))
        {
            y--; 
        }
        if(Greenfoot.isKeyDown("down"))
        {
            y++; 
        }
        setLocation(getX(),y);
        
      
    }
    
    
}    


