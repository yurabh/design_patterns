package creational_design_patterns.learn_dao.inteface;

import creational_design_patterns.learn_dao.domain.Student;

public interface StudentDAO {
    Student getById(int id);
}
