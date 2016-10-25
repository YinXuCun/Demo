import java.util.concurrent.locks.Condition;

/**
 * Created by yinxu on 2016/10/11.
 */
public class ReentrantLock implements Runnable {

   public static java.util.concurrent.locks.ReentrantLock lock= new java.util.concurrent.locks.ReentrantLock();
    public static int i=0;
    public  static Condition condition=lock.newCondition();
    public void run() {
        for (int j=0;j<10000000;j++){

//            lock.lock();
            try {
                lock.lock();
                condition.await();
                System.out.println("Thread is gonging on");
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            finally {
//                lock.unlock();
                lock.unlock();
            }
        }

    }

    public static void main(String args[]) throws InterruptedException {


        ReentrantLock reentrantLock=new ReentrantLock();
        Thread t1=new Thread(reentrantLock);
//        Thread t2=new Thread(reentrantLock);
        /*t1.start();t2.start();
        t1.join();t2.join();*/
//        System.out.println(i);
         t1.start();
        Thread.sleep(2000);
        lock.lock();
        condition.signal();
        lock.unlock();

    }
}
