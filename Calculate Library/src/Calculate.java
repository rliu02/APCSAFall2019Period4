/* Robert Liu
 * August 29 2019
 * Period 4
 * A group of methods that perform math calculations (library)
 */

public class Calculate {
	// a call to square returns the square of a value passed
	public static int square(int number) {
		int answer=0;
		answer = number*number;
		return answer;
		
	}
	
	// a call to cube returns the cube of a value passed
	public static int cube(int number) {
		int answer=0;
		answer = number*number*number;
		return answer;
		
	}
	
	// a call to average the sum of two values passed
	public static double average(double number1, double number2) {
		double answer=0.0;
		answer = (number1 + number2)/2;
		return answer;		
		
	}

	// a call to average the sum of three values passed
	public static double average(double number1, double number2, double number3) {
		double answer=0.0;
		answer = (number1 + number2 + number3)/3;
		return answer;
		
	}
	
	// a call to convert a value in radians to degrees when passed
	public static double convert1(double number) {
		double answer=0.0;
		answer = (number%3.14159);
		return answer;
		
	}
	
	// a call to convert a value in degrees to radians when passed
	public static double convert2(double number) {
		double answer=0.0;
		answer = (number*3.14159);
		return answer;
		
	}
	
	// a call to find the discriminant of the coefficients of a quadratic equation
	public static double calculate(double a, double b, double c) {
		double answer=0.0;
		answer = ((b*b)-4*a*c)/2*a;
		return answer;
		
	}
	
}
	
