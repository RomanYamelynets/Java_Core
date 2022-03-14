package ua.lviv.lgs;

public class Collection {
	private static int[] arr;

	public Collection() {
		arr = new int[] { 1, 23, 64, 33, 54, 25, 48, 23, 656, -327, 81, 4, 234, -3 };
	}

	// 1

	public class Forward implements Iterator {

		int count = 0;

		@Override
		public boolean hasNext() {
			return count < arr.length;
		}

		@Override
		public int next() {
			if (arr[count] % 2 != 0) {
				arr[count] = 0;
			}
			return arr[count++];
		}

	}

	public Forward createForward() {
		return new Forward();
	}

	// 2

	public class Backward implements Iterator {

		int count = arr.length - 1;

		@Override
		public boolean hasNext() {
			return count >= 0;
		}

		@Override
		public int next() {
			int result = arr[count];
			count -= 2;
			return result;
		}

	}

	public Backward createBackward() {
		return new Backward();
	}

	// 3

	public Iterator createAnonymous(){
        return new Iterator() {
            private int step=arr.length;
            @Override
            public boolean hasNext() {
                step-=3;
                if(step>=0){
                    return true;
                }

                return false;
            }

            @Override
            public int next() {
                return arr[step];
            }
        };
	}

}
