package ua.lviv.lgs;

import java.util.Scanner;

class MyThread extends Thread {

	private String name;
	private int delay;

	public MyThread(String name, int delay) {
		super();
		this.name = name;
		this.delay = delay;
	}

	@Override
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 'n' MyThread: ");
		int n = scan.nextInt();

		int[] arr = new int[n];
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

class RunnableThread implements Runnable {
	private String name;
	private int delay;
	private Thread thread;

	public RunnableThread(String name, int delay) {
		super();
		this.name = name;
		this.delay = delay;
		this.thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 'n' Runnable: ");
		int n = scan.nextInt();

		int[] arr = new int[n];
		arr[0] = 1;
		arr[1] = 1;

		for (int i = 2; i < arr.length; ++i) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println("Name : " + name + "---" + arr[i]);
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ApplicationRunnableThread {

	public static void main(String[] args) {
		MyThread t1 = new MyThread("MyThread", 100);
		t1.start();

		RunnableThread rt = new RunnableThread("Runnable", 100);

	}

}
