package pixel_library.pixel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author davide
 */
public class Pixel {
    private int x;
    private int y;
    private RGB rgb;
    private final ArrayList<Pixel> neighbors;

    public Pixel(int x, int y, int r, int g, int b) {
        initXY(x, y);
        rgb = new RGB(r, g, b);
        neighbors = new ArrayList<>();
    }
    
    public Pixel(int x, int y, int rgb) {
        initXY(x, y);
        this.rgb = new RGB(rgb);
        neighbors = new ArrayList<>();
    }
    
    public final void setX(int x){
        this.x = x;
    }
    
    public final void setY(int y){
        this.y = y;
    }
    
    private void initXY(int x, int y){
        setX(x);
        setY(y);
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public RGB getColor(){
        return rgb;
    }
    
    public void addNeighbors(Pixel neighbor){
        this.neighbors.add(neighbor);
    }
    
    public ArrayList<Pixel> getNeighbors(){
        return neighbors;
    }
    
}
