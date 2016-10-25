package dao;

import bean.FileBean;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.*;
import java.sql.Date;
import java.util.*;

/**
 * Created by yinxu on 2016/10/18.
 */
public class FileDao {
    private DriverManagerDataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private  String name;
    private int id;
    private FileBean fileBean;
    private java.sql.Date updatetime;
    private String path;
    static final String  createFile=" insert into  file (id,name,path,updatetime) values (?,?,?,?)";
    static final String  dropTabel="DROP TABLE `test`.`file`";

    public static final String createTable= ""+
            "Create table file" +
            "(id INT, "+
            "name varchar(256)," +
            "path varchar(1024)," +
            "updatetime DATE," +
            "PRIMARY KEY (id))";
    public  FileDao(){

    }
    public DriverManagerDataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DriverManagerDataSource dataSource) {

        this.dataSource = dataSource;
        jdbcTemplate=new JdbcTemplate(this.dataSource);
    }




    public  void  CreateFile(FileBean fileBean) throws SQLException {
          name=fileBean.getName();
         path=fileBean.getAbsoultPath();
         updatetime=fileBean.getUpdatetime();
        id=fileBean.getId();
            System.out.println(path);

        jdbcTemplate.update(createFile,new Object[]{id,name,path,updatetime});



    }
    public  void CreateFile(final ArrayList<FileBean> list){

        jdbcTemplate.batchUpdate(createFile, new BatchPreparedStatementSetter() {
            public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
                    fileBean=list.get(i);
                    name=fileBean.getName();
                    path=fileBean.getAbsoultPath();
                    updatetime=fileBean.getUpdatetime();
                    id=fileBean.getId();
                    preparedStatement.setInt(1,id);
                    preparedStatement.setString(2,name);
                    preparedStatement.setString(3,path);
                    preparedStatement.setDate(4, updatetime);
            }

            public int getBatchSize() {
                return list.size();
            }
        });

    }
    public  void  updateFile(){

    }
    public  void createTable() throws SQLException {

        jdbcTemplate.update(createTable);

    }
    public void DropTable(){
        jdbcTemplate.execute(dropTabel);

    }



}
