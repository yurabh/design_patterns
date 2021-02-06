package learn_dao;

import learn_dao.domain.Address;
import learn_dao.factory.DAOFactory;

public class TestDAO {

    public static void main(String[] args) {

        DAOFactory dAOFactory = DAOFactory.getDaoFactory(1);
        final Address byId = dAOFactory.getAddressDAO().getById(2);
        System.out.println(byId);
    }
}
