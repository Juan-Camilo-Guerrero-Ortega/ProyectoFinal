import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Especies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Constructor extends Terran
{
   private static final int EAST=0;
   private static final int WEST=1;
   private static final int NORTH=2;
   private static final int SOUTH=3;
    
   private int direction;
   public void Especies(){
    setDirection(EAST);
    
    }
    public void act(){
      setDirection(Greenfoot.getRandomNumber(4));
      move();
      setDirection(EAST);
    
       if(Greenfoot.isKeyDown("g")){
        setLocation(getX(),getY()+1);
        }
       if(Greenfoot.isKeyDown("h")){
        setLocation(getX()+1,getY());
       }
        if(Greenfoot.isKeyDown("t")){
        setLocation(getX(),getY()-1);
       }
        if(Greenfoot.isKeyDown("f")){
        setLocation(getX()-1,getY());
       }
       
    
    }
    
    public void move(){
      if (!canMove()){
      return;
      }
      switch(direction){
        case SOUTH:
        setLocation(getX(),getY()+1);
        break;
        case EAST:
        setLocation(getX()+1,getY());
        break;
        case NORTH:
        setLocation(getX(),getY()-1);
        break;
        case WEST:
        setLocation(getX()-1,getY());
        break;
      }
      
    }
    //clase donde pregunta si puede ir hacia adelante, si sí, se mueve hacia adelante, si no,se mueve a otro lado
    public boolean canMove(){
        World myWorld=getWorld();
        int x= getX();
        int y= getY();
         switch(direction){
           case SOUTH:
           y++;
           break;
           case EAST:
           x++;
           break;
           case NORTH:
           y--;
           break;
           case WEST:
           x--;
           break;
        }
        
        //test for outside border
        if(x>=myWorld.getWidth() || y>=myWorld.getHeight()) {
          return false;
        }
        else if(x<0 || y<0) {
          return false;
        }
        return true;
        
    }
    //turns toward left
    public void turnLeft(){
        switch(direction){
        case SOUTH:
        setDirection(EAST);
        break;
        case EAST:
        setDirection(NORTH);
        break;
        case NORTH:
        setDirection(WEST);
        break;
        case WEST:
        setDirection(SOUTH);
        break;
        }
        
    }
    //direction where were are facing
    public void setDirection(int direction){
       this.direction=direction;
        switch(direction){
        case SOUTH:
        setRotation(90);
        break;
        case EAST:
        setRotation(0);
        break;
        case NORTH:
        setRotation(270);
        break;
        case WEST:
        setRotation(180);
        break;
       }
       
    }
    
}

