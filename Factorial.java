import java.util.*;

public class Factorial{
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Enter number: ");
		int n = read.nextInt();

		System.out.println("Factorial is: " + fact(n));

	}

	public static int fact(int n){
		if(n == 0)
			return 1;
		else
			return (n * fact(n-1));
	}
}