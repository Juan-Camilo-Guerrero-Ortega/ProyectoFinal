import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Constructor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Constructor extends Entidad
{
    int Energia=120;
    Constructor(int id,int giro){
        super(id,giro);
    }
    public void act() 
    {
        cultivar();
        Deps();
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
    void Deps(){
        Deposito dep;
        dep=(Deposito)getOneObjectAtOffset(0,0,Deposito.class);
        MyWorld mundo;
        mundo = (MyWorld)getWorld();
        if(dep!=null&&id==dep.id){
            if(Energia>0&&vida<160){
                if(id==1&&Energia>=35){
                dep.Energia+=35;
                Energia-=35;
                vida+=20;
                mundo.Protoss.add(35);
            }if (id==2&&Energia>=40){
                dep.Energia+=40;
                Energia-=40;
                vida+=20;
                mundo.Terran.add(40);
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
    void cultivar(){
                comida nw;
                roca ne;
                nw =  (comida)getOneObjectAtOffset(0,0,comida.class);
                ne = (roca)getOneObjectAtOffset(0,0,roca.class);
                MyWorld mundo;
                mundo = (MyWorld)getWorld();
                if(nw!=null){
                    Energia += 10;
                    mundo.removeObject(nw);
                    mundo.addObject(new comida(),Greenfoot.getRandomNumber(mundo.getWidth()),Greenfoot.getRandomNumber(mundo.getHeight()));
                }
                if(ne!=null){
                    Energia += 20;
                    mundo.removeObject(ne);
                    mundo.addObject(new roca(),Greenfoot.getRandomNumber(mundo.getWidth()),Greenfoot.getRandomNumber(mundo.getHeight()));
                }
            }
}
