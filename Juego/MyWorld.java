import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Counter Protoss = new Counter();
    Counter Terran = new Counter();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(10, 11, 60); 
        addObject(Terran,8,10);
        addObject(Protoss,1,0);
        Protoss.setValue(100);
        Terran.setValue(100);
        Creador();
        Obstaculo n2=new Obstaculo();
        Obstaculo n3=new Obstaculo();
        Deposito nw = new Deposito(1);
        Deposito ne = new Deposito(2);
        Deposito nt = new Deposito(1);
        Deposito ny = new Deposito(2);
        addObject(nw,8,1);
        addObject(nt,1,1);
        addObject(ne,1,9);
        addObject(ny,8,9);
        addObject(n2,7,3);
        addObject(n3,2,7);
        addObject(new comida(),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
        addObject(new comida(),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
        addObject(new comida(),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
        addObject(new roca(),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
        addObject(new roca(),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
    }
    void Creador(){
        
        for(int i=0;i<4;i++){
            int nX;
            int nY;
            int dX;
            int dY;
            do{
                nX=Greenfoot.getRandomNumber(getWidth()-1);
                dX=Greenfoot.getRandomNumber(getWidth()-1);
                nY=Greenfoot.getRandomNumber(getHeight()/2);
                dY=Greenfoot.getRandomNumber(getHeight()-1);
            }while(nX==0||nY==0||dX==0||dY==0||dY<getHeight()/2||nX==7||nX==2||dX==7||dX==2||nY==3||dY==3||nY==7||dY==7);
            int Temp1 = Greenfoot.getRandomNumber(7);
            int Temp2 = Greenfoot.getRandomNumber(7);
            int Angulo1=0;
            int Angulo2=0;
            switch(Temp1){
                case 0:
                Angulo1=0;
                break;
                case 1:
                Angulo1 = 45;
                break;
                case 2:
                Angulo1 = 90;
                break;
                case 3:
                Angulo1=135;
                break;
                case 4:
                Angulo1 = 180;
                break;
                case 5:
                Angulo1=225;
                case 6:
                Angulo1=270;
                break;
                case 7 :
                Angulo1=315;
                
            }
            switch(Temp2){
                case 0:
                Angulo2=0;
                break;
                case 1:
                Angulo2 = 45;
                break;
                case 2:
                Angulo2 = 90;
                break;
                case 3:
                Angulo2=135;
                break;
                case 4:
                Angulo2 = 180;
                break;
                case 5:
                Angulo2=225;
                case 6:
                Angulo2=270;
                break;
                case 7 :
                Angulo2=315;
                
            }
            Guerrero n = new Guerrero(1,Angulo1);
            Guerrero d = new Guerrero(2,Angulo2);
            addObject(n,nX,nY);
            addObject(d,dX,dY);
        }
        for(int i=0;i<3;i++){
            int nX;
            int nY;
            int dX;
            int dY;
            do{
                nX=Greenfoot.getRandomNumber(getWidth()-1);
                dX=Greenfoot.getRandomNumber(getWidth()-1);
                nY=Greenfoot.getRandomNumber(getHeight()/2);
                dY=Greenfoot.getRandomNumber(getHeight()-1);
            }while(nX==0||nY==0||dX==0||dY==0||dY<getHeight()/2||nX==7||nX==2||dX==7||dX==2||nY==3||dY==3||nY==7||dY==7);
            int Temp1 = Greenfoot.getRandomNumber(7);
            int Temp2 = Greenfoot.getRandomNumber(7);
            int Angulo1=0;
            int Angulo2=0;
            switch(Temp1){
                case 0:
                Angulo1=0;
                break;
                case 1:
                Angulo1 = 45;
                break;
                case 2:
                Angulo1 = 90;
                break;
                case 3:
                Angulo1=135;
                break;
                case 4:
                Angulo1 = 180;
                break;
                case 5:
                Angulo1=225;
                case 6:
                Angulo1=270;
                break;
                case 7 :
                Angulo1=315;
                
            }
            switch(Temp2){
                case 0:
                Angulo2=0;
                break;
                case 1:
                Angulo2 = 45;
                break;
                case 2:
                Angulo2 = 90;
                break;
                case 3:
                Angulo2=135;
                break;
                case 4:
                Angulo2 = 180;
                break;
                case 5:
                Angulo2=225;
                case 6:
                Angulo2=270;
                break;
                case 7 :
                Angulo2=315;
                
            }
            Medico n = new Medico(1,Angulo1);
            Medico d = new Medico(2,Angulo2);
            addObject(n,nX,nY);
            addObject(d,dX,dY);
        }
        for(int i=0;i<3;i++){
            int nX;
            int nY;
            int dX;
            int dY;
            do{
                nX=Greenfoot.getRandomNumber(getWidth()-1);
                dX=Greenfoot.getRandomNumber(getWidth()-1);
                nY=Greenfoot.getRandomNumber(getHeight()/2);
                dY=Greenfoot.getRandomNumber(getHeight()-1);
            }while(nX==0||nY==0||dX==0||dY==0||dY<getHeight()/2||nX==7||nX==2||dX==7||dX==2||nY==3||dY==3||nY==7||dY==7);
            int Temp1 = Greenfoot.getRandomNumber(7);
            int Temp2 = Greenfoot.getRandomNumber(7);
            int Angulo1=0;
            int Angulo2=0;
            switch(Temp1){
                case 0:
                Angulo1=0;
                break;
                case 1:
                Angulo1 = 45;
                break;
                case 2:
                Angulo1 = 90;
                break;
                case 3:
                Angulo1=135;
                break;
                case 4:
                Angulo1 = 180;
                break;
                case 5:
                Angulo1=225;
                case 6:
                Angulo1=270;
                break;
                case 7 :
                Angulo1=315;
                
            }
            switch(Temp2){
                case 0:
                Angulo2=0;
                break;
                case 1:
                Angulo2 = 45;
                break;
                case 2:
                Angulo2 = 90;
                break;
                case 3:
                Angulo2=135;
                break;
                case 4:
                Angulo2 = 180;
                break;
                case 5:
                Angulo2=225;
                case 6:
                Angulo2=270;
                break;
                case 7 :
                Angulo2=315;
                
            }
            Constructor n = new Constructor(1,Angulo1);
            Constructor d = new Constructor(2,Angulo2);
            addObject(n,nX,nY);
            addObject(d,dX,dY);
        }
    }
}
