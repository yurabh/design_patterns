package learn_dao.impl_factory;

import learn_dao.impl_dao.MySQLAddressDAO;
import learn_dao.impl_dao.MySQLStudentDAO;
import learn_dao.factory.DAOFactory;
import learn_dao.inteface.AddressDAO;
import learn_dao.inteface.StudentDAO;

public class MySQLDAOFactory extends DAOFactory {

    public StudentDAO getStudentDAO() {
        return new MySQLStudentDAO();
    }

    public AddressDAO getAddressDAO() {
        return new MySQLAddressDAO();
    }
}
