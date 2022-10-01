package structural_design_patterns.proxy;

public class ProxyImage implements Image {
    private RealImage img;
    private final String fileName;

    public ProxyImage(String strFileName) {
        this.fileName = strFileName;
    }

    @Override
    public void showImage() {
        if (img == null) {
            img = new RealImage(fileName);
        }
        img.showImage();
    }
}
