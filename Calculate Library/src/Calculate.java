/* Robert Liu
 * August 29 2019
 * Period 4
 * A group of methods that perform math calculations (library)
 */

public class Calculate {

// Part 1: Methods, Headers, and Basic Math
	
	// a call to square returns the square of a value passed
	public static int Square(int number) {
		return number*number;
	}
	
	// a call to cube returns the cube of a value passed
	public static int Cube(int number) {
		return number*number*number;
	} 
		
	// a call to average the sum of two values passed
	public static double Average(double number1, double number2) {
		return (number1 + number2)/2;		
	}

	// a call to average the sum of three values passed
	public static double Average(double number1, double number2, double number3) {
		return (number1 + number2 + number3)/3;
	}
	
	// a call to convert a value in radians to degrees when passed
	public static double toDegree(double radian) {
		return (radian*180/3.14159);		
	}
	
	// a call to convert a value in degrees to radians when passed
	public static double toRadian(double degree) {
		return (degree*3.14159/180);		
	}
	
	// a call to find the discriminant of the coefficients of a quadratic equation
	public static double discriminant(double a, double b, double c) {
		return ((b*b)-4*a*c)/(2*a);
	}
	
	//a call to convert a mixed number to an improper fraction
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		return (((whole*denominator) + numerator) + "/" + denominator); 	
	}
	
	//a call to convert an improper fraction to a mixed number
	public static String toMixedNum(int numerator, int denominator) {
		return ((numerator/denominator) + "_" + (numerator%denominator) + "/" + denominator);
	}
	
	//a call to foil converts binomial multiplication to quadratic form
	public static String foil(int a, int b, int c, int d, String var) {
		return ((a*c) + var + "^2 + " + ((a*d) + (b*c) + "var") + (b*d));
	}
	
// Part 2: Methods w/ Conditionals
	
	//a call to determine whether or not one integer is evenly divisible by the other
	public static boolean isDivisibleBy(int number1, int number2) {
		if (number1%number2 == 0) {
				return true;
		} else {
				return false;	
		}
	}
	
	//a call to return the absolute value of a number passed
	public static double absValue(double number) {
		if (number > 0) {
			return number;
		} else {
			return (number*-1);
		}
	}
	
	//a call to return the larger of two values passed
	public static double max(double number1, double number2) {
		if (number1 >= number2) {
			return number1;
		} else {
			return number2;
		}
	}
	
	//a call to return the largest value of three values passed
	public static double max(double number1, double number2, double number3) {
		if (number1 > number2 && number1 > number3) {
			return number1;
		} else if (number2 > number1 && number2 > number3) {
			return number2;
		} else {
			return number3;
		}
	}
	
	//a call to return the smaller of two values passed
	public static int min(int number1, int number2) {
		if (number1 > number2) {
			return number2;
		} else {
			return number1;
		}
	}
	
	//a call to round a double to 2 decimal places
	public static double round2(double number) {
		number = number*100;
		if (number > 0) {
			number = number + 0.5;
		} else {
			number = number - 0.5;
		}
		number = (int) number;
		number = ((double)number/100);
		return number;
	}
	
//Part 3: Methods that use Loops and Calls to Other Methods
	
	//a call to raise a value to an integer and returns a double
	public static double exponent(double base, int power) {
		double answer = 1;
		for (int i=0; i<power; i++) {
			answer = answer*base;
		}
		return answer;
	}
	
	//a call to return the factorial of the value passed	
	public static int factorial(int number) {
		int answer=1;
		for (int i=2; i <= number; i++) {
			answer = answer*i;
		} 
		return answer;
	}
	
	//a call to determine whether or not an integer is a prime
	public static boolean isPrime(int number) {
		for(int i = 2; i < number; i++) {
			if(isDivisibleBy(number, i)) {
				return false;
			}
		}
		return true;
		}
	
	//a call to find the greatest common factor between two positive integers
	public static int gcf(int number1, int number2) {
		int answer = 1;
		for (int i = 1; i <= absValue(min(number1, number2)); i++) {
			if (isDivisibleBy(number1, i) == true && isDivisibleBy(number2, i) == true) {
				answer = i;
			}
		}
		return answer;
		}
	
	//a call to return the square root of a double rounded 2 decimal spots
	public static double sqrt(double number) {
		double test = 1;
		while (absValue(number - (test * test)) > 0) {
			test = 0.5 * ((number/test) + test);
		}
		test = round2(test);
		return test;
	}
	
//Part 4: Throwing Exceptions
	
	//a call to use the quadratic formula to approximate the roots of passed integers
	public static String quadForm(int a, int b, int c) {
		double root1;
		double root2;
		while (discriminant(a, b, c) > 0) {
			root1 = ((-b + sqrt(discriminant(a, b, c))) / 2*a);
			root2 = ((-b - sqrt(discriminant(a, b, c))) / 2*a);
			if (root1 < root2) {
				return root1 + " + " + root2;
			} else {
				return root2 + " + " + root1;
			}
		}
			
		if (discriminant(a, b, c) == 0) {
			root1 = ((-b + sqrt(discriminant(a, b, c))) / 2*a);
			return root1 + "";
		}
		
		if (discriminant(a, b, c) < 0) {
			return "no real roots";
		}
		return "";	
	}
}

		
	
