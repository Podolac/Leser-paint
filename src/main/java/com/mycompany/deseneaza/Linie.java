package com.mycompany.deseneaza;

import java.awt.Color;
import java.util.ArrayList;
import static com.mycompany.deseneaza.Interfata.gr;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Linie extends Figura{
    ArrayList<Punct> puncte;
    int dxM = 0, dxm;
    int dyM = 0, dym;
    
    void calculeazaLimite(){
        dxm = 0;
        dym = 0;
        dxM = 0;
        dyM = 0;
        for(Punct p:puncte){
            if(p.x < dxm)
                dxm = p.x;
            if(p.x > dxM)
                dxM = p.x; 
            if(p.y < dym)
                dym = p.y; 
            if(p.y > dyM)
                dyM = p.y; 
        }
    }
    
    Linie(int xm, int ym, Color c, boolean u, boolean s){
        super(0, 0, c, false, false);
        puncte = new ArrayList();
        puncte.add(new Punct(xm, ym));
    }
    
    @Override
    public void inchide(){
        int xM = 0, xm = Integer.MAX_VALUE;
        int yM = 0, ym = Integer.MAX_VALUE;
        for(Punct p:puncte){
            if(p.x < xm)
                xm = p.x;
            if(p.x > xM)
                xM = p.x; 
            if(p.y < ym)
                ym = p.y; 
            if(p.y > yM)
                yM = p.y; 
        }
        
        x = (xm + xM) / 2;
        y = (ym + yM) / 2;
        
        for(Punct p:puncte){
            p.x -= x;
            p.y -= y;
        }
        
        calculeazaLimite();
    }
    
    @Override
    public void adauga(int xm, int ym){
        puncte.add(new Punct(xm, ym));
    }
    
    @Override
    void deseneaza() {
        int xv, yv;
        Punct pv = puncte.get(0);
        xv = pv.x + x;
        yv = pv.y + y;
        
        for(Punct p:puncte){
            gr.setColor(c);
            gr.drawLine(xv, yv, p.x + x, p.y + y);
            xv = p.x + x;
            yv = p.y + y;
        }
    }

    @Override
    void redimensioneaza(int xm, int ym) {}
    
    Linie(DataInputStream dis) throws IOException{
        super(dis);
        int n=Integer.parseInt(dis. readLine());
        puncte=new ArrayList();
        for(int i=0; i < n; i++){
            puncte.add(new Punct(
            Integer.parseInt(dis.readLine()),
            Integer.parseInt(dis.readLine())
            ));
            calculeazaLimite();
        }
    }
    
    public void salveaza(PrintStream ps){
        ps.println(3) ;
        super.salveaza(ps);
        ps.println(puncte.size());
        for (Punct p: puncte){
            ps.println(p.x);
            ps.println(p.y);
        }
    }
    
    Linie(ArrayList<Integer> numere) throws IOException{
        super(numere);
        int n=numere.remove(0);
        puncte=new ArrayList();
        for(int i=0; i < n; i++){
            puncte.add(new Punct(numere.remove(0),numere.remove(0)));
            calculeazaLimite();
        }
    }
    
    public void salveaza2(PrintStream ps){
        ps.print("3, ");
        super.salveaza2(ps);
        ps.print(puncte.size());
        for (Punct p: puncte){
            ps.print(", ");
            ps.print(p.x);
            ps.print(", ");
            ps.print(p.y);
        }
        ps.println();
    }
    
    Linie(DataInputStream dis, boolean citeste) throws IOException{
        super(dis, false);
        int n=dis.readInt();
        puncte=new ArrayList();
        for(int i=0; i < n; i++){
            puncte.add(new Punct(dis.readInt(),dis.readInt()));
            calculeazaLimite();
        }
    }
    
    public void salveaza3(DataOutputStream dos)throws IOException{
        dos.writeInt(3);
        super.salveaza3(dos);
        dos.writeInt(puncte.size());
        for (Punct p: puncte){
            dos.writeInt(p.x);
            dos.writeInt(p.y);
        }
    }
}
