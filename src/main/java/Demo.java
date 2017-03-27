import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.appender.SyslogAppender;
import org.apache.logging.log4j.core.config.plugins.convert.TypeConverters;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellAddress;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.format.datetime.joda.DateTimeFormatterFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by yinxu on 2016/9/28.
 */
public class Demo {


    public static void main(String args[]) throws IOException {



        Calendar now = Calendar.getInstance();
        System.out.println("年: " + now.get(Calendar.YEAR));
        System.out.println("月: " + (now.get(Calendar.MONTH) + 1) + "");
        System.out.println("日: " + now.get(Calendar.DAY_OF_MONTH));
        System.out.println("时: " + now.get(Calendar.HOUR_OF_DAY));
        System.out.println("分: " + now.get(Calendar.MINUTE));
        System.out.println("秒: " + now.get(Calendar.SECOND));
     /*   SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        try {
            date=fmt.parse("2017-3-25");

            long  time=date.getTime();
            Date date1=new Date(time);
            System.out.println(date1.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }*/


        /*ExtractDataFromeExcel excelPress=new ExtractDataFromeExcel("C:\\Users\\yinxu\\Documents\\ddyx.xls");
        String   str="2017-3-24";
        DateFormat format=DateFormat.getDateInstance();
        try {
            Date date=format.parse(str);
            Date    curDate    =   new Date(System.currentTimeMillis());


            long nh = 1000*60*60;
            long diff=curDate.getTime()-date.getTime();

            long hour = diff/nh;
            System.out.println(hour);


        } catch (ParseException e) {
            e.printStackTrace();
        }
*//*
        ExtractDataFromeExcel extractDataFromeExcel=new ExtractDataFromeExcel("C:\\Users\\yinxu\\Documents\\ddyxs.xls")
        ArrayList<String> arrayList=extractDataFromeExcel.ExtractData();
        HashMap<String,String> hashMap=new HashMap<String, String>();
        for (String  s:arrayList) {
            String[] ss = s.split("flower");
            if (ss.length == 1) {

                hashMap.put(ss[0], " ");
                System.out.println(s);
            } else {
                hashMap.put(ss[0], ss[1]);
                System.out.println(s);
            }
        }
        for (Object s:hashMap.keySet().toArray()){
            System.out.println("hashMaap"+(String)s+hashMap.get(s));
        }
*/

             /*       try {
                        InputStream excel = new FileInputStream("C:\\Users\\yinxu\\Documents\\ddyxs.xls");
                        HSSFWorkbook wb = new HSSFWorkbook(excel);
                        HSSFSheet sheet = wb.getSheetAt(0);
                        Iterator<Row> rows = sheet.rowIterator();
                        while (rows.hasNext()) {
                            HSSFRow row = (HSSFRow) rows.next();
                            System.out.println(row.getLastCellNum());
                            // Iterate over each cell in the row and print out the cell"s
                            // content
                            Iterator<Cell> cells = row.cellIterator();
                            while (cells.hasNext()) {
                                HSSFCell cell = (HSSFCell) cells.next();
                                switch (cell.getCellType()) {
                                    case HSSFCell.CELL_TYPE_NUMERIC:
                                        System.out.println("HSSFCell.CELL_TYPE_NUMERIC:"+cell.getAddress());
                                        break;
                                    case HSSFCell.CELL_TYPE_STRING:
                                        System.out.println("HSSFCell.CELL_TYPE_STRING:"+cell.getAddress());
                                        break;
                                    case HSSFCell.CELL_TYPE_BOOLEAN:
                                        System.out.println("HSSFCell.CELL_TYPE_BOOLEAN:"+cell.getAddress());
                                        break;
                                    case HSSFCell.CELL_TYPE_FORMULA:
                                        System.out.println("HSSFCell.CELL_TYPE_FORMULA:"+cell.getAddress());
                                        break;
                                    case HSSFCell.CELL_TYPE_BLANK:
                                        System.out.println("HSSFCell.CELL_TYPE_BLANK"+cell.getAddress());
                                        break;
                                    default:
                                        System.out.println("defult"+cell.getAddress());
                                        break;
                                }
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }*/
    }

}
      /*  Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        int  date= (2004-1)*365+((2004-1)/4)-((2004-1)/100)+((2004-1)/400)+(31+29+31+30+1) ;
*/
    /*   static Map<String,Object> services=new HashMap<String,Object>();
    private static AbstractApplicationContext context;
    private static Logger logger = LogManager.getLogger("helloLog4j");
    static Map<String  ,String> globalinfo=new HashMap<String, String>();
    static int B ,H;
    static  boolean flag=true;
    static {

     Scanner scanner=new Scanner(System.in);
        B=scanner.nextInt();
        H=scanner.nextInt();
        if(!(B>=0&&H>=0)){
            flag=false;
            System.out.print("java.lang.Exception: Breadth and height must be positive\n");
        }


        String s=String.valueOf();

//        globalinfo.put("databaseName","database_url");
//        globalinfo.put("fileName","file_url");
    }*/


      /*if(flag){
          int area=B*H;
          System.out.print(area);
      }*/
        /*  Scanner sc = new Scanner(System.in);
        int num=1;
        String str=null;
        while ((str=sc.nextLine())!=null){
            System.out.println(num+" "+str);
            num++;

        }
        sc.close();*/



       /* int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(Short.MIN_VALUE<=x&&x<=Short.MAX_VALUE)System.out.println("* short");
                if(Integer.MIN_VALUE<=x&&x<=Integer.MAX_VALUE)System.out.println("* int");
                if(Long.MIN_VALUE<=x&&x<=Long.MAX_VALUE)System.out.println("* long");
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
*/


        /*Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum=0;
           for(int m=1;m<=n;m++){

               sum= (int) (a+(((Math.pow(2,m)-1)/(2-1))*b));
               System.out.print(sum+" ");
           }
           System.out.println();
        }
        in.close();
*/
       /* Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }*/
          /*  System.out.println("================================");
        String s="java           100";
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            char ch[]=new char[15];

             System.out.printf("%-15s%03d",s1,x);

            System.out.println();

            //Complete this line
        }
        System.out.println("================================");

*/
       /* logger.debug("Demo.class");
        Class cl=Class.forName("Student");
        Object c=cl.newInstance();
        Method method=cl.getMethod("setId",int.class);
        Method method1=cl.getMethod("setName",String.class);
        method.invoke(c,1);
        method1.invoke(c,"yinxu");
        Field field=cl.getDeclaredField("name");
        field.setAccessible(true);
        field.set(c,"yinxucun");
        System.out.println(c);
*/
       /* Class cla=Class.forName("StudentService");
        if(cla.isAnnotationPresent(Service.class)){
         Service service=  (Service) cla.getAnnotation(Service.class);
            Object object=cla.newInstance();
            services.put(service.name(),cla.newInstance());
            Method[ ] methods=cla.getMethods();
            for(Method m:methods){
                if(m.isAnnotationPresent(initMethod.class)){
                    Annotation[][]as=m.getParameterAnnotations();
                    if(as.length>0) {
                        String parameterName = ((MethodParameter) as[0][0]).name();
                        m.invoke(object, globalinfo.get(parameterName));
                    }else {

                        m.invoke(object);
                    }

                }
            }
        }
        System.out.println(services);
*/

        /*context = new ClassPathXmlApplicationContext("Beans.xml");
        listFile listfile=(listFile)context.getBean("listFile");
        string_write s=(string_write)context.getBean("string_write");
        s.wirte(listfile.list_the_File());
        context.registerShutdownHook();
*/
/*
        logger.debug("dsadsadsda");
        new Thread(new Runnable() {
            public void run() {
                while (true){
                    if(Thread.currentThread().isInterrupted()){
                        System.out.print("Interrupted");
                        break;
                    }
                    try{
                        Thread.sleep(20);
                    }
                    catch (InterruptedException e ){
                        System.out.print("Interruted when sleep");
                        Thread.currentThread().interrupt();
                    }
                    Thread.yield();
                }
            }
        }).start();
*/





 