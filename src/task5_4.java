
public class task5_4 {
	public static void main(String[] args) {
		double calcTriangleArea = calcTriangleArea(10.0, 5.0);
		System.out.println(calcTriangleArea + "c㎡");
		double calcCircleArea = calcCircleArea(5.0);
		System.out.println(calcCircleArea + "c㎡");
	}

	public static double calcTriangleArea(double bottom, double height) {
		double area = (bottom * height) / 2;
		return area;
	}

	public static double calcCircleArea(double radius) {
		final double Pi = 3.14;
		double area = radius * radius * Pi;
		return area;
	}
}
