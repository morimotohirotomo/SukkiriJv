import java.util.Scanner;
public class task4_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numbers[] = {3, 4, 9};
		System.out.println("1桁の数字を入力してください");

		for (int n : numbers) {
			int input = scanner.nextInt();
			if (n == input) {
				System.out.println("アタリ!");
			}
		}
	}
}
