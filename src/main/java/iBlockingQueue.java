/**
 * Created by yinxu on 2016/10/10.
 */
public interface iBlockingQueue<T> {
    public T take() throws InterruptedException;
    public void put(T obj) throws InterruptedException;
}
