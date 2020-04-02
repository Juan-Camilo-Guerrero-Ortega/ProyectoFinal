import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


 public class Zconstructor extends Zerg
{
  
    public void act() 
    {
        int y= getY();
       
        if(Greenfoot.isKeyDown("9"))
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
