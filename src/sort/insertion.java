package sort;

public class insertion {

	
	public void sort(int arr[]) {
		
		int n = arr.length;
		
		for (int i =0; i< n; i++) {
			int key = arr[i];
			int j = i-1;
			
			while (j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}
	
	public static void main(String args[]) {
		
		int arr[] = {12, 10, 89, 78, 8, 6};
		insertion s = new insertion();
		s.sort(arr);
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
