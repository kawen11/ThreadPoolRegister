package com.jzx.example;

import java.util.concurrent.ExecutorService;

import com.jzx.api.ExecutorServiceHandlerRegistry;
import com.jzx.handler.DefaultExecutorServiceHandler;

public class ThreadExample {

	public static void main(String[] args) {
		ExecutorService excutorService = ExecutorServiceHandlerRegistry.getExecutorServiceHandler("job1", 10,
				new DefaultExecutorServiceHandler());
		excutorService.submit(new Runnable() {

			public void run() {
				System.out.println("Test good!");
			}

		});
	}

}
