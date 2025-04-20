import java.util.Scanner;

public class WeeklyTemp {

	public static void main(String[] args) {
		String[] days = {"Monday", "Tuesday", "Wednsday" , "Thursday", "Friday", "Saturday", "Sunday"};
		int[] temps = new int[7];
		//Kept as standard Array for consistency in length
		Scanner sc = new Scanner(System.in);
		String exit = "go";
		for(int i = 0; i < days.length; i++) {
			System.out.println("Please enter an average temperature for " + days[i] + ".");
			temps[i] = sc.nextInt();
			sc.nextLine();
		}
		while( !exit.equalsIgnoreCase("stop")) {
			System.out.println("To display an average temperature for a single day of the week, enter the day of the week to search for");
			System.out.println("To display the entire week's averages, please enter \"week\".");
			System.out.println("Enter your request now:");
			String rq = sc.nextLine();
			if (rq.equalsIgnoreCase("week")) {
				double weekavg = 0;
				for (int j = 0; j < temps.length; j++) {
					weekavg = weekavg + temps[j];
					System.out.println("The average temperature for " + days[j] + " is " + temps[j] + ".");
					}
				System.out.println();
				System.out.println("The average temperature for the week is " + (weekavg / 7)+ ".");
			} else {
				boolean dayfound = false;
					for (int k = 0; k < days.length; k ++) {
						if (rq.equalsIgnoreCase(days[k])) {
							System.out.println("The average temperature for " + days[k] + " is " + temps[k] + ".");
							dayfound = true;
							break;
						}
					}
				if (!dayfound) {
					System.out.println("That entry was no recognized. please try again");
				}
			}
			System.out.println("\nTo stop searcing please enter \"stop\". Otherwise, make any entry to continue");
			exit = sc.nextLine();	
			}
	System.out.println("7 day forecast closed.");	
	sc.close();	
	}
}