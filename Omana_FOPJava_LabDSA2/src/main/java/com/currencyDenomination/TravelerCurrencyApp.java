package main.java.com.currencyDenomination;

import java.util.Scanner;

public class TravelerCurrencyApp {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the size of currency denomination: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] noOfNotes = new int[size];
		System.out.println("Enter the currency denominations value: ");
		for (int i = 0; i < size; i++) {
			noOfNotes[i] = sc.nextInt();
		}
		
		MergeSortImplementation ms = new MergeSortImplementation();
		ms.sort(noOfNotes,0,noOfNotes.length-1);
		
		System.out.println("Enter the amount you want to pay: ");
		int amount = sc.nextInt();
		NotesCount ns = new NotesCount();
		ns.notesCountImplementation(noOfNotes,amount);
	}
}
