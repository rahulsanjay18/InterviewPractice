

public class SortingAlgs {
	public static int[] selection_sort(int[] lst) {
		int min;
		
		for(int i = 0; i < lst.length; i++) {
			min = i;
			for(int j = i+1; j < lst.length; j++) {
				if (lst[j] < lst[min]) min = j;
			}
			
			int temp = lst[min];
			lst[min] = lst[i];
			lst[i] = temp;
		}
		
		return lst;
	}
	
	public static int[] insertion_sort(int[] lst) {
		for(int i = 1; i < lst.length; i++) {
			int j = i;
			while(j > 0 && lst[j] < lst[j-1]) {
				int temp = lst[j];
				lst[j] = lst[j-1];
				lst[j-1] = temp;
				j--;
			}
			
			
		}
		
		return lst;
	}
}
