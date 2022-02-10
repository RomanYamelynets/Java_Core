package ua.lviv.lgs.task34;

import java.util.Arrays;

public class Application {

	private static int[] strArray;

	public static void main(String[] args) {
		String s = new String("All we have to decide is what to do with the time that is given to us.");
		System.out.println(s);

		String[] strArray = s.replaceAll("[.]", "").split(" ");
		int counter = 0;
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].length() > 1) {
				counter++;
			}
		}
		System.out.println("The number of words in a sentence " + counter);
		
		Arrays.sort(strArray);
	    System.out.println(Arrays.toString(strArray));
	    int max = 0;
	    int count= 1;
	    String word = strArray[0];
	    String curr = strArray[0];
	    for(int i = 1; i<strArray.length; i++){
	        if(strArray[i].equals(curr)){
	            count++;
	        }
	        else{
	            count =1;
	            curr = strArray[i];
	        }
	        if(max<count){
	            max = count;
	            word = strArray[i];
	        }
	    }
	    System.out.println(max + " x " + word);
	}

}
