package pixel;

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

    public RGB(int R, int G, int B) {
        setR(R);
        setG(G);
        setB(B);
    }
    
    public final void setR(int R){
        this.R = R;
    }
    
    public final void setG(int G){
        this.G = G;
    }
    
    public final void setB(int B){
        this.B = B;
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
    
    
}
