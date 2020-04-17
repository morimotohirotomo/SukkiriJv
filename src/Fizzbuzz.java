import java.util.Scanner;
public class Fizzbuzz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1以上の整数を入力してください");
		int input = scanner.nextInt();
	    for(int i = 1; i <= input; i++) {
	    	System.out.println(
	    		((i % 15 == 0) ? "FizzBuzz" : ((i % 5 == 0) ? "Buzz" : ((i % 3 == 0) ? "Fizz" : i)))
	    	);
		}
	}

//	public static void fizzbuzz(int n) {
//		if (n % 15 == 0) {
//			System.out.println("fizzbuzz");
//		} else if (n % 3 == 0) {
//			System.out.println("fizz");
//		} else if (n % 5 == 0) {
//			System.out.println("buzz");
//		} else {
//			System.out.println (n);
//		}
//	}
}
