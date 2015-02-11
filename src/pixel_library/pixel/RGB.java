package pixel_library.pixel;

import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author davide
 */
public class RGB {
    private int R;
    private int G;
    private int B;
    private int RGB;
    
    public RGB(int R, int G, int B) {
        setRGB(R, G, B);
        
    }
    
    public RGB(int RGB){
        setRGB(RGB);
    }
    
    public final void setR(int R){
        this.R = R;
        updateRGB();
    }
    
    public final void setG(int G){
        this.G = G;
        updateRGB();
    }
    
    public final void setB(int B){
        this.B = B;
        updateRGB();
    }
    
    public final void setRGB(int RGB){
        this.RGB = RGB;
        updateSingleRGB();
    }
    
    public final void setRGB(int R, int G, int B){
        setR(R);
        setG(G);
        setB(B);
        updateRGB();
    }
    
    public int getR(){
        return R;
    }
    
    public int getG(){
        return G;
    }
    
    public int getB(){
        return B;
    }
    
    public int getRGB(){
        return RGB;
    }
    
    private void updateSingleRGB(){
        Color c = new Color(RGB);
        setRGB(c.getRed(), c.getGreen(), c.getBlue());
    }
    
    private void updateRGB(){
        Color c = new Color(R, G, B);
        setRGB(c.getRGB());
    }
    
}
