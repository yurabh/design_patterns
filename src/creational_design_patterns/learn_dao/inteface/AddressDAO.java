package creational_design_patterns.learn_dao.inteface;

import creational_design_patterns.learn_dao.domain.Address;

public interface AddressDAO {
    Address getById(int id);
}
