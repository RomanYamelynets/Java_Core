package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import javax.management.ValueExp;

public class Map<K,V> extends MyEntry<K, V> {

//	public Map(K ob1, V ob2) {
//		super(ob1, ob2);
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

	public void setOb2(V ob2) {
		this.ob2 = ob2;
	}
	
	private HashMap<K, V> map = new HashMap<>();
	
	void add(K k, V v) {
		map.put(k, v);
	}
	
	void deleteKey(K k) {
		map.remove(k);
	}
	
	void deleteValue(V v) {
		Iterator<Entry<K, V>> iterator4 = map.entrySet().iterator();
		while (iterator4.hasNext()) {
			Entry<K, V> next = iterator4.next();
			if (next.getValue().equals(v)) {
				iterator4.remove();

			}
		}

	}
	
	void SetKey() {
		Set<K> keys = map.keySet();
		System.out.println("keys: " + keys);
	}
	
	void ListValue() {
		ArrayList<V> values = new ArrayList<>(map.values());
		System.out.println("Values" + values);
	}
	
	void printMap() {
		System.out.println(map);
	}
}
