package ua.lviv.lgs;

public class MyEntry<K, V> {

	K ob1;
	V ob2;

//	public MyEntry(K ob1, V ob2) {
//		super();
//		this.ob1 = ob1;
//		this.ob2 = ob2;
//	}

	public K getOb1() {
		return ob1;
	}

	public void setOb1(K ob1) {
		this.ob1 = ob1;
	}

	public V getOb2() {
		return ob2;
	}

	public void setO2b(V ob2) {
		this.ob2 = ob2;
	}

	@Override
	public String toString() {
		return "MyEntry [ob1=" + ob1 + ", ob=" + ob2 + "]";
	}

}
