import greenfoot.*;  
import java.util.*;
public class Obstaculo extends Actor
{
    
    public void act() 
    {
        List<Entidad> Ens = getObjectsInRange(1,Entidad.class);
        if(Ens!=null){
            for(Entidad a : Ens){
                a.turn(180);
                a.move(1);
            }//
        }
    }    
}
