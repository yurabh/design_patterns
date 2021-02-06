package learn_dao.impl_factory;

import learn_dao.impl_dao.OracleAddressDAO;
import learn_dao.impl_dao.OracleStudentDAO;
import learn_dao.factory.DAOFactory;
import learn_dao.inteface.AddressDAO;
import learn_dao.inteface.StudentDAO;

public class OracleDAOFactory extends DAOFactory {

    public StudentDAO getStudentDAO() {
        return new OracleStudentDAO();
    }

    public AddressDAO getAddressDAO() {
        return new OracleAddressDAO();
    }
}
