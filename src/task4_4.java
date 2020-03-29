import java.util.Scanner;
public class task4_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numbers[] = {3, 4, 9};
		System.out.println("1桁の数字を入力してください");
		int input = scanner.nextInt();
		for (int n : numbers) {
			if (n == input) {
				System.out.println("アタリ!");
			}
		}
	}
}
