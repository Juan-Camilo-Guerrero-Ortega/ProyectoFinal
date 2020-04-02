import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 
 */

//Para mover al guerrero de la especie zerg utilice las flechas 
 
 
  
 public class Zguerrero extends Zerg
{
    
    
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


