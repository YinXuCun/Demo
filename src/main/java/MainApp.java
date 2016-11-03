import bean.FileBean;
import dao.FileDao;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by yinxu on 2016/10/18.
 */
public class MainApp {

    public static void main(String args[])  {
        System.out.println(2^4);
        /*ArrayList<FileBean> lsit;
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("\\Beans.xml");
        FileDao fileDao= (FileDao) context.getBean("FileDao");


        try {
            fileDao.createTable();
        } catch (SQLException e) {
            fileDao.DropTable();
            e.printStackTrace();
        }

        listFile listfile=(listFile)context.getBean("listFile");
        try {
            ArrayList<FileBean>list=listfile.list_the_File();
            fileDao.CreateFile(list);
        } catch (IOException e) {
            fileDao.DropTable();
            e.printStackTrace();

        }
        finally {

        }

        context.registerShutdownHook();*/

    }
}
