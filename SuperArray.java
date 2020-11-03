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
	if (size >= data.length) {
		resize();
	}
	data[size] = element;
	size++;
	return true;
}

public String get(int index) {
	return data[index];
}

public String set(int index, String element) {
	data[index] = element;
	return element;
}

public void resize() {
	int capacity = data.length;
	String[] newarr = new String[capacity + 5];
	for (int index = 0; index < data.length; index++) {
		newarr[index] = data[index];
	}
	data = newarr;
	return;
}

public boolean isEmpty() {
	if (size == 0) return true;
	return false;
}

public void clear() {
	size = 0;
	data = new String[10];
}
//tester function

public String[] printArray() {
	return data;
}

}
