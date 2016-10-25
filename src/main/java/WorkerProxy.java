public class WorkerProxy implements IWorker {
	Worker worker=new Worker();

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("start");
		worker.run();
		System.out.println("end");
	}
	
	

}
