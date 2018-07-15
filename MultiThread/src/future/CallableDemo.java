package future;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) {
		ExecutorService executor= Executors.newCachedThreadPool();
		
		Future<Integer> future=
				executor.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				Random random=new Random();
				int duration=random.nextInt(4000);
				System.out.println("Thread Start....");
				Thread.sleep(duration);
				System.out.println("Finishied. = "+duration);
				return duration;
			}
			
		});
		
		executor.shutdown();
		try {
			System.out.println(future.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
