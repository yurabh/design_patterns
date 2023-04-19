package creational_design_patterns.dao.impl_factory;

import creational_design_patterns.dao.impl_dao.MySQLAddressDAO;
import creational_design_patterns.dao.impl_dao.MySQLStudentDAO;
import creational_design_patterns.dao.factory.DAOFactory;
import creational_design_patterns.dao.inteface.AddressDAO;
import creational_design_patterns.dao.inteface.StudentDAO;

public class MySQLDAOFactory extends DAOFactory {

    public StudentDAO getStudentDAO() {
        return new MySQLStudentDAO();
    }

    public AddressDAO getAddressDAO() {
        return new MySQLAddressDAO();
    }
}
