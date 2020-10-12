package javaapp1008;

public class ColsoleInput {
	
	public static void main(String[] args) {
		//키보드로 부터 입력받는 Scanner생성
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
	
		//이름 입력받기
		System.out.printf("이름입력 : ");
		String name = sc.nextLine();
		
		//점수를 입력받기
		System.out.printf("점수입력 : ");
		int score = sc.nextInt();

		//주소 입력받기
		System.out.printf("주소입력 : ");
		sc.nextLine();     //숫자 다음에 문자열을 입력받을 때는 버퍼를 비우기 위해서 한 번 호출을 해야 합니다.
		String address = sc.nextLine();
		
	
		
		System.out.printf("이름:%-5s 점수:%d 주소:%-20s\n", name, score, address);
	
		
		//스캐너 종료
		sc.close();
		
		
	}
	

}


