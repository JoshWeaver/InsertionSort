//InsertionSort Program
//Josh Weaver, October 19th 2013

public class InsertionSort{

	public static int[] array = {5,6,4,7,3,8,2,9,1};
	public static int temp;

	public static void main(String[] args){
		System.out.print("Original list: ");
		for (int k = 0; k < array.length; k++){
				System.out.print(array[k]);
				System.out.print(" ");
		}
		System.out.println();
		System.out.println("Sorting... ");
		
		for (int i = 1; i < array.length; i ++){
			int element = array[i];
			int j = i;
			while(j > 0 && element < array[j - 1]){
				array[j] = array[j - 1];
				j --;
			}
			array[j] = element;
			for (int k = 0; k < array.length; k++){
				System.out.print(array[k]);
			}
			System.out.println();
		} 
		
		System.out.print("Final list: ");
		for (int k = 0; k < array.length; k++){
				System.out.print(array[k]);
				System.out.print(" ");
		}
	}
}