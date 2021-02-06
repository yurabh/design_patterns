package learn_abstract_method_furniture_example;

public class Chair implements Creatable {

    private int countLegs;
    private int legLength;
    private int lengthOf;
    private int width;
    private String colorChair;
    private String glue;

    public void createProduction() {
        System.out.println("Create chair");
    }

    public void cutTheWorkpiece(int countLegs1, int legLength, int lengthOf, int width) {
        this.countLegs = countLegs1;
        this.legLength = legLength;
        this.lengthOf = lengthOf;
        this.width = width;
    }

    public void chopWorkpieces(String color) {
        this.colorChair = color;
    }

    public void gluesChair(String glue) {
        this.glue = glue;
    }

    public void show() {
        System.out.println("count legs chair: " + countLegs);
        System.out.println("lrgLength: " + legLength);
        System.out.println("length Of: " + lengthOf);
        System.out.println("width: " + width);
        System.out.println("color chair: " + colorChair);
        System.out.println("glue: " + glue);
    }
}
