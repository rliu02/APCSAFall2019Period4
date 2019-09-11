/* Robert Liu
 * August 29 2019
 * Period 4
 * A group of methods that perform math calculations (library)
 */

public class Calculate {
	// a call to square returns the square of a value passed
	public static int Square(int number) {
		int answer=0;
		answer = number*number;
		return answer;
		
	}
	
	// a call to cube returns the cube of a value passed
	public static int Cube(int number) {
		int answer=0;
		answer = number*number*number;
		return answer;
		
	}
	
	// a call to average the sum of two values passed
	public static double AverageOfTwo(double number1, double number2) {
		double answer=0.0;
		answer = (number1 + number2)/2;
		return answer;		
		
	}

	// a call to average the sum of three values passed
	public static double AverageOfThree(double number1, double number2, double number3) {
		double answer=0.0;
		answer = (number1 + number2 + number3)/3;
		return answer;
		
	}
	
	// a call to convert a value in radians to degrees when passed
	public static double RadianToDegree(double number) {
		double answer=0.0;
		answer = (number/3.14159);
		return answer;
		
	}
	
	// a call to convert a value in degrees to radians when passed
	public static double DegreeToRadian(double number) {
		double answer=0.0;
		answer = (number*3.14159);
		return answer;
		
	}
	
	// a call to find the discriminant of the coefficients of a quadratic equation
	public static double Discriminant(double a, double b, double c) {
		double answer=0.0;
		answer = ((b*b)-4*a*c)/2*a;
		return answer;
		
	}
	
	//a call to convert a mixed number to an improper fraction
	public static String toImproperFrac(int number1, int numerator, int denominator) {
		int answer=0;
		answer = ((number1 * denominator) + numerator); 	
		return (answer + "/" + denominator); 
		
	}
	
	//a call to convert an improper fraction to a mixed number
	public static String toMixedNum(int number1, int number2) {
		int answer=0;
		int decimal=0;
		answer = (number1/number2);
		decimal = (number1%number2);
		return (answer + "_" + decimal + "/" + number2);
		
	}
	
	//a call to foil converts binomial multiplication to quadratic form
		public static String foil(int number1, int number2, int number3, int number4, String var) {
			


			
		}
}

	
