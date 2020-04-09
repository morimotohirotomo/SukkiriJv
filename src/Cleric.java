import java.util.*
public class Cleric {
	String name;
	int hp = 50;
	static final int MAX_HP = 50;
	int mp = 10;
	static final int MAX_MP = 10;

	public void selfAid() {
		System.out.println(this.name + "のセルフエイド");
		this.mp -= 5;
		this.hp = this.MAX_HP;
		System.out.println("HPを最大回復した");
	}

	public int prey(int sec) {
		System.out.println(this.name + "は" + sec + "秒祈った");
		int recover = new Random().nextInt(3) + sec;
		int recoverAction = Math.min(this.MAX_MP - this.mp, recover);
		this.mp += recoverAction;
		System.out.println(recoverAction + "MP回復");
		return recoverAction;
	}
}
