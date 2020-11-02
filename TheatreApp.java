import java.util.Scanner;

public class TheatreApp{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		Theatre1 myTheatre = new Theatre1();

		String day;
		int myAge;



		System.out.println("What Day?");
		day = sc.nextLine();
		myTheatre.setDayofWeek(day);
		System.out.println("Your Age");
		myAge=sc.nextInt();
		myTheatre.setAge(myAge);

		myTheatre.calcprice();







	}

}


