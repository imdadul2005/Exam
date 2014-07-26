package math;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 */
		int [] array = new int[]{34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
		//System.out.println(findLowestNumber(array));
		
		int lowest_numer = Integer.MAX_VALUE;
		
		for (int i = 0; i<array.length;i++){
			if(lowest_numer>array[i])
				lowest_numer= array[i];
		}
		System.out.println("Lowest number is : "+ lowest_numer);
	}
}
