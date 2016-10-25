package dao;

import bean.student;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by yinxu on 2016/10/18.
 */
public interface studentDao {
    public void setDataSource(DataSource ds);
    public int create(String name,Integer age,Integer grader);
    public student getStudent();
    public List<student> listStudents();
    public boolean delete(int id);
    public void update(Integer id,Integer age);
}
