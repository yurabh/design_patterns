package creational_design_patterns.learn_information_expert_with_serialization_example.serialization;

import creational_design_patterns.learn_information_expert_with_serialization_example.use_information_expert_stock_cash_register_sale_product_desc.ProductDesc;

import java.util.ArrayList;

public class SerialisationTest {

    private static ArrayList<ProductDesc> productDesc = new ArrayList<>();

    public static void main(String[] args) {

        productDesc.add(new ProductDesc(1, "Tea", 2));

        productDesc.add(new ProductDesc(12, "Tomato", 21));

        Serializer.saveData("src/creational_design_patterns.learn_information_expert_with_serialization_example"
                + "/serialization/products.txt", productDesc);

        productDesc = (ArrayList<ProductDesc>) Serializer.loadData("src/creational_design_patterns.learn_information_expert_with_serialization_example"
                + "/serialization/products.txt");

        for (ProductDesc product : productDesc) {
            System.out.println(product.toString());
        }
    }
}
