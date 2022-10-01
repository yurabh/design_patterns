package behavioral_design_patterns.template_method;

public class HousingClient {
    public static void main(String[] args) {

        HouseTemplate houseType = new WoodenHouse();
        houseType.buildHouse();
        System.out.println("************");
        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}
