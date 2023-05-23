package ch01;

public class c02Systemout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System : os
		//System : os가 관리하는 표준 출력 스트림
		
		//system.out.print();
		//ESCAPE문자
		// \n : 개행, 줄바꿈
		// \b : 백스페이스
		// \t : 탭길이(기본 8칸) 만큼 커서이동
		System.out.print("HELLO\n");
		System.out.print("HELLO\n");
		System.out.print("HELLO\n");
		System.out.print("HE\tLLOW\tOLED");
		
		//system.out.printf();
		//format : 형식,서식
		//%d : 10진수 정수 서식 문자
		//%f : 10진수 실수 서식문자
		//%c : 한문자 서식문자
		//%s : 문자열 서식문자
		System.out.printf("%d %d %d \n",10,20,30);
		System.out.printf("%f %f %d \f",10.1,20.1,301);
		System.out.printf("%c %c %c \n",'A','B','C');
		System.out.printf("%s %s %s \n","This is","String","Test");
		System.out.printf("%d.%s %d \n",1,"국어",100);
		
		
		
		
		//system.out.println();
		
		
		
	}

}
