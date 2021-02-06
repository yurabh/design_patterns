package learn_abstract_method_furniture_example;

public class Table implements Creatable {

    private int countLegs;
    private int legLength;
    private int lengthOf;
    private int width;
    private String colorTable;
    private String glue;

    public void createProduction() {
        System.out.println("create Table");
    }

    public void cutTheWorkpiece(int countLegs, int legLength, int lengthOf, int width) {
        this.countLegs = countLegs;
        this.legLength = legLength;
        this.lengthOf = lengthOf;
        this.width = width;
    }

    public void chopWorkpieces(String color) {
        this.colorTable = color;
    }

    public void gluesChair(String glue) {
        this.glue = glue;
    }

    public void show() {

        System.out.println("count legs " + countLegs);
        System.out.println("leg count: " + legLength);
        System.out.println("legLengthOf: " + lengthOf);
        System.out.println("width: " + width);
        System.out.println("colorTable: " + colorTable);
        System.out.println("glue: " + glue);
    }
}
