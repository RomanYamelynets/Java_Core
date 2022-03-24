package ua.lviv.lgs;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class My_Thread extends Thread {

	private String name;
	private int delay;

	public My_Thread(String name, int delay) {
		super();
		this.name = name;
		this.delay = delay;
	}

	@Override
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 'n' MyThread: ");
		int n = scan.nextInt();

		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i < arr.length; ++i) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		for (int i = 0; i < arr.length; ++i) {
			System.out.println("Name : " + name + "---" + arr[i]);
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}


public class ApplicationExecutorServices {
	public static void main(String[] args) {
		ExecutorService executable = Executors.newFixedThreadPool (10);
		executable.execute(new My_Thread("MyThread", 200));
		
		ExecutorService executable2 = Executors.newSingleThreadExecutor ();
		executable2.execute(new My_Thread("MyThread2", 200));
		
		ExecutorService executable3 = Executors.newCachedThreadPool ();
		executable3.execute(new My_Thread("MyThread3", 200));
		
		executable.shutdown();
	}
}
