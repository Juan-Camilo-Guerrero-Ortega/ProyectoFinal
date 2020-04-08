import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Entidad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Entidad extends Actor
{
    int id;
    int giro;
    int vida = 100;
    Obstaculo na;
    public void act() 
    {
        Obstaculo na;
        na=(Obstaculo)getOneObjectAtOffset(0,0,Obstaculo.class);
        if(na!=null){
        int x = getX();
        int y = getY();
        setLocation(x++,y++);
    }
      colision();
       combate();
       move(1);
       World mundo;
       mundo = getWorld();
       if(this.vida==0){
           mundo.removeObject(this);
        }else{
        if(isAtEdge()){
            CalAngulo();
        }
    }
    }    
    Entidad(int id , int giro){
        this.id= id;
        this.giro=giro;
        setRotation(giro);
        if(id==2){
            setImage("skull.png");
        }
        
    }
    void combate(){
        Entidad Entidad;
        Entidad = (Entidad)getOneObjectAtOffset(0,0,Entidad.class);
        if(Entidad!=null){
            if(id!=Entidad.id){
                int Num = Greenfoot.getRandomNumber(1);
                if(Num==0){
                    Entidad.vida-=20;
                }else{
                    vida-=20;
                }
      
            }
            
        }
    }
    void CalAngulo(){
        int Temp1 = Greenfoot.getRandomNumber(7);
            switch(Temp1){
                case 0:
                setRotation(0);
                giro=0;
                break;
                case 1:
                setRotation(45);
                giro=45;
                break;
                case 2:
                setRotation(90);
                giro=90;
                break;
                case 3:
                setRotation(135);
                giro=135;
                break;
                case 4:
                setRotation(180);
                giro=180;
                break;
                case 5:
                setRotation(225);
                giro=225;
                case 6:
                setRotation(270);
                giro=270;
                break;
                case 7 :
                setRotation(315);
                giro=315;
                
            }
    }
    void colision(){
        List<Obstaculo>Obstaculos;
        Obstaculos = getObjectsInRange(1,Obstaculo.class);
        
        if(!Obstaculos.isEmpty()){
            for(Obstaculo a : Obstaculos){
                Coordenada ad = new Coordenada(a.getX()-getX(),a.getY()-getY());
                if(giro==valAngulo(ad)){
                    turn(90);
                }
            }
           
        }
    }
    int valAngulo(Coordenada a){
        int valor=0;
        if(a.x==1&&a.y==-1){
            valor= 45;
        }
        if(a.x==1&&a.y==0){
            valor= 0;
        }
        if(a.x==0&&a.y==-1){
            valor= 90;
        }
        if(a.x==-1&&a.y==-1){
            valor= 135;
        }
        if(a.x==-1&&a.y==0){
            valor= 180;
        }
        if(a.x==-1&&a.y==1){
            valor= 225;
        }
        if(a.x==0&&a.y==1){
            valor= 270;
        }
        if (a.x==1&&a.y==1){
            valor= 315;
        }
        return valor;
    }
}
