package com.mycompany.deseneaza;

import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Drept extends Figura{
    int r, width, height;

    public Drept(int x, int y, int r, Color c, boolean u, boolean s) {
        super(x,y,c,u,s);
        this.r = r;
        this.width = r * 2;
        this.height = r;
    }

    @Override
    void deseneaza() {
        Interfata.gr.drawRect(x - width, y - height, 2 * width, 2 * height);
        if(u){Interfata.gr.fillRect(x - width, y - height, 2 * width, 2 * height);}
    }

    @Override
    void redimensioneaza(int xm, int ym){
        sterge();
        this.width = (int)Math.sqrt((x-xm) * (x-xm));
        this.height = (int)Math.sqrt((y-ym) * (y-ym));
        if(10 >= height){
            height=10;}
        else if(height >= 150){
            height=150;}
        if(10 >= width){
            width=10;}
        else if(width >= 150){
            width=150;}
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
    
    Drept(DataInputStream dis) throws IOException{
        super(dis);
        width = Integer.parseInt(dis.readLine());
        height = Integer.parseInt(dis.readLine());
    }
    
    public void salveaza(PrintStream ps){
        ps.println(5);
        super.salveaza(ps);
        ps.println(width);
        ps.println(height);
    }
    
    Drept(ArrayList<Integer> numere) throws IOException{
        super(numere);
        width = numere.remove(0);
        height = numere.remove(0);
    }
    
    public void salveaza2(PrintStream ps){
        ps.print("5, ");
        super.salveaza2(ps);
        ps.print(width);
        ps.print(", ");
        ps.println(height);
    }
    
    Drept(DataInputStream dis, boolean citeste) throws IOException{
        super(dis, false);
        width = dis.readInt();
        height = dis.readInt();
    }
    
    public void salveaza3(DataOutputStream dos)throws IOException{
        dos.writeInt(5);
        super.salveaza3(dos);
        dos.writeInt(width);
        dos.writeInt(height);
    }
}
