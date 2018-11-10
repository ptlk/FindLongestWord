package findLongestWordpackage;

import org.testng.annotations.Test;

public class FindLongestWordFile {

	public String sentence = "The cow jumped over the moon";

	@Test
	// Create a method that reads sentence and splits the sentence into words
	// and Returns longest word(S) from the given sentence
	public void findLongestWord() {
		// divide sentence into words, at every "space", and store it into array
		String[] words = sentence.split(" ");

		// initialize word length count
		int length = 0;

		// Find length of the longest word from the given sentence using FOR
		// LOOP
		for (String word : words) {
			if (word.length() >= length) {
				length = word.length();
			}
		}

		// Print the longest word(s) from the sentence, using FOR LOOP
		for (String word : words) {
			if (word.length() == length) {
				System.out.println("Longest Word : " + word + "\n" + "Word Length : " + length);
			}
		}

	}
}
