package behavioral_design_patterns.chain_of_rensponsebility;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}
