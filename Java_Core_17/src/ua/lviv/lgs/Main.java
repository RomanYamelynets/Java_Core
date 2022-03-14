package ua.lviv.lgs;

public class Main {

	public static void main(String[] args) {

		Collection collection1 = new Collection();
		Iterator iteratorForward = collection1.createForward();
		
		while (iteratorForward.hasNext()) {
			System.out.println(iteratorForward.next());
		}

		System.out.println();
	
		Collection collection2 = new Collection();
		Iterator iteratorBackward = collection2.createBackward();
		
		while (iteratorBackward.hasNext()) {
			System.out.println(iteratorBackward.next());

		}
		
		System.out.println();
		
		Collection collection3 = new Collection();
		Iterator iteratorBackward2 = collection3.createAnonymous();
		while (iteratorBackward2.hasNext()) {
			if(iteratorBackward2.next()%2!=0){
                System.out.println(iteratorBackward2.next());}

		}
	}
}