import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.appender.SyslogAppender;
import org.apache.logging.log4j.core.config.plugins.convert.TypeConverters;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.format.datetime.joda.DateTimeFormatterFactory;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;

/**
 * Created by yinxu on 2016/9/28.
 */
public class Demo {

    static Map<String,Object> services=new HashMap<String,Object>();
    private static AbstractApplicationContext context;
    private static Logger logger = LogManager.getLogger("helloLog4j");
    static Map<String  ,String> globalinfo=new HashMap<String, String>();
    static int B ,H;
    static  boolean flag=true;
    static {

      /*  Scanner scanner=new Scanner(System.in);
        B=scanner.nextInt();
        H=scanner.nextInt();
        if(!(B>=0&&H>=0)){
            flag=false;
            System.out.print("java.lang.Exception: Breadth and height must be positive\n");
        }


        String s=String.valueOf();*/

//        globalinfo.put("databaseName","database_url");
//        globalinfo.put("fileName","file_url");
    }

    public  static void main(String args[]) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException {

        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        int  date= (2004-1)*365+((2004-1)/4)-((2004-1)/100)+((2004-1)/400)+(31+29+31+30+1) ;

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




    }


}
 