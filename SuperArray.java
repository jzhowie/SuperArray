public class SuperArray {
private String[] data;
private int size;   //current size

public SuperArray() {
	size = 0;
	data = new String[10];
}

public int size() {
	return size;
}

public boolean add(String element) {
	if (size < data.length) {
		data[size] = element;
		size++;
		return true;
	}
	return false;
}

public String get(int index) {
	return data[index];
}

public String set(int index, String element) {
	data[index] = element;
	return element;
}

//tester function
public String[] printArray() {
	return data;
}
}
