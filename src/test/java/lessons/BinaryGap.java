package lessons;

import java.util.Scanner;

public class BinaryGap {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = reader.nextInt();
		int binGap = solution(num);
		System.out.println("Largest binary gap: " + binGap);

	}
	
	
	public static int solution(int num){
		int max = 0;
		int count = -1;
		int reminder = 0;
		while(num > 0){
			reminder = num %2;
			num = num/2;
			if (reminder == 0 && count >= 0) {
				count ++;
			} else if(reminder == 1){
				max = count > max ? count:max;
				count = 0;
			}
		}
		
		return max;
	}

	//the below one is bit fuzzy one
	public static int solu(int num) {
		boolean endBin = true;
		boolean oneFound = false;
		int temp = num;
		int binGap = 0;
		int count = 0;
		do{
			temp = num/2;
			if (endBin && num % 2 == 1) {
				endBin = false;
				oneFound = true;
			} else if (oneFound && num%2 == 0) {
				count ++;
			} else if (oneFound && num%2 == 1) {
				if(count > binGap){
					binGap = count;
				}
				count = 0;
			}
			num = temp;
		} while (num > 0);

		return binGap;
	}
	
	

}
