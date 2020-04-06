import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Espacio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Espacio extends World
{

    /**
     * Constructor for objects of class Espacio.
     * 
     */
    public Espacio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(15, 15, 50); 
        Rebot();
    }
    private void Rebot()
    {
        Constructor c = new Constructor();
        addObject (c,1,2);
        Guerrero g = new Guerrero();
        addObject (g,7,2);
        Medico m = new Medico();
        addObject (m,12,2);
        ZConstructor zc = new ZConstructor();
        addObject (zc,1,12);
        ZGuerrero zg = new ZGuerrero();
        addObject (zg,7,12);
        ZMedico zm = new ZMedico();
        addObject (zm,12,12);
        Cristales cr = new Cristales();
        addObject (cr,2,7);
        Cristales cr2 = new Cristales();
        addObject (cr2,7,7);
        Cristales cr3 = new Cristales();
        addObject (cr3,11,7);
        Cristales cr4 = new Cristales();
        addObject (cr4,7,9);
        Gas gs = new Gas();
        addObject (gs,3,9);
        Gas gs1 = new Gas();
        addObject(gs1,6,5);
        Gas gs2 = new Gas();
        addObject(gs2,9,9);
        Gas gs3 = new Gas();
        addObject(gs3,10,5);
        Obstaculo roca = new Obstaculo();
        addObject (roca,14,1);
        Obstaculo roca1 = new Obstaculo();
        addObject (roca1,13,1);
        Obstaculo roca2 = new Obstaculo();
        addObject (roca2,12,1);
        Obstaculo roca3 = new Obstaculo();
        addObject (roca3,11,1);
        Obstaculo roca4 = new Obstaculo();
        addObject (roca4,10,1);
        Obstaculo roca5 = new Obstaculo();
        addObject (roca,9,1);
        Obstaculo roca6 = new Obstaculo();
        addObject (roca6,8,1);
        Obstaculo roca7 = new Obstaculo();
        addObject (roca7,7,1);
        Obstaculo roca8 = new Obstaculo();
        addObject (roca8,6,1);
        Obstaculo roca9 = new Obstaculo();
        addObject (roca9,5,1);
        Obstaculo roca10 = new Obstaculo();
        addObject (roca10,4,1);
        Obstaculo roca11 = new Obstaculo();
        addObject (roca11,3,1);
        Obstaculo roca12 = new Obstaculo();
        addObject (roca12,2,1);
        Obstaculo roca13 = new Obstaculo();
        addObject (roca13,1,1);
        Obstaculo roca14 = new Obstaculo();
        addObject (roca14,0,1);
        Obstaculo roca15 = new Obstaculo();
        addObject (roca15,9,1);
        Obstaculo2 obs = new Obstaculo2();
        addObject (obs,0,13);
        Obstaculo2 obs1 = new Obstaculo2();
        addObject (obs1,1,13);
        Obstaculo2 obs2 = new Obstaculo2();
        addObject (obs2,2,13);
        Obstaculo2 obs3 = new Obstaculo2();
        addObject (obs3,3,13);
        Obstaculo2 obs4 = new Obstaculo2();
        addObject (obs4,4,13);
        Obstaculo2 obs5 = new Obstaculo2();
        addObject (obs5,5,13);
        Obstaculo2 obs6 = new Obstaculo2();
        addObject (obs6,6,13);
        Obstaculo2 obs7 = new Obstaculo2();
        addObject (obs7,7,13);
        Obstaculo2 obs8 = new Obstaculo2();
        addObject (obs8,8,13);
        Obstaculo2 obs9 = new Obstaculo2();
        addObject (obs9,9,13);
        Obstaculo2 obs10 = new Obstaculo2();
        addObject (obs10,10,13);
        Obstaculo2 obs11 = new Obstaculo2();
        addObject (obs11,11,13);
        Obstaculo2 obs12 = new Obstaculo2();
        addObject (obs12,12,13);
        Obstaculo2 obs13 = new Obstaculo2();
        addObject (obs13,13,13);
        Obstaculo2 obs14 = new Obstaculo2();
        addObject (obs14,14,13);
    }
    
}
