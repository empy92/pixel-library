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
    private int r;
    private int g;
    private int b;
    private int rgb;
    
    public RGB(int r, int g, int b) {
        setRGB(r, g, b);
        updateRGB();
    }
    
    public RGB(int rgb){
        setRGB(rgb);
        updateSingleRGB();
    }
    
    public final void setR(int r){
        this.r = r;
        updateRGB();
    }
    
    public final void setG(int g){
        this.g = g;
        updateRGB();
    }
    
    public final void setB(int b){
        this.b = b;
        updateRGB();
    }
    
    public final void setRGB(int rgb){
        this.rgb = rgb;
    }
    
    public final void setRGB(int r, int g, int b){
        setR(r);
        setG(g);
        setB(b);
    }
    
    public int getR(){
        return r;
    }
    
    public int getG(){
        return g;
    }
    
    public int getB(){
        return b;
    }
    
    public int getRGB(){
        return rgb;
    }
    
    private void updateSingleRGB(){
        Color c = new Color(rgb);
        setRGB(c.getRed(), c.getGreen(), c.getBlue());
    }
    
    private void updateRGB(){
        Color c = new Color(r, g, b);
        setRGB(c.getRGB());
    }

    @Override
    public boolean equals(Object obj) {
        boolean equals = false;
        if(obj != null){
            if(getClass() == obj.getClass()) {
                final RGB other = (RGB) obj;
                if(this.rgb == other.rgb) {
                    equals = true;
                }
            }
        }
        return equals;
    }
    
    //override hashCode
    
}
