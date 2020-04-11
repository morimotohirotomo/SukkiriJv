import java.util.HashMap;
import java.util.Map;
public class Task16_3 {
	public static void main(String[] args) {
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		Map<Hero, Integer> hero = new HashMap<Hero, Integer>();
		hero.put(h1, 3);
		hero.put(h2, 7);
		for (Hero key : hero.keySet()) {
			System.out.println(key.getName() + "が倒した敵=" + hero.get(key));
		}
	}
}
