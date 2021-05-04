import java.util.*;
public class Grade 

{
	public static void main(String[] args) 
	
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your score : ");
		int score = input.nextInt();
		
		if (score<=100 && score>=80)
			System.out.println("Grade A");
		
		else if (score<=79 && score>=70)
			System.out.println("Grade B");
		
		else if (score<=69 && score>=60)
			System.out.println("Grade C");
		
		else if (score<=59 && score>=50)
			System.out.println("Grade D");
		
		else if (score>=0 && score<=49)
			System.out.println("Grade F");
		
		else
			System.out.println("ERROR");
	}

}
