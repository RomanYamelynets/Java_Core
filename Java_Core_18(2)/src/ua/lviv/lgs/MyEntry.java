package ua.lviv.lgs;

public class MyEntry<K, V> {

	private K k;
	private V v;

	public K getOb1() {
		return k;
	}

	public void setOb1(K k) {
		this.k = k;
	}

	public V getOb2() {
		return v;
	}

	public void setO2b(V v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return "MyEntry [K=" + k + ", V=" + v + "]";
	}

}
