/* Robert Liu
 * September 26 2019
 * APCS 4
 * Library that provides information of a quadratic 
 */

public class Quadratic {

	// a call to find the discriminant of the coefficients of a quadratic equation
	public static double discriminant(double a, double b, double c) {
		return ((b*b)-4*a*c)/(2*a);
	}
	
	//a call to return the absolute value of a number passed
	public static double absValue(double number) {
		if (number > 0) {
			return number;
		} else {
			return (number*-1);
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
	
	//a call to return the square root of a double rounded 2 decimal spots
	public static double sqrt(double number) {
		double test = 1;
		while (absValue(number - (test * test)) > 0) {
			test = 0.5 * ((number/test) + test);
		}
		test = round2(test);
		return test;
	}
		
	//a call to use the quadratic formula to approximate the roots of passed integers
	public static String quadForm(double a, double b, double c) {
		double root1;
		double root2;
		if (discriminant(a, b, c) > 0) {
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
	
	public static String quadrDescriber(double a, double b, double c) {
		String output = "";
		output += "Description of the graph of:/ny = "+a+" x^2 "+b+" x + "+c+"/n/n";
		if (a >= 0) {
			output += "Opens: Up/n";
		} else {
			output += "Opens: Down/n";
		}
		double symmetry = (-b/(2*a));
		output += "Axis of Symmetry: " + round2(symmetry) + "/n";
		output += "Vertex: ("+round2(symmetry)+","+round2((a*symmetry*symmetry+b*symmetry+c))+")" + "\n";
		output += "x-intercept(s): "+quadForm(a,b,c) + "/n";
		output += "y-intercept: "+c + "/n";
		return output;
		}
	}