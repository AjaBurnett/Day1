import java.util.Scanner;

public class roomSize {

	public static void main (String []args) {
		
		String answer;
		do {
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Length");
		double roomLength = scan.nextDouble();
		
		
		System.out.println("Enter Width");
		double roomWidth = scan.nextDouble();
		
		System.out.println("Enter Height");
		double roomHeight = scan.nextDouble();
		
		double area = (roomWidth * roomLength);
		
		System.out.println("Area: " + area); 
		
		double perimeter = ((roomWidth * 2) + (roomLength * 2));
				System.out.println ("Perimeter: " + perimeter);
				
				double volume = (roomWidth * roomHeight * roomWidth);
				System.out.println ("Volume: " + volume);
				
				
						
				
		System.out.println("Continue? (y/n)");
		answer = scan.next();
		}
		while (answer.equals("y"));
				
				
		
		
		
		
	}
}
