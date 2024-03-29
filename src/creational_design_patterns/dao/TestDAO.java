package creational_design_patterns.dao;

import creational_design_patterns.dao.domain.Address;
import creational_design_patterns.dao.factory.DAOFactory;

public class TestDAO {

    public static void main(String[] args) {

        DAOFactory dAOFactory = DAOFactory.getDaoFactory(1);
        final Address byId = dAOFactory.getAddressDAO().getById(2);
        System.out.println(byId);
    }
}
