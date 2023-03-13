package 부품사용하기;

import 부품만들기.강아지;

public class 강아지사용하기 {

	public static void main(String[] args) {
		강아지 dog1 = new 강아지();
		dog1.age = 2;
		dog1.species = "프렌치 불독";
		dog1.산책하다();
		System.out.println("dog1의 나이 : " + dog1.age);
		System.out.println("dog1의 종 : " + dog1.species);
		
		System.out.println();
		
		강아지 dog2 = new 강아지();
		dog2.age = 3;
		dog2.species = "웰시코기";
		dog2.먹다();
		System.out.println("dog2의 나이 : " + dog2.age);
		System.out.println("dog2의 종 : " + dog2.species);

	}

}
