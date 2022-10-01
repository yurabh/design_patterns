package structural_design_patterns.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("Image***");
        Image img2 = new ProxyImage("Image***2");
        img1.showImage();
        img2.showImage();
    }
}
