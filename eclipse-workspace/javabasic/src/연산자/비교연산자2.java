package 연산자;

public class 비교연산자2 {

	public static void main(String[] args) {
		//비교연산자(==, !=, >, >=)
		//비교 결과 중요(논리형 데이터,true/false)
		
		//기본형 데이터는 비교연산자를 가지고 비교 가능
		//기본형 데이터가 아니면 비교연산자를 가지고 비교 불가능
		int id = 1111;
		int id2 = 2222;
		
		int pw = 3333;
		int pw2 = 3333;
		
		//아이디가 동일한지 비교
		//패스워드가 동일한지 비교
		//비교할 때 사용 ==
		System.out.println("아이디 일치 여부 : " + (id == id2));
		System.out.println("비밀번호 일치 여부 : " + (pw == pw2));
		
	}

}
