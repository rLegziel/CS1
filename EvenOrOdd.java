import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	System.out.println("please type in a number between 0 and 20");
    	
    	
    	int number = in.nextInt();
    	
    	if (number > 20 || number < 0){
    		System.out.println("i asked for a number between 0 and 20");
    	}
    	
    	if (number % 2 == 0){
    	System.out.println("the number is not a prime");
    	} else{
    	for (int i=3;i <= 9; i+=2){
    		if(number % i == 0){
    		System.out.println("the number is not a prime");
    		break;
    	}else{
    		System.out.println("the number is a prime");
    		break;
}
}
		}
	}
}