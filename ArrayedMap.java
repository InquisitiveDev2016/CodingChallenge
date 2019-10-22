package Test;

public class ArrayedMap {
	
	//A naive implementation of a map
	
	private final int MAX_CAPACITY = 100;
	private Entry[] entries;		//An entry collector array
	private int noe; 	//number of entries
	
	public ArrayedMap() {
		entries = new Entry[MAX_CAPACITY];
		noe = 0;
	}
	
	//Returns the size of the entries array
	public int size() {
		return noe;
	}
	
	//Puts an entry object with it's keys and values into the entries array
	public void put(int key, String value) {
			for(int i = 0; i < noe; i++) {
				Entry e = new Entry(key, value);
				entries[noe] = e;
				noe++;
			}
		}
	
	//Gets the value of the entered key in the map
	public String getKey(int key) {
		for(int i = 0; i < noe; i++) {
			Entry e = entries[i];
			int k = e.getKey();
			
			if(k == key) {
				return e.getValue();
			}
		}
		return null;
	}
	
}
