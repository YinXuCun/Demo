/**
 * Created by yinxu on 2016/10/10.
 */
public class simpleWN {
    final static  Object object=new Object();
    public static  class T1 extends Thread{
        public void run(){

            synchronized (object){
                System.out.println(System.currentTimeMillis()+":T1 start");

                try {
                    System.out.println(System.currentTimeMillis()+":T1 wait");
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(System.currentTimeMillis()+":T1 end");
            }

        }

    }
    public static class T2 extends Thread{
        public void run(){
            synchronized (object) {
                System.out.println(System.currentTimeMillis() + ":T2 start  notify on Thread");
                object.notifyAll();
                System.out.println(System.currentTimeMillis() + ":T2  end");

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String args[]){
        T1 t1=new T1();
        T1 t11=new T1();
        T2 t2=new T2();
        t1.start();
        t11.start();
        t2.start();

    }
}
