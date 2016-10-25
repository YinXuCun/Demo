import java.sql.*;

/**
 * Created by yinxu on 2016/10/17.
 */
public class mysqlDemo implements IConstant{
    public static final  String selectUserById="SELECT  * FROM  user  WHERE  id=?";
    public static final String updateUser="update user set location=? where id=?";
    public static final String selectUser = "select * from user";
    public static final String createUser= ""+
            "Create table user" +
            "(id int," +
            "name varchar(20)," +
            "sex int," +
            "location varchar(20)," +
            "primary key(id))";
     static {
        try {
            Class.forName("com.mysql.jdbc.Driver");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.print("class com.mysql.Driver not found");
        }
    }
    public static void main(String[] args) throws SQLException {
        updateuser();
        selectuserById();
        query();
    }

    private static void getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection(url, user, pwd);
        conn.close();
    }
    private static void query() throws SQLException {
        Connection conn = DriverManager.getConnection(url,user,pwd);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(selectUser);
        int colCount = rs.getMetaData().getColumnCount();
        for (int i = 1; i <= colCount; i++) {
            System.out.print(rs.getMetaData().getColumnLabel(i) + "\t");
        }
        System.out.println();
        while (rs.next()) {
            for (int i = 1; i <= colCount; i++) {
                System.out.print(rs.getObject(i) + "\t");
            }
        }
        rs.close();
        st.close();
        conn.close();
    }
    public  static void createUSerTable() throws SQLException {
        Connection connection=DriverManager.getConnection(url,user,pwd);
        Statement statement=connection.createStatement();
       statement.execute(createUser);
        statement.close();
        connection.close();
    }
    public  static void  selectuserById() throws SQLException {
        Connection connection=DriverManager.getConnection(url,user,pwd);
        PreparedStatement preparedStatement=connection.prepareStatement(selectUserById);
        preparedStatement.setInt(1,2);
        ResultSet rs=preparedStatement.executeQuery();
        int colCount=rs.getMetaData().getColumnCount();
        for (int i=1;i<=colCount;i++){
            System.out.print(rs.getMetaData().getColumnLabel(i)+"\t");
        }
        while (rs.next()){
            for(int i=1;i<=colCount;i++){
                System.out.print(rs.getObject(i)+"\t");
            }
        }
        preparedStatement.close();;
        connection.close();
    }
    public static void  updateuser() throws SQLException {
        Connection connection=DriverManager.getConnection(url,user,pwd);
        PreparedStatement preparedStatement=connection.prepareStatement(updateUser);
        preparedStatement.setString(1,"zj");
        preparedStatement.setInt(2,2);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }
}
