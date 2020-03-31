import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Medico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Medico extends Terran
{
    //Para mover al guerrero de la especie terran utilice las I(arriba) K(abajo) J(izq) L(der)
    
    /**
     * Act - do whatever the Medico wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  
    public void act() 
    {
        int y= getY();
       
        if(Greenfoot.isKeyDown("l"))
        {
            move(2); 
        }
        if(Greenfoot.isKeyDown("j"))
        {
            move(-2); 
        }
        if(Greenfoot.isKeyDown("i"))
        {
            y--; 
        }
        if(Greenfoot.isKeyDown("k"))
        {
            y++; 
        }
        setLocation(getX(),y);
    }   
}
