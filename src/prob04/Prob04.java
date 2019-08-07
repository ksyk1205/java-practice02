package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		// str의 문자열을 캐릭터형 배열로 변환하여 c3에 넣는다
		char[] c3 = str.toCharArray();
		char[] c4 = new char[str.length()];
		//c1[] 끝에서 시작해서 처음에서 끝
		for(int i = str.length()-1;i>=0;--i) {
//			문자열 순서를 거꾸로 한다
			c4[(str.length()-1)-i] =c3[i]; 
		}
		/* 코드를 완성합니다 */
		return c4;
		
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		System.out.println(array);
	}
}