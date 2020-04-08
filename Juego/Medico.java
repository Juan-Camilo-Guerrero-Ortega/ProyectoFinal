import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Medico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Medico extends Entidad
{
    int PodCu=120;
    Medico(int id,int giro){
        super(id,giro);
    }
    public void act() 
    {
        Curacion();
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
       MyWorld mundo;
       mundo = (MyWorld)getWorld();
       if(this.vida<=0){
           if(id==1){
               mundo.Protoss.add(-10);
            }
            if(id==2){
                mundo.Terran.add(-10);
            }
           mundo.removeObject(this);
        }else{
        if(isAtEdge()){
            CalAngulo();
        }
    }
    }   
    void Curacion(){
        Entidad n1;
        n1=(Entidad)getOneObjectAtOffset(0,0,Entidad.class);
        if(n1!=null&&PodCu>0){
            if(n1.id==id&& !(n1 instanceof Medico)){
                if(id==1){
                n1.vida+=15;
                PodCu-=15;
            }else{
                n1.vida+=20;
                PodCu-=20;
            }
            }
        }
        
    }
    void combate(){
        Entidad Entidad;
        Entidad = (Entidad)getOneObjectAtOffset(0,0,Entidad.class);
        if(Entidad!=null){
            if(id!=Entidad.id){
                if(Entidad instanceof Guerrero){
                int Num = Greenfoot.getRandomNumber(99);
                if(Num<29){
                    Entidad.vida-=20;
                }else{
                    vida-=20;
                }
                }
                if(Entidad instanceof Medico){
                int Num = Greenfoot.getRandomNumber(99);
                if(Num<49){
                    Entidad.vida-=20;
                }else{
                    vida-=20;
                }
                }
                if(Entidad instanceof Constructor){
                int Num = Greenfoot.getRandomNumber(99);
                if(Num<49){
                    Entidad.vida-=20;
                }else{
                    vida-=20;
                }
                }
            }
            
        }
    }
}
