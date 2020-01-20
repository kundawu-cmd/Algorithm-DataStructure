package sort;

public class quick {


public void sort(int arr[]) {
		sort(arr, 0, arr.length-1);
}

public void sort(int arr[], int low, int high) {
		
		if (low < high) {	
			int p = partition(arr, low, high);
			sort(arr, low, p-1);
			sort(arr, p+1, high);
		}
	}

public int partition(int arr[], int low, int high) {
	
	int pivot = arr[high];
	int i = low-1;
	
	for (int j = low; j < high; j++) {
		
		if (arr[j] <= pivot) {
			i++;
			int temp = arr[j];
			arr[j] =arr[i];
			arr[i] = temp;
		}
	}
	
	int temp = arr[high];
	arr[high] = arr[i+1];
	arr[i+1] = temp;
	
	return i+1;
}

	public static void main(String args[]) {
		
		int arr[] = {12, 10, 89, 78, 8, 6, 4};
		quick s = new quick();
		s.sort(arr);
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
}
