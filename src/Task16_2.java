import java.util.ArrayList;
import java.util.List;
public class Task16_2 {
	public static void main(String[] args) {
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		List<Hero> hero = new ArrayList<Hero>();
		hero.add(h1);
		hero.add(h2);
		for (Hero h : hero) {
			System.out.println(h.getName());
		}
	}
}
