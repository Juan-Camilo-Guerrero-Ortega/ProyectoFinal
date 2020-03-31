import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Constructor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Constructor extends Terran
{
    //Para mover al guerrero de la especie terran utilice las T(arriba) G(abajo) F(izq) H(der)
    
    /**
     * Act - do whatever the Constructor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int y= getY();
       
        if(Greenfoot.isKeyDown("h"))
        {
            move(4); 
        }
        if(Greenfoot.isKeyDown("f"))
        {
            move(-4); 
        }
        if(Greenfoot.isKeyDown("t"))
        {
            y--; 
        }
        if(Greenfoot.isKeyDown("g"))
        {
            y++; 
        }
        setLocation(getX(),y);
    }   
}
