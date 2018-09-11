import java.util.Scanner;
import static java.lang.Math.*;


public class PrimeNumberChecker {

public static void main(String[] args) {
	//Scanner scanner = new Scanner(System.in);
	//int range = scanner.nextInt();
	//System.out.println("please print your range");
	int primeNumbers = 0;
	
	for (int i = 0 ;i <=10000 ;i++ ){ // looping the method and counting primes
		boolean result =primeChecker(i);
		if (result == true){
			primeNumbers++;
	}
	}
	System.out.println("there are "+primeNumbers+" in this range" );
	
}
	
	public static boolean primeChecker(int number){ // method to check if prime
	if (number == 1 || number == 2 || number == 3){
		System.out.println("this is a prime");
		return true;
	}
	for (int i = 2;i <= number/2; i+=1){
    		if(number % i == 0){
    		System.out.println(number +"the number is not a prime");
    		return false;
    		}
    		
    }
    System.out.println(number +"the number is  a prime");
    return true;
    }
}
	
	

	