package lessons;

public class CyclicRotation {

	public static void main(String[] args) {
		int [] arr = {3, 8, 9, 7, 6};
		int k = 3;
		int[] out = solution(arr, k);
		for (int i : out) {
			System.out.println(i);
		}

	}
	
	public static int[] solution(int [] arr, int k){
		int len = arr.length;
		//if the length of an arry is less than zero; return the same array
		if (len <= 1) {
			return arr;
		}
		int[] temp = new int[len];
		//if k >= length of an array, get the modulus
		k = k % len;
		if (k==0) {
			return arr;
		}
		//now iterate it till the end and start shifting
		for (int i = 0; i < len; i++) {
			if (i + k >= len) {
				//find the modulus
				temp[(i + k) % len] = arr[i];
			} else {
				//just add k to i
				temp[i + k] = arr[i];
			}
		}
		return temp;
	}

}
