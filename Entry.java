package Test;

/**
 * @author ali2015
 *
 */

	//Used for the ArrayedMap class to put in entries in an Entries[] array
	//There is no logic errors present in this class, you can safely ignore this class

public class Entry {
	private int key;
	private String value;
	
	public Entry(int key, String value) {
		setKey(key);
		setValue(value);
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
	
	
	
}
