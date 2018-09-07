import java.util.Scanner;
import static java.lang.Math.*;

public class EvenOrOddLie {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	System.out.println("please type in an integer");
    	
    	// read the number from the user
    	int number = in.nextInt();
    	// initialize the 10% lying by using a random number generator
    	int lie = (int) (random() * 10)+1;
    	if (lie == 10){
    		number = number + 1;
		}
		if (number % 2 == 0){
		System.out.println("the number is even!");	
		} else{
		System.out.println("the number is odd!");	
		}
	}
}
