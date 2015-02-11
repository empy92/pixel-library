/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pixel_library.image;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import pixel_library.pixel.Pixel;

/**
 *
 * @author davide
 */
public class ImageAnalyser {

    public static ArrayList<Pixel> convertBufferImageToPixel(BufferedImage image){
        ArrayList<Pixel> pixels = new ArrayList<>();
        for(int x=0; x<image.getWidth(); x++){
            for(int y=0; y<image.getHeight(); y++){
                pixels.add(new Pixel(x, y, image.getRGB(x, y)));
            }
        }
        return pixels;
    }
    
    public static BufferedImage convertPixelToBufferImage(ArrayList<Pixel> pixels, int width, int height){
        Iterator<Pixel> iter = pixels.iterator();
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_4BYTE_ABGR);
        for(int x=0; x<width; x++){
            for(int y=0; y<height; y++){
                image.setRGB(x, y, iter.next().getColor().getRGB());
            }
        }
        return image;
    }
    
}
