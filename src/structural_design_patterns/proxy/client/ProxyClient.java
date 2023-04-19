package structural_design_patterns.proxy.client;

import structural_design_patterns.proxy.Image;
import structural_design_patterns.proxy.impl.ProxyImage;

public class ProxyClient {
    public static void main(String[] args) {
        Image imgFirst = new ProxyImage("Image***");
        Image imgSecond = new ProxyImage("Image***2");
        imgFirst.showImage();
        imgSecond.showImage();
    }
}
