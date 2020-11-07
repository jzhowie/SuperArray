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
}
}
