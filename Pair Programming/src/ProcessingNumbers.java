// Robert Liu 4th 

import java.util.*;

public class ProcessingNumbers {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many numbers will there be? ");
		int totalNum = input.nextInt();
		System.out.print("The largest number will be: ");
		int max = input.nextInt(   );
		System.out.print("The smallest number will be: ");
		int min = input.nextInt(   );
		int sum = 0;
		for (int i=1; i <= totalNum; i++) {
			System.out.println("#"+ i +":");
			int num = input.nextInt();
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
			if (num%2 == 0) {
				sum += num;
			}
		}
		System.out.println("The max number is: " + max);
		System.out.println("The min number is: " + min);
		System.out.println("The sum of the even numbers is: " + sum);
	}
}