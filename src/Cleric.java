
public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;

	public void selfAid() {
		System.out.println(this.name + "のセルフエイド");
		this.mp -= 5;
		this.hp = this.MAX_HP;
		System.out.println("HPを最大回復した");
	}
}
