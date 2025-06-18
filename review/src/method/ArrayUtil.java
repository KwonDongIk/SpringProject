package method;

public class ArrayUtil {
	
	public int sum(int[] a) {
		int result = 0;
		
		for(int i = 0; i < a.length; i++) {
			
			result += a[i];
		}
		return result;
	}
	
	public double avg(int a, int b, int c) {
		return (a+b+c)/3;
	}

}
