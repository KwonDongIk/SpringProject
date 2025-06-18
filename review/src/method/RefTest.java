package method;

/*
 * 참조변수 참조객체
 * 불변(상수)
 * 기본형타입 : int, double
 * wrapper 클래스 : Integer
 */
public class RefTest {
	public static void main(String[] args) {
		
		int a = 10;
		int b = a;
		b = 20;
		System.out.println(a);
		
		String[] arr = new String[] {"hello", "scott"}; // 객체 참조변수
		String[] dest = arr;
		dest[0] = "bye";
		System.out.println(arr[0]);
		
		
	}

}
