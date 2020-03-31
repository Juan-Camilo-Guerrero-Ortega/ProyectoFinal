import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Guerrero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guerrero extends Terran
{
    //Para mover al guerrero de la especie terran utilice las W(arriba) A(abajo) S(izq) D(der)
    
    /**
     * Act - do whatever the Guerrero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int y= getY();
       
        if(Greenfoot.isKeyDown("d"))
        {
            move(4); 
        }
        if(Greenfoot.isKeyDown("a"))
        {
            move(-4); 
        }
        if(Greenfoot.isKeyDown("w"))
        {
            y--; 
        }
        if(Greenfoot.isKeyDown("s"))
        {
            y++; 
        }
        setLocation(getX(),y);
    }
     
}
        
 

