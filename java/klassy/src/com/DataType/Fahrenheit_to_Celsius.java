package DataType;
import java.util.Scanner;
public class Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		double celsius = (5*(fahrenheit-32.0))/9.0;
		
		System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
		
	}

}
