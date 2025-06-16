package 제어문;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 60점 미만 몇명인가?
public class ForCount {
	public static void main(String[] args) throws FileNotFoundException {
		
		//파일 입력
		File file = new File("src/resources/engScore.txt");
		Scanner sc = new Scanner(file);
		
		//전체 건수 입력
		int cnt = sc.nextInt();
		int[] a = new int[cnt];
		
		int tmp = 0;
		
		for(int i = 0; i < cnt; i++) {
			int score = sc.nextInt();
			
			if(score < 60) {
				
				System.out.println("점수 : " + score);
				tmp++;
				
			}
		}
		System.out.println("몇명인가요? : " + tmp + "명");
	}

}
