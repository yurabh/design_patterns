package behavioral_design_patterns.chain_of_rensponsebility.client;

import behavioral_design_patterns.chain_of_rensponsebility.*;
import behavioral_design_patterns.chain_of_rensponsebility.domain.Currency;
import behavioral_design_patterns.chain_of_rensponsebility.impl.Dollar10Dispenser;
import behavioral_design_patterns.chain_of_rensponsebility.impl.Dollar20Dispenser;
import behavioral_design_patterns.chain_of_rensponsebility.impl.Dollar50Dispenser;

import java.util.Scanner;

public class ATMDispenseChainClient {
    private final DispenseChain c1;
    private final DispenseChain c2;
    private final DispenseChain c3;

    public ATMDispenseChainClient() {
        this.c1 = new Dollar50Dispenser();
        this.c2 = new Dollar20Dispenser();
        this.c3 = new Dollar10Dispenser();

        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        ATMDispenseChainClient atmDispenser = new ATMDispenseChainClient();
        while (true) {
            int amount;
            System.out.println("Enter amount to dispense: \n");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            atmDispenser.c1.dispense(new Currency(amount));
        }
    }
}
