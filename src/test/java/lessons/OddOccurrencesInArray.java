package lessons;

import java.util.HashMap;
import java.util.Map;


public class OddOccurrencesInArray {

	public static void main(String[] args) {
		int[] arr = {9,3,9,3,9,7,9,7,1,9,1};
		System.out.println("The odd number is: " + solution(arr));

	}
	
	public static int solution(int arr[]){
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		int hashVal;
		for (int i = 0; i < arr.length; i++) {
			if (hash.containsKey(arr[i])) {
				//the arr[i] is already present; so increase the count by 1
				hashVal = hash.get(arr[i]) + 1;
				hash.put(arr[i], hashVal);
			} else {
				hash.put(arr[i], 1);
			}
		}
		
		//after the hashmap is ready; find which key has on odd value
		for(Map.Entry<Integer, Integer> entry : hash.entrySet()){
			hashVal = entry.getValue();
			if(hashVal % 2 == 1){
				return entry.getKey();
			}
		}
		
		return 0;
	}

}
