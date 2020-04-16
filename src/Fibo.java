import java.util.Scanner;
public class Fibo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1以上の整数を入力してください");
		int input = scanner.nextInt();
		for (int n = 0; n < input; n++) {
			System.out.println(fibo(n));
		}
	}
	public static int fibo(int num) {
		if (num < 2) {
			return num;
		} else {
			return fibo(num - 1) + fibo(num - 2);
		}
	}
}
