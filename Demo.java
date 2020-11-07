public class Demo {
public static void removeDuplicates(SuperArray s) {
	for (int i = 0; i < s.size(); i++) {
		int index = 0;
		while (index < s.size()) {
			if (s.get(index).equals(s.get(i)) && s.indexOf(s.get(index)) != index) {
				s.remove(index);
				index--;
			}
			index++;
		}
	}
	return;
}

public static SuperArray findOverlap(SuperArray a, SuperArray b) {
	SuperArray overlap = new SuperArray();
	for (int x = 0; x < a.size(); x++) {
		for (int y = 0; y < b.size(); y++) {
			if (a.get(x).equals(b.get(y))) {
				overlap.add(a.get(x));
			}
		}
	}
	removeDuplicates(overlap);
	return overlap;
}


public static SuperArray zip(SuperArray a, SuperArray b) {
	SuperArray zip = new SuperArray();
	for (int x = 0; x < Math.min(a.size(), b.size()); x++) {
		zip.add(a.get(x));
		zip.add(b.get(x));
	}

	if (a.size() < b.size()) {
		for (int x = a.size(); x < b.size(); x++) {
			zip.add(b.get(x));
		}
	}
	if (b.size() < a.size()) {
		for (int x = b.size(); x < a.size(); x++) {
			zip.add(a.get(x));
		}
	}
	return zip;
}

public static void main(String[] args) {
	System.out.println("Remove duplicates:");
	SuperArray words = new SuperArray();
	System.out.println("\n" + "Blank Array testing: Any errors?");
	removeDuplicates(words);

	System.out.println("\n" + "Words testing:");
	words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
	words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
	words.add("una");    words.add("ebi");     words.add("toro");

	System.out.println(words);
	removeDuplicates(words);
	System.out.println(words);

	System.out.println("\n" + "Overlap");
	SuperArray citiesA = new SuperArray();
	SuperArray citiesB = new SuperArray();

	System.out.println("Both empty: Any errors?");
	System.out.println(citiesA);
	System.out.println(citiesB);
	System.out.println(findOverlap(citiesA, citiesB));

	System.out.println("\n" + "One empty: Any errors?");
	citiesA.add("New York City");
	citiesA.add("Miami");
	citiesA.add("Boston");

	System.out.println(citiesA);
	System.out.println(citiesB);
	System.out.println(findOverlap(citiesA, citiesB));

	System.out.println("\n" + "No overlap: Any errors?");
	citiesB.add("London");
	citiesB.add("Paris");
	citiesB.add("Milan");

	System.out.println(citiesA);
	System.out.println(citiesB);
	System.out.println(findOverlap(citiesA, citiesB));

	System.out.println("\n" + "Overlap but no duplicates: Any errors?");
	citiesA.add("Milan");
	citiesA.add("Paris");

	System.out.println(citiesA);
	System.out.println(citiesB);
	System.out.println(findOverlap(citiesA, citiesB));

	System.out.println("\n" + "Overlap with duplicates: Any errors?");
	citiesA.add(2, "Milan");
	citiesB.add("New York City");
	citiesA.add("Boston");

	System.out.println(citiesA);
	System.out.println(citiesB);
	System.out.println(findOverlap(citiesA, citiesB));

	System.out.println("\n" + "zip()");
	SuperArray testA = new SuperArray();
	SuperArray testB = new SuperArray();

	System.out.println("Both empty: Any errors?");
	System.out.println(testA);
	System.out.println(testB);
	System.out.println(zip(testA, testB));

	System.out.println("\n" + "One empty: Any errors?");
	testA.add("a");
	testA.add("b");

	System.out.println(testA);
	System.out.println(testB);
	System.out.println(zip(testA, testB));

	System.out.println("\n" + "Same Length: Any errors?");
	testB.add("1");
	testB.add("2");

	System.out.println(testA);
	System.out.println(testB);
	System.out.println(zip(testA, testB));

	System.out.println("\n" + "First shorter: Any errors?");
	testA.add("c");
	testA.add("d");

	System.out.println(testA);
	System.out.println(testB);
	System.out.println(zip(testA, testB));

	System.out.println("\n" + "First shorter: Any errors?");
	testB.add("3");
	testB.add("4");
	testB.add("5");
	testB.add("6");
	testB.add("7");

	System.out.println(testA);
	System.out.println(testB);
	System.out.println(zip(testA, testB));

	System.out.println("\n" + "Equal again: Any errors?");
	testA.add("e");
	testA.add("f");
	testA.add("g");

	System.out.println(testA);
	System.out.println(testB);
	System.out.println(zip(testA, testB));

	System.out.println("\n" + "If you made it to this line, you probably don't have any glaring errors, but still check for logical issues.");
}
}
