package 배열복습;

public class 스트링과배열1 {

	public static void main(String[] args) {
		//스트링 일부 추출
		String s = "나는 프로그래머야";
		String s2 = "진짜!!";
		System.out.println(s + s2); //스트링 결합
		System.out.println(s.concat(s2)); //스트링 결합
		
		System.out.println(s.charAt(0)); //문자1글자 추출
		char c = s.charAt(0); 
		
		System.out.println(s.endsWith("야")); //특정한 문자로 끝나는지 확인
		boolean result = s.endsWith("야");
		
		String result2 = s.substring(3); //인덱스3이후 글자들 모두 추출
		String result3 = s.substring(3,8); //인덱스 3~7까지 추출
		boolean result4 = s.contains(s2); //s에 s2가 포함되어 있는지
		int index = s.lastIndexOf("프"); //8
		System.out.println(s.toUpperCase()); //대문자로
		System.out.println(s.toLowerCase()); //소문자로
		System.out.println(s.length()); //글자수
		s = s.replace("나", "너"); //비파괴함수
		System.out.println(s);

	}

}
