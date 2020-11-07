public class Demo {
public static void removeDuplicates(SuperArray s) {
	for (int i = 0; i < s.size(); i++) {
		int index = 0;
		while (index < s.size()) {
			if (s.get(index) != null && s.get(index).equals(s.get(i)) && s.indexOf(s.get(index)) != index) {
				s.remove(index);
				index--;
			}
			index++;
		}
	}
	return;
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

	System.out.println("\n" + "Nulls?");
	words.add(null);
	System.out.println(words);
	removeDuplicates(words);
	System.out.println(words);
}
}
