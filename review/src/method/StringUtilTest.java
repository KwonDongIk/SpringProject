package method;

public class StringUtilTest {
	public static void main(String[] args) {
		
		
		StringUtil st = new StringUtil();
		String a = "hello";
		a = st.upper(a);
		System.out.println(a);
		
		System.out.println("==================");
		
		String[] arr = new String[] {"hello", "scott"};
		st.upper(arr);
		System.out.println(arr[0]);
	}
}
