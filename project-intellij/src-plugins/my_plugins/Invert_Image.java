package my_plugins;

import ij.ImagePlus;
import ij.plugin.filter.PlugInFilter;
import ij.process.ImageProcessor;

import java.awt.*;

/*
 * Invert pixel intensity 8-bit image
 */
public class Invert_Image implements PlugInFilter {
    public int setup(String args, ImagePlus im) {
        return DOES_8G;
    }

    public void run(ImageProcessor ip) {
        int M = ip.getWidth();
        int N = ip.getHeight();

        for (int u = 0; u < M; u++) {
            for (int v = 0; v < N; v++) {
                int p = ip.getPixel(u, v);
                ip.putPixel(u, v, 255 - p);
            }
        }
    }
}
