package creational_design_patterns.dao.inteface;

import creational_design_patterns.dao.domain.Student;

public interface StudentDAO {
    Student getById(int id);
}
