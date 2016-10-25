
/**
 * Created by yinxu on 2016/10/23.
 */

@Service(name="studentService")
public class StudentService {
    @initMethod
    public void init(@MethodParameter(name="databaseName") String  str){
        System.out.println("init studentService  database"+str);
    }
    @initMethod
    public void init2(){
        System.out.println("init 2");

    }
    public void addStudent(Student student){}
    public  Student findStudnet(int  id){
        return  null;
    }
    @Override
    public String toString(){
        return  "StudentService";
    }
}
