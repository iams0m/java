package 형변환;

import java.util.HashMap;

public class 고객관리시스템 {

	public static void main(String[] args) {
		HashMap name = new HashMap();
		name.put("100번", "김데이");
		name.put("200번", "김사전");
		name.put("300번", "김구조");
		name.put("400번", "김자료");
		System.out.println(name);
		name.remove("200번");
		System.out.println(name);
		name.replace("300번", "김충성");
		System.out.println(name);

	}

}
