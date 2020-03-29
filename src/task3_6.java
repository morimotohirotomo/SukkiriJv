import java.util.Scanner;
public class task3_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("【数当てゲーム】");
		int ans = new java.util.Random().nextInt(10);
		for (int i = 0; i < 5; i++) {
			System.out.println("0~9の数字を入力してください");
			int num = scanner.nextInt();
		}
	}
}
