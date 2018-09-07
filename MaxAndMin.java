import java.util.Scanner;
import static java.lang.Math.*;

//finds the maximum and minimum number from input of 5 numbers

public class MaxAndMin {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	System.out.println("please type in 5 numbers");
    	
    	int n1 = in.nextInt();
    	int n2 = in.nextInt();
    	int n3 = in.nextInt();
    	int n4 = in.nextInt();
    	int n5 = in.nextInt();
    	// find the largest number
    	int maxThree = maxOf3(n1,n2,n3);
    	int max = maxOf3(maxThree,n4,n5);
    	
    	//find the smallest number
    	int minThree = minOf3(n1,n2,n3);
    	int min = minOf3(minThree,n4,n5);
    	
    	System.out.println("Maximum: " + max);
    	
    	System.out.println("Minimum: " + min);
    }

    public static int maxOf3(int r, int s, int t) {
    	int maximum = max(r,max(s,t));
    	return maximum;
    }
    
    public static int minOf3(int r, int s, int t) {
    	int minimum = min(r,max(s,t));
    	return minimum;
    }
    
}
