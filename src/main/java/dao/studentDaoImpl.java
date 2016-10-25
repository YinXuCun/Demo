package dao;

import bean.student;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by yinxu on 2016/10/18.
 */
public class studentDaoImpl implements studentDao{
    public void setDataSource(DataSource ds) {

    }

    public int create(String name, Integer age, Integer grader) {
        return 0;
    }

    public student getStudent() {
        return null;
    }

    public List<student> listStudents() {
        return null;
    }

    public boolean delete(int id) {
        return false;
    }

    public void update(Integer id, Integer age) {

    }
}
