import java.util.Scanner;
public class Fizzbuzz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
	    for(int x = 1; x <= input; x++) {
		    fizzbuzz(x);
		}
	}

	public static void fizzbuzz(int n) {
		if (n % 15 == 0) {
			System.out.println("fizzbuzz");
		} else if (n % 3 == 0) {
			System.out.println("fizz");
		} else if (n % 5 == 0) {
			System.out.println("buzz");
		} else {
			System.out.println (n);
		}
	}
}
