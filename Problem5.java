package problem5;
import java.util.Scanner;
public class Problem5 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		double pi=3.14159;
		System.out.println("Enter the radius as an integer");
		int raduis = input.nextInt();
		double diameter,
		       circumference,
		       arae;
		diameter = 2*raduis;
		circumference = 2*pi*raduis; 
		arae = pi*raduis*raduis;
		System.out.println(diameter);
		System.out.println(circumference );
		System.out.println(arae );

}
}