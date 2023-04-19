package behavioral_design_patterns.template_method.client;

import behavioral_design_patterns.template_method.GlassHouse;
import behavioral_design_patterns.template_method.HouseTemplate;
import behavioral_design_patterns.template_method.WoodenHouse;

public class HousingClient {
    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();
        houseType.buildHouse();
        System.out.println("************");
        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}
