public class SuperArray {
private String[] data;
private int size;   //current size

public SuperArray() {
	size = 0;
	data = new String[10];
}

public SuperArray(int initialCapacity) {
	if (initialCapacity < 0) {
		throw new IllegalArgumentException("Capacity (" + initialCapacity + ") cannot be negative.");
	}
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
	if (index < 0 || index > size()) {
		throw new IndexOutOfBoundsException("Index (" + index + ") out of range.");
	}
	if (size + 1 > data.length) {
		resize();
	}
	for (int i = size - 1; i >= index; i--) {
		data[i+1] = data[i];
	}
	data[index] = element;
	size++;
	return;
}

public String remove(int index) {
	if (index < 0 || index >= size()) {
		throw new IndexOutOfBoundsException("Index (" + index + ") out of range.");
	}
	String removed = data[index];
	for (int i = index; i + 1 < size; i++) {
		data[i] = data[i+1];
	}
	data[size - 1] = null;
	size--;
	return removed;
}

public String get(int index) {
	if (index < 0 || index >= size()) {
		throw new IndexOutOfBoundsException("Index (" + index + ") out of range.");
	}
	return data[index];
}

public String set(int index, String element) {
	if (index < 0 || index >= size()) {
		throw new IndexOutOfBoundsException("Index (" + index + ") out of range.");
	}
	String replaced = data[index];
	data[index] = element;
	return replaced;
}

public void resize() {
	int capacity = data.length + 1;
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
	for (int index = 0; index < size; index++) {
		if (data[index] != null && data[index].equals(s)) {
			return index;
		}
	}
	return -1;
}

public int lastIndexOf(String s) {
	for (int index = size - 1; index > -1; index--) {
		if (data[index] != null && data[index].equals(s)) {
			return index;
		}
	}
	return -1;
}

public boolean equals(SuperArray other) {
	if (size != other.size) {
		return false;
	}
	for (int index = 0; index < size; index++) {
		if (data[index].equals(other.data[index]) == false) {
			return false;
		}
	}
	return true;
}


public String[] toArray() {
	String[] newarr = new String[size];
	for (int index = 0; index < size; index++) {
		newarr[index] = data[index];
	}
	return newarr;
}

//tester function
public String[] printArray() {
	return data;
}

}
