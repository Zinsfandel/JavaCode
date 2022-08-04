import java.util.*;

public class Number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int st = input.nextInt();

        System.out.print("Enter second number : ");
		int nd = input.nextInt();

        if (st>nd)
        System.out.println(+st+" (the first) is greater than "+nd+ " (the second)");

        else if (nd>st)
        System.out.println(+st+" (the first) is no greater than "+nd+ " (the second)");

        else if (st == nd) 
        System.out.println(+st+" (the first) is equal to "+nd+" (the second");

        else 
        System.out.println("error");

        
    }
    
}
