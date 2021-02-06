package learn_dao.factory;

import learn_dao.impl_factory.MySQLDAOFactory;
import learn_dao.impl_factory.OracleDAOFactory;
import learn_dao.inteface.AddressDAO;
import learn_dao.inteface.StudentDAO;

public abstract class DAOFactory {

    public static final int MYSQL = 1;
    public static final int ORACLE = 2;

    public abstract StudentDAO getStudentDAO();

    public abstract AddressDAO getAddressDAO();

    public static DAOFactory getDaoFactory(int factoryId) {
        switch (factoryId) {
            case 1:
                return new MySQLDAOFactory();
            case 2:
                return new OracleDAOFactory();
            default:
                return null;
        }
    }
}
