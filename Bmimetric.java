import java.util.Scanner;

public class Bmimetric {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in); {
		
	System.out.print("Please enter weight in kilograms: ");
	double weight = s.nextDouble();
	
	System.out.print("Please enter height in meters: ");
	double height = s.nextDouble();
	
	double bmi = weight / (height * height);
				
	System.out.printf("BMI is: %.2f%n" , bmi);
	
	
	
	}
	}	
	}
