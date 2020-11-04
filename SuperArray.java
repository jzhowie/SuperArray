public class SuperArray {
private String[] data;
private int size;   //current size

public SuperArray() {
	size = 0;
	data = new String[10];
}

public SuperArray(int initialCapacity) {
	size = 0;
	data = new String[initialCapacity];
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

public void add(int index, String element) {
	for (int i = size - 1; i >= index; i--) {
		data[i+1] = data[i];
	}
	data[index] = element;
	size++;
	return;
}

public String remove(int index) {
	String removed = data[index];
	for (int i = index; i < size; i++) {
		data[i] = data[i+1];
	}
	size--;
	return removed;
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
	String[] newarr = new String[capacity * 2];
	for (int index = 0; index < data.length; index++) {
		newarr[index] = data[index];
	}
	data = newarr;
	return;
}

public boolean isEmpty() {
	return size == 0;
}

public void clear() {
	size = 0;
	data = new String[10];
}

public String toString() {
	String value = "[";
	for (int index = 0; index < size; index++) {
		value = value + get(index);
		if (index != size - 1) {
			value += ", ";
		}
	}
	value += "]";
	return value;
}

public boolean contains(String s) {
	return indexOf(s) != -1;
}

public int indexOf(String s) {
	for (int index = 0; index < data.length; index++) {
		if (s.equals(get(index))) {
			return index;
		}
	}
	return -1;
}

//tester function
public String[] printArray() {
	return data;
}

}
