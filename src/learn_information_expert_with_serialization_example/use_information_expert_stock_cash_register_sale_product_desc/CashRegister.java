package learn_information_expert_with_serialization_example.use_information_expert_stock_cash_register_sale_product_desc;

import java.util.ArrayList;
import java.util.List;

public class CashRegister {

    private static List<Sale> sales = new ArrayList<>();

    public static void addCheck(Sale sale) {
        if (CashRegister.verifySale(sale)) {
            sales.add(sale);
        } else {
            System.out.println("There is no formed purchase therefore we"
                    + " do not add the check to the cash register");
        }
    }


    public static boolean verifySale(Sale sale) {
        if (sale.verifyItems()) {
            return true;
        }
        return false;
    }


    public static void сreatNewSale() {
        Sale sale = new Sale();
        sale.addSaleLineItem();
        sales.add(sale);
    }


    public static Sale searchCheck(Sale sale) {
        Sale sale2 = null;
        if (CashRegister.verifySale(sale) && (!sales.isEmpty())) {
            int count = 0;
            for (Sale check : sales) {
                if (check.equals(sale)) {
                    count++;
                    sale2 = check;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("No check");
            }
        } else {
            System.out.println("There are no checks in the cash register "
                    + "or the transferred check for search is not clear");
        }
        return sale2;
    }


    public static void showCheck(Sale sale) {
        if (CashRegister.verifySale(sale) && (!sales.isEmpty())) {
            for (Sale check : sales) {
                if (check.equals(sale)) {
                    check.showSale();
                    break;
                }
            }
        } else {
            System.out.println("The check you wanted to withdraw was not found or "
                    + "the check you submitted was invalid.");
        }
    }


    public static void showCashRegisterCheck() {
        if (!sales.isEmpty()) {
            System.out.println("CashRegister: ");
            for (Sale i : sales) {
                System.out.println("Number Check: " + i);
                i.showSale();
            }
        } else {
            System.out.println("No purchase and relatively no checks");
        }
    }
}
