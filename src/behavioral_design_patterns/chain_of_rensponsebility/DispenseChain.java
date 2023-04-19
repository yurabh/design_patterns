package behavioral_design_patterns.chain_of_rensponsebility;

import behavioral_design_patterns.chain_of_rensponsebility.domain.Currency;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}
