import java.util.Scanner;
import static java.lang.Math.*;


public class MaxMinUnspecified {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.println("please enter a set of numbers");
int maximum = scanner.nextInt(); //-2147483647; // MIN NUMBER FOR INT
int minimum = scanner.nextInt();

while (scanner.hasNextInt() == true){
	int n3 = scanner.nextInt();
	int tempMaximum = maximum(maximum,minimum);
	int tempMinimum = minimum(maximum,minimum);
	 
	 maximum = maximum(tempMaximum,n3);
	 minimum = minimum(tempMinimum,n3);
	 
	 
	
}
System.out.println("the max is " + maximum);
System.out.println("the min is " + minimum);
}
public static int maximum(int n1,int n2){
	int max = max(n1,n2);
	return max;
}
public static int minimum(int n1,int n2){
	int min = min(n1,n2);
	return min;
}
}


