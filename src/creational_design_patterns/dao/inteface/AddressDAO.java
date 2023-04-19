package creational_design_patterns.dao.inteface;

import creational_design_patterns.dao.domain.Address;

public interface AddressDAO {
    Address getById(int id);
}
