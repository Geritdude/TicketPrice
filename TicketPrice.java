import java.util.Scanner;

public class TicketPrice {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int age;
		double price = 0.00;
		
		System.out.println("How old are you?");
		age = keyboard.nextInt();
		
		if(age>=12 && age<65){
			price = 9.26;
		}
		if(age<12 || age>=65){
			price = 5.25;
		}
		System.out.print("Please pay $");
		System.out.print(price);
		System.out.print(". ");
		System.out.println("Enjoy the show!");
		
		keyboard.close();
	}
}
