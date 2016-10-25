import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by yinxu on 2016/10/12.
 */
public class FileManager {
    private JTextField textField1;
    private JButton suoyin;
    private JButton find;
    private JTextArea listfilename;

    private static AbstractApplicationContext context;
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("FileManager");
        frame.setContentPane(new FileManager().jpannel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        context = new ClassPathXmlApplicationContext("\\Beans.xml");
        listFile listfile=(listFile)context.getBean("listFile");
        string_write s=(string_write)context.getBean("string_write");
        //s.wirte(listfile.list_the_File());
        context.registerShutdownHook();
    }

    private JPanel jpannel1;

    public FileManager() {
        find.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                char[] ch=new char[2048];
                StringBuilder sb=new StringBuilder();
                try {
                    FileReader fr=new FileReader("C:/Users/yinxu/name.txt");
                    try {
                        while (fr.read(ch)!=-1){
                        sb.append(ch);
                        }
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    finally {
                        try {
                            fr.close();
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    }
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
                listfilename.setText(String.valueOf(sb));
                }



        });
        suoyin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
