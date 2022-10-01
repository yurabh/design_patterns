package structural_design_patterns.proxy;


public class RealImage implements Image {
    private final String fileName;

    public RealImage(String strFileName) {
        this.fileName = strFileName;
    }

    @Override
    public void showImage() {
        System.out.println("Show Image:" + fileName);
    }
}
