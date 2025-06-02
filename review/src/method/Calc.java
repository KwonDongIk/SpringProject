package method;

public class Calc {

	private int kor;
	private int eng;
	
	public void add() {
		System.out.println(String.format("%d + %d = %d", kor, eng, kor + eng));
	}
	
	public Calc(int kor, int eng) {
		super();
		this.kor = kor;
		this.eng = eng;
	}

	public void printMsg(String msg) {
		
		System.out.println("====================");
		System.out.printf("=======%s=======\n", msg);
		System.out.println("====================");

	}
}
