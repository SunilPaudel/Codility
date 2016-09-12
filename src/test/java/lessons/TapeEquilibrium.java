package lessons;


public class TapeEquilibrium {

	public static void main(String[] args) {
		int[] arr = {3,1,2,4,3};
		System.out.println(solution(arr));

	}
	
	//Function to return the minimum difference
	public static int solution(int [] arr){
		//if the length of the arr is only 2; then
		if (arr.length == 2) {
			return Math.abs(arr[0] - arr[1]);
		}
		int DIFF = Integer.MAX_VALUE;
		int temp = 0;
		int[] sumLeft = new int[arr.length - 1];
		int[] sumRight = new int[arr.length - 1];
		sumLeft[0] = arr[0];
		//now for loop and store the sum in the array sumLeft
		for (int i = 1; i < arr.length - 1; i++) {
			sumLeft[i] = sumLeft[i-1] + arr[i];
		}
		
		//store the right hand sum in an array
		sumRight[arr.length - 2] = arr[arr.length - 1];
		for(int i = arr.length - 2; i > 0; i --){
			sumRight[i - 1] = sumRight[i] + arr[i];
		}
		
		//now compare the differences between the two arrays sumLeft and sumRight
		for (int i = 0; i < arr.length - 2; i++) {
			temp = Math.abs(sumLeft[i] - sumRight[i]);
			if (temp < DIFF) {
				DIFF = temp;
			}
		} 
		
		return DIFF;
	}

}
