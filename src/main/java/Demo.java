import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yinxu on 2016/9/28.
 */
public class Demo {

    static Map<String,Object> services=new HashMap<String,Object>();
    private static AbstractApplicationContext context;
    private static Logger logger = LogManager.getLogger("helloLog4j");
    static Map<String  ,String> globalinfo=new HashMap<String, String>();
    static {
        globalinfo.put("databaseName","database_url");
        globalinfo.put("fileName","file_url");
    }

    public  static void main(String args[]) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        logger.debug("Demo.class");
        Class cl=Class.forName("Student");
        Object c=cl.newInstance();
        Method method=cl.getMethod("setId",int.class);
        Method method1=cl.getMethod("setName",String.class);
        method.invoke(c,1);
        method1.invoke(c,"yinxu");

        System.out.println(c);

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
 