package creational_design_patterns.learn_dao.impl_factory;

import creational_design_patterns.learn_dao.impl_dao.OracleAddressDAO;
import creational_design_patterns.learn_dao.impl_dao.OracleStudentDAO;
import creational_design_patterns.learn_dao.factory.DAOFactory;
import creational_design_patterns.learn_dao.inteface.AddressDAO;
import creational_design_patterns.learn_dao.inteface.StudentDAO;

public class OracleDAOFactory extends DAOFactory {

    public StudentDAO getStudentDAO() {
        return new OracleStudentDAO();
    }

    public AddressDAO getAddressDAO() {
        return new OracleAddressDAO();
    }
}
