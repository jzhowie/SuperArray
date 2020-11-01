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

//tester function
public String[] printArray() {
	return data;
}
}
