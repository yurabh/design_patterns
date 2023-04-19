package structural_design_patterns.proxy.impl;

import structural_design_patterns.proxy.Image;

public class RealImage implements Image {
    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void showImage() {
        System.out.println("Show Image: " + fileName);
    }
}
