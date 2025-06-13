package method;

import java.util.Scanner;

public class B10950 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 갯수 입력
		int test = sc.nextInt();
		int a;
		int b;
		

		// 반복문
		for(int i = 0; i < test; i++) {
			
			a = sc.nextInt();
			b = sc.nextInt();
			// 두수 합
			System.out.println(a + b);
			
		}		
	}
}
