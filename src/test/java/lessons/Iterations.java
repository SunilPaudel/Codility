/*
A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by 
ones at both ends in the binary representation of N.
For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 
1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and 
contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps.

Write a function:
int solution(int N);
that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a
binary gap. For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its 
longest binary gap is of length 5.

Assume that:
N is an integer within the range [1..2,147,483,647].

Complexity:
expected worst-case time complexity is O(log(N));
expected worst-case space complexity is O(1).
 */
package lessons;

import java.util.ArrayList;
import java.util.Scanner;

public class Iterations {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = reader.nextInt();
		int binGap = solution(num);
		System.out.println("Largest binary gap: " + binGap);
	}
	
	//Function to calculate the binary gap
	public static int solution(int num){
		int binGap = 0;
		int count = 0;
		int temp = num;
		boolean start = false;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		//function to convert the decimal digit to binary
		do{
			temp = num/2;
			arr.add(num%2);
			num = temp;
		} while (num >= 1);
		
		for(int i = arr.size() - 1; i >= 0; i --){
			//System.out.println("Reading: " + arr.get(i));
			if (i == arr.size() - 1) {
				//this is the beginning of the binary number (basically do nothing)
				start = true;
			} else if (arr.get(i) == 0) {
				count ++;
			} else if (arr.get(i) == 1 && start) {
				if (count > binGap) {
					binGap = count;
				}
				count = 0;
			}{
				//this means the value is 1
				
			}
		}
		return binGap;
	}
}
