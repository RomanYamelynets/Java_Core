package ua.lviv.lgs;

public class task3 {
	public static void main(String[] args) {
		int array [] = {15, 12, 43, 65, 223, -23, -2, 100, 105};
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		boolean isSorted = false;
		int data = 0;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < array.length - 1; i++) {
				if(array[i] > array[i + 1]) {
					isSorted = false;
					data = array[i];
					array[i] = array[i + 1];
					array[i + 1] = data;
				} 
			}
			
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println(array[0] + " - найменше значення з масиву");
		System.out.println(array[array.length - 1] + " - найбільше значення з масиву");
	}
}
