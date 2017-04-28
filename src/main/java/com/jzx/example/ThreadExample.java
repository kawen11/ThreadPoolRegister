package com.jzx.example;
/**
 * example
 */
import java.util.concurrent.ExecutorService;
import com.jzx.api.ExecutorServiceHandlerRegistry;
import com.jzx.handler.DefaultExecutorServiceHandler;
public class ThreadExample {

	public static void main(String[] args) {
		ExecutorService excutorService = ExecutorServiceHandlerRegistry.getExecutorServiceHandler("job1",new DefaultExecutorServiceHandler());
		excutorService.execute(new Runnable(){

			public void run() {
				System.out.println("Test good!");
			}
			
		});
	}
	
}
