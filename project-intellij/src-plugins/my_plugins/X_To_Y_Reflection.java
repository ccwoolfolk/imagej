package my_plugins;

import ij.ImagePlus;
import ij.plugin.filter.PlugInFilter;
import ij.process.ImageProcessor;

/*
* Reflect the image about the `y = x` line and show the new image.
 */
public class X_To_Y_Reflection implements PlugInFilter {
    public int setup(String args, ImagePlus im) {
        return DOES_8G;
    }
    public void run(ImageProcessor ip) {
        int M = ip.getWidth();
        int N = ip.getHeight();

        ImageProcessor newIp = ip.createProcessor(N, M);
        for (int u = 0; u < M; u++) {
            for (int v = 0; v < N; v++) {
                int p = ip.getPixel(u, v);
                newIp.putPixel(v, u, p);
            }
        }
        new ImagePlus("Reflected Image", newIp).show();
    }
}
