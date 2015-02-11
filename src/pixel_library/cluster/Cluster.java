package pixel_library.cluster;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import pixel_library.pixel.Pixel;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author davide
 */
public class Cluster {

    private final ArrayList<Pixel> pixels;
    
    public Cluster() {
        pixels = new ArrayList<>();
    }
    
    public void addPixel(Pixel pixel){
        pixels.add(pixel);
    }
    
    public void addCluster(Cluster cluster){
        Iterator<Pixel> iter = cluster.pixels.iterator();
        while(iter.hasNext()){
            pixels.add(iter.next());
        }
    }
    
    public ArrayList<Pixel> getPixels(){
        return pixels;
    }
}
