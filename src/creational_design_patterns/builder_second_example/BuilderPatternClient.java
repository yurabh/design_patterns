package creational_design_patterns.builder_second_example;

public class BuilderPatternClient {
    public static void main(String[] args) {
        Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();
        System.out.println(comp.toString());
    }
}
