package com.mycompany.deseneaza;

public class Punct {
    int x, y;
    public Punct(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Punct(Punct p){
        x = p.x;
        y = p.y;
    }
}
