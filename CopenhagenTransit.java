
import java.util.Scanner;
public class CopenhagenTransit {
	public static void main(String[] args)  {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter zone number :");
		int zoneNumber = input.nextInt();

		System.out.println("Enter adult or child :");
		String ticketType = input.next();


	double fare = 0.0;

		if (zoneNumber <= 2 && ticketType.equals("adult")) {
			fare = 23.0;
		}
		if (zoneNumber <= 2 && ticketType.equals("child")) {
			fare = 11.5;
		}
		if (zoneNumber == 3 && ticketType.equals("adult")) {
			fare = 34.5;
		}
		if ((zoneNumber == 3 || zoneNumber == 4) && ticketType.equals("child")) {
			fare = 23.0;
		}


if (zoneNumber == 4 && ticketType.equals("adult")) {
			fare = 46.0;
		}
		if (zoneNumber > 4) {
			fare = -1.00;
		}

		System.out.println("The fare for " + ticketType + " to zone number " + zoneNumber + " is " + fare+".");

	}

}