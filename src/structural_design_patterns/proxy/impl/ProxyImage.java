package structural_design_patterns.proxy.impl;

import structural_design_patterns.proxy.Image;

public class ProxyImage implements Image {
    private RealImage img;
    private final String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void showImage() {
        if (img == null) {
            img = new RealImage(fileName);
        }
        img.showImage();
    }
}
