package method;

public class 형변환 {
	public static void main(String[] args) {
		int a = 5 / 2;
		double b = 5 / 2;

		short s = (short) a; // 강제적형변환 -> 캐스트연산자
		double d3 = (double) b;

		System.out.println(s);
		System.out.println(d3);
	}

}
