package creational_design_patterns.learn_dao.impl_factory;

import creational_design_patterns.learn_dao.impl_dao.MySQLAddressDAO;
import creational_design_patterns.learn_dao.impl_dao.MySQLStudentDAO;
import creational_design_patterns.learn_dao.factory.DAOFactory;
import creational_design_patterns.learn_dao.inteface.AddressDAO;
import creational_design_patterns.learn_dao.inteface.StudentDAO;

public class MySQLDAOFactory extends DAOFactory {

    public StudentDAO getStudentDAO() {
        return new MySQLStudentDAO();
    }

    public AddressDAO getAddressDAO() {
        return new MySQLAddressDAO();
    }
}
