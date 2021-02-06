package learn_dao.inteface;

import learn_dao.domain.Student;

public interface StudentDAO {
    Student getById(int id);
}
