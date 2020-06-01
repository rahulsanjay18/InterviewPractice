
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lst = {3,2, 5, 1, 7, 9, 0};
		int[] lst2 = {3,2, 5, 1, 7, 9, 0};
		
		SortingAlgs.insertion_sort(lst);
		for(int num : lst) {
			System.out.print(num + ", ");
		}
		
		System.out.println();
		
		
		SortingAlgs.selection_sort(lst2);
		for(int num : lst2) {
			System.out.print(num + ", ");
		}
		
		
	}

}
