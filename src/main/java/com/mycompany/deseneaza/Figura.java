package com.mycompany.deseneaza;

import static com.mycompany.deseneaza.Interfata.gr;
import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public abstract class Figura {
    int x, y;
    Color c;
    boolean u, s;

    public Figura(int x, int y, Color c, boolean u, boolean s) {
        this.x = x;
        this.y = y;
        this.c = c;
        this.u = u;
        this.s = s;
    }
    
    abstract void deseneaza();
    abstract void redimensioneaza(int xm, int ym);
    abstract void adauga(int xm, int ym);
    abstract void inchide();
    void afiseaza() {
        gr.setColor(c);
        deseneaza();
        selectat();
    }
    
    void sterge() {
        gr.setColor(Color.white);
        if(u){deseneaza();}
        else{
            u = true;
            deseneaza();
            u = false;
        }
    }
    
    void mutare(int xm, int ym){
        sterge();     
        x = xm;
        y = ym;
        afiseaza();
    }
    
    void selectat(){
        if(s){
            gr.setColor(Color.BLACK);
            gr.drawLine(x-5, y, x+5, y);
            gr.drawLine(x, y-5, x, y+5);
            gr.setColor(c);
        }
        else{
            if(u){
            gr.setColor(c);
            gr.drawLine(x-5, y, x+5, y);
            gr.drawLine(x, y-5, x, y+5);
            }
            else{
                gr.setColor(Color.WHITE);
                gr.drawLine(x-5, y, x+5, y);
                gr.drawLine(x, y-5, x, y+5);
                gr.setColor(c);
            }
        }
    }
    
    Figura(DataInputStream dis) throws IOException{
        c = new Color(Integer.parseInt(dis.readLine()));
        x = Integer.parseInt(dis.readLine());
        y = Integer.parseInt(dis.readLine());
        u = Boolean.parseBoolean(dis.readLine());
    }
    
    Figura(ArrayList<Integer> numere) throws IOException{
        c = new Color(numere.remove(0));
        x = numere.remove(0);
        y = numere.remove(0);
        int aux;
        aux = numere.remove(0);
        if(aux==1)u = true;
        else u = false;
    }
    
    Figura(DataInputStream dis, boolean citeste) throws IOException{
        c = new Color(dis.readInt());
        x = dis.readInt();
        y = dis.readInt();
        int aux;
        aux = dis.readInt();
        if(aux==1)u = true;
        else u = false;
    }
    public void salveaza(PrintStream ps){
        ps.println(c.getRGB());
        ps.println(x);
        ps.println(y);
        ps.println(u);
    }
    
    public void salveaza2(PrintStream ps){
        ps.print(c.getRGB() + ", ");
        ps.print(x + ", ");
        ps.print(y + ", ");
        if(u)ps.print("1, ");
        else ps.print("0, ");
    }
    
    public void salveaza3(DataOutputStream dos)throws IOException{
        dos.writeInt(c.getRGB());
        dos.writeInt(x);
        dos.writeInt(y);
        if(u)dos.writeInt(1);
        else dos.writeInt(0);
    }
}
