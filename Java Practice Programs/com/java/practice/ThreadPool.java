package com.java.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

	public static void main(String[] args) {
		Task task = new Task();
		int coreCount = Runtime.getRuntime().availableProcessors();
		System.out.println("Core count is: " + coreCount);
		ExecutorService executorService = Executors.newFixedThreadPool(coreCount);
		for (int i = 0; i < 100; i++) {
			executorService.execute(task);
		}

		System.out.println("Thread Name: " + Thread.currentThread().getName());
	}
}

class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread Name: " + Thread.currentThread().getName());

	}

}
