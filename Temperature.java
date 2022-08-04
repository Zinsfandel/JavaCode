import java.util.*;

public class Temperature {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
		
		System.out.println("Input F to convert celsius to fahrenheit, input C to convert fahrenheit to celsius : ");
        char temp = input.next().charAt(0);

        double fahrenheit;
        double celsius;

        if (temp == 'C') {
            System.out.println("Enter fahrenheit : ");
            fahrenheit = input.nextDouble();
            celsius = (fahrenheit-32)*0.56;
            System.out.println(+fahrenheit+" fahrenheit is "+celsius+ " celsius");
        }

        else if (temp == 'F') {
            System.out.println("Enter celsius : ");
            celsius = input.nextDouble();
            fahrenheit = (1.8*celsius)+32;
            System.out.println(+celsius+" celsius is "+fahrenheit+" fahrenheit");
        }

        else
        System.out.println("error");
        
    }
    
}
