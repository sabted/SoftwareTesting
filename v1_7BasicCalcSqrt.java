package basicCalculator;

public class BasicCalc {
	
	public BasicCalc(){
		
	}
	
	public double add(double x, double y) {
		return x + y;
	}
	
	public double subtract(double x, double y) {
		return x - y;
	}
	
	public double multiply(double x, double y) {
		return x * y;
	}
	
	public double divide(double x, double y) {
		if(y!=0) {
			return x / y;
		}
		else {
			System.out.print("Error: Divide by zero.");
			return 0;
		}
	}
	
	public int factorial(int x) {
		int result = 1;
		for(int i=1; i<=x; i++) {
			result = result * i;
		}
		return result;
	}
	
	public int power(int x, int y) {
		int temp = x;
		for(int i=1; i<y; i++) {
			temp = temp*x;
		}
		return temp;
	}
	
	public double sqrt(double x) {
		if(x >= 0) {
			return Math.sqrt(x);
		}
		else {
			System.out.print("Cannot square root negative number.");
			return 0;
		}
	}
}
