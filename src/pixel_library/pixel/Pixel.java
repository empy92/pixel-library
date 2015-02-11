package pixel_library.pixel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



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

    public Pixel(int x, int y, int R, int G, int B) {
        initXY(x, y);
        rgb = new RGB(R, G, B);
        neighbors = new ArrayList<>();
    }
    
    public Pixel(int x, int y, int RGB) {
        initXY(x, y);
        rgb = new RGB(RGB);
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
