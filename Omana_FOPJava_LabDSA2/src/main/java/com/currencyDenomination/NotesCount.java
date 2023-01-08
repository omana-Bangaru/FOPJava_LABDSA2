package main.java.com.currencyDenomination;

public class NotesCount {

	public void notesCountImplementation(int[] noOfNotes, int amount) {

		int[] notesCounter = new int[noOfNotes.length];
		try {
			for (int i = 0; i < noOfNotes.length; i++) {
				if (amount >= noOfNotes[i]) {
					notesCounter[i] = amount / noOfNotes[i];
					amount = amount - notesCounter[i] * noOfNotes[i];
				}
			}
			
			if (amount > 0)
				System.out.println("exact amount cannot be given with the highest denomination");
			else {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for (int i = 0; i < noOfNotes.length; i++) {
					if (notesCounter[i] != 0) {
						System.out.println(noOfNotes[i] + ":" + notesCounter[i]);
					}
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e + " notes of denomination 0 is invalid");
		}
	}

}
