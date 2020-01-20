package sort;

public class selection {

	public void sort(int[] arr) {
		
		for (int i = 0; i < arr.length-1; i++) {
			
			int min_index = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void main(String args[]) {
		
		int arr[] = {12, 10, 89, 78, 8, 6};
		selection s = new selection();
		s.sort(arr);
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
