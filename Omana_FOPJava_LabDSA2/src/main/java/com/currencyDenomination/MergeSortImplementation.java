package main.java.com.currencyDenomination;

public class MergeSortImplementation {
	
	public void sort(int[] noOfNotes, int low, int high) {
		
		if(low<high) {
			// find the middle number
			int mid = (low + high) / 2;
			// Sort first half and second half
			sort(noOfNotes, low, mid);
			sort(noOfNotes, mid + 1, high);
			// merge both sorted halves
			merge(noOfNotes, low, mid, high);
		}
	}

	private void merge(int[] noOfNotes, int low, int mid, int high) {
			int i, j, k;
			i = low;
			j = mid + 1;
			k = low;
			
			int[] tempArr = new int[high + 1];
			
			while (i <= mid && j <= high) {
				if (noOfNotes[i] > noOfNotes[j]) {
					tempArr[k++] = noOfNotes[i++];
				}
				else {
					tempArr[k++] = noOfNotes[j++];
				}
			}
			
			for (; i <= mid; i++) {
				tempArr[k++] = noOfNotes[i];
			}
			for (; j <= high; j++) { 
				tempArr[k++] = noOfNotes[j];
			}
			for (i = low; i <= high; i++) { 
				noOfNotes[i] = tempArr[i];
			}
	}

}
