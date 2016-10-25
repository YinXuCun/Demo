package bean;

/**
 * Created by yinxu on 2016/10/18.
 */
public class student {
    private  String  name;
    private int age;
    private int grade;
    public student(String  name,int age,int grade){
        this.age=age;
        this.grade=grade;
        this.name=name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "studnet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
