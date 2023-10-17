import java.util.Scanner;

public class Bmiimperial {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in); {
			
			System.out.print("Please enter weight in pounds: ");
			double weight = s.nextDouble();
			
			System.out.print("Please enter height in inches: ");
			double height = s.nextDouble();
			
			double weight1 = weight * 0.453592;
			
			double height1 = height * 0.0254;
			
			double bmi = weight1 / (height1 * height1);
						
			System.out.printf("BMI is: %.2f%n" , bmi);
			
			
			}
			}	
			}
