import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) 
	{
		String name = null;
		int bYear = 0;
		int year = 2015;

		Scanner input = new Scanner(System.in);

		for(int count = 0; count < 3; count++)
		{
			System.out.println("What is your name?");
			name = input.next();
			System.out.println("What is your birthyear?");
			bYear = input.nextInt();
		}
		int age = year - bYear;
		int dYear = bYear + 21;

		System.out.printf("Hello %s, you are %d years old today!\n", name, age);
		if(age < 21)
		{
			System.out.printf("You're not old enough to drink.\nYou will be able to drink in %d ", dYear);
		}
		else
		{
			System.out.println("Congratulations! You're allowed to drink alcohol!");
		}

	}

}
