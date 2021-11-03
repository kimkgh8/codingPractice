package personal;


//charAt연습
public class practice_charAt {

	public static void main(String[] args) {
		String str = "테스트연습";

		str.charAt(0); // 테

		str.charAt(1); // 스

		str.charAt(2); // 트

		str.charAt(3); // 연

		str.charAt(4); // 습

		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));

		
		String str2 = "12345";
		
		int i = str2.charAt(0); // 1(문자)
		System.out.println(i); // 49(아스키코드)
		
		int j = str2.charAt(0) - '0'; // '0'은 아스키코드 48
		System.out.println(j); // 1
		
	}

}
