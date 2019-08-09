package you.shaoxin.repository;

import you.shaoxin.domin.Student;

import java.util.Collection;

/**
 * @author: 游菜花 -
 * @create: 2019-08-08 22:31
 */
public interface StudentRepository {

    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);

}
