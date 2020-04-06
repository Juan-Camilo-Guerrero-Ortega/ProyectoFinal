import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Zerg extends Zespecies
{
      private static final int EAST=0;
    private static final int WEST=1;
    private static final int NORTH=2;
    private static final int SOUTH=3;
    private static final int NORTHEAST=4;
    private static final int NORTHWEST=5;
    private static final int SOUTHWEST=6;
    private static final int SOUTHEAST=7;
  
    
    private int direction;
    public Zerg(){
     setDirection(EAST);
    
    }
    public void act(){
    setDirection(Greenfoot.getRandomNumber(4));
    move();
    
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
