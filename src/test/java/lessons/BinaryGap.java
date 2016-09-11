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
	
}
