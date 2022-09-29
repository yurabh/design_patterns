package creational_design_patterns.learn_information_expert_with_serialization_example.use_information_expert_stock_cash_register_sale_product_desc;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RunnerPattern {

    public static void main(String[] args) throws IOException {
        ProductDesc product = new ProductDesc("xlib", 12, 1,
                LocalDate.of(2012, 12, 12),
                LocalDate.of(2022, 10, 10));
        ProductDesc product1 = new ProductDesc("xlib1", 13, 2,
                LocalDate.of(2013, 1, 13),
                LocalDate.of(2023, 11, 11));
        ProductDesc product2 = new ProductDesc("xlib2", 14, 3,
                LocalDate.of(2014, 2, 14),
                LocalDate.of(2024, 12, 12));
        ProductDesc product3 = new ProductDesc("xlib3", 15, 4,
                LocalDate.of(2015, 3, 15),
                LocalDate.of(2025, 1, 13));
        ProductDesc product4 = new ProductDesc("xlib4", 16, 5,
                LocalDate.of(2016, 4, 16),
                LocalDate.of(2026, 2, 14));

        Stock.addProduct(product);
        Stock.addProduct(product);
        Stock.addProduct(product);
        Stock.addProduct(product1);
        Stock.addProduct(product2);
        Stock.addProduct(product3);
        Stock.addProduct(product4);

        List<ProductDesc> prod;
        prod = Stock.getProduct(product1, 3);
        for (ProductDesc pro : prod) {
            pro.showProductDesc();
        }

        System.out.println(" ");
        System.out.println("Name");
        System.out.println(" ");

        List<ProductDesc> prod1;
        prod1 = Stock.getProduct("xlib", 2);
        for (ProductDesc pro1 : prod1) {
            pro1.showProductDesc();
        }


        System.out.println("showInfo");
        Stock.showStock();


        boolean stock = Stock.findProduct("xlib1");
        System.out.println("Result: " + stock);

        boolean stock1 = Stock.findProduct(product4);
        System.out.println("Result2: " + stock1);


        product1.showProductDesc();
        int price = product1.getPrice();
        System.out.println("Price product: " + price);
        System.out.println(" ");

        SalesLineItem salesLineItem = new SalesLineItem(product, 2);
        SalesLineItem salesLineItem1 = new SalesLineItem(product1, 3);
        SalesLineItem salesLineItem2 = new SalesLineItem(product2, 4);
        SalesLineItem salesLineItem3 = new SalesLineItem(product3, 5);
        SalesLineItem salesLineItem4 = new SalesLineItem(product4, 6);

        salesLineItem2.showSalesItem();
        int subTotal = salesLineItem2.getSubTotal();
        System.out.println("The price of goods is quantitative: " + subTotal);
        System.out.println(" ");

        List<SalesLineItem> sale1 = new ArrayList<>();
        sale1.add(salesLineItem);
        sale1.add(salesLineItem1);
        sale1.add(salesLineItem2);
        sale1.add(salesLineItem3);
        sale1.add(salesLineItem4);


        Sale sale = new Sale(LocalDate.now(), LocalDate.now(), sale1);
        sale.showSale();
        System.out.println(" ");
        double total = sale.getTotol();
        System.out.println("Total purchase price : " + total);


        List<SalesLineItem> sale3 = new ArrayList<>();
        sale3.add(salesLineItem);
        sale3.add(salesLineItem1);
        sale3.add(salesLineItem2);
        sale3.add(salesLineItem3);
        sale3.add(salesLineItem4);


        Stock.showStock();
        Stock.addProduct(Stock.createProduct());
        Stock.addProduct(Stock.createProduct());
        Stock.validityProduct();
        Sale sale4 = new Sale();
        sale4.addSaleLineItem();
        CashRegister.addCheck(sale4);
        CashRegister.showCashRegisterCheck();
        CashRegister.showCheck(sale4);
        Sale sav = CashRegister.searchCheck(sale4);
        sav.showSale();


        Stock.addProduct(Stock.createProduct());
        Stock.createProduct();
        Stock.validityProduct();
        Stock.showStock();
        Stock.revalueGoods();
        Stock.showStock();
        System.out.println(" ");
        System.out.println("Stock:");
        System.out.println(" ");


        CashRegister.showCashRegisterCheck();
        System.out.println(" ");
        Stock.showStock();
        System.out.println(" ");


        Stock.savaDataAvaibelproducts("src/creational_design_patterns.learn_information_expert_with_serialization_example"
                + "/use_information_expert_stock_cash_register_sale_product_desc/"
                + "products_avialable_in_stock.txt");

        Stock.savaDataSpusaniProductu("src/creational_design_patterns.learn_information_expert_with_serialization_example"
                + "/use_information_expert_stock_cash_register_sale_product_desc/"
                + "products_written_off_goods_in_stock.txt");

        Stock.savaDataIncamproducts("src/creational_design_patterns.learn_information_expert_with_serialization_example"
                + "/use_information_expert_stock_cash_register_sale_product_desc/"
                + "products_in_cam_products_stock.txt");

        List<ProductDesc> productDesc;

        productDesc = (ArrayList<ProductDesc>) Stock.loadDataAvaibeleproducts
                ("src/creational_design_patterns.learn_information_expert_with_serialization_example"
                        + "/use_information_expert_stock_cash_register_sale_product_desc/"
                        + "products_avialable_in_stock.txt");

        System.out.println("Deserialize from file One: ");
        for (ProductDesc productOne : productDesc) {
            System.out.println(productOne.toString());
        }


        System.out.println("Deserialize from file Two: ");

        List<ProductDesc> productDesc1;

        productDesc1 = (ArrayList<ProductDesc>) Stock.loadDataSpusani
                ("src/creational_design_patterns.learn_information_expert_with_serialization_example"
                        + "/use_information_expert_stock_cash_register_sale_product_desc/"
                        + "products_written_off_goods_in_stock.txt");

        System.out.println("Deserialize from file Three: ");
        for (ProductDesc productTwo : productDesc1) {
            System.out.println(productTwo.toString());
        }


        List<ProductDesc> productDesc2;
        productDesc2 = (ArrayList<ProductDesc>) Stock.loadDataIncamproducts
                ("src/creational_design_patterns.learn_information_expert_with_serialization_example"
                        + "/use_information_expert_stock_cash_register_sale_product_desc/"
                        + "products_in_cam_products_stock.txt");

        for (ProductDesc productThree : productDesc2) {
            System.out.println(productThree.toString());
        }
    }
}
