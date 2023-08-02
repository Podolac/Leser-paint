package com.mycompany.deseneaza;

import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Patrat extends Figura{
    int r;

    public Patrat(int x, int y, int r, Color c, boolean u, boolean s) {
        super(x,y,c,u,s);
        this.r = r;
    }

    @Override
    void deseneaza() {
        Interfata.gr.drawRect(x - r, y - r, 2 * r, 2 * r);
        if(u){Interfata.gr.fillRect(x - r, y - r, 2 * r, 2 * r);}
    }

    @Override
    void redimensioneaza(int xm, int ym){
        sterge();     
        r = (int)Math.sqrt((x-xm) * (x-xm) + (y-ym) * (y-ym));
        if(10 >= r){
            r=10;}
        else if(r >= 100){
            r=100;}
        afiseaza();
    }

    @Override
    void adauga(int xm, int ym) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    void inchide() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    Patrat(DataInputStream dis) throws IOException{
        super(dis);
        r = Integer.parseInt(dis.readLine());
    }
    
    public void salveaza(PrintStream ps){
        ps.println(2);
        super.salveaza(ps);
        ps.println(r);
    }
    
    Patrat(ArrayList<Integer> numere) throws IOException{
        super(numere);
        r=numere.remove(0);
        
    }
    
    public void salveaza2(PrintStream ps){
        ps.print("2, ");
        super.salveaza2(ps);
        ps.println(r);
    }
    
    Patrat(DataInputStream dis, boolean citeste) throws IOException{
        super(dis, false);
        r=dis.readInt();
    }
    
    public void salveaza3(DataOutputStream dos)throws IOException{
        dos.writeInt(2);
        super.salveaza3(dos);
        dos.writeInt(r);
    }
}
