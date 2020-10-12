package javaapp1008;

public class Practice1 {
			public static void main(String[] args) {
					//사용자가 복사할 매수를 입력하면 1~100까지는 장당 50원
					//101~1000까지는 장당 40원
				    //그 이상은 장당 30원으로 계산해서
					//총금액을 출력하는 프로그램을 작성
				
			
			//1. 복사할 매수 입력 받기 - scanner
				java.util.Scanner sc = new java.util.Scanner(System.in);
				
				System.out.printf("매수를 입력하시오 : ");
				int pages = sc.nextInt();
				
				int A;
				
				if(pages > 1001){ A = 50 ;}
				else if(pages > 101){ A = 40 ;}
				else { A = 30; }
				
				int money = A * pages;
				
				System.out.printf("비용 : " + money +"원" );
				
				sc.close();
				
				
				
			//2. 한 장당 가격을 설정 - if
			//3. 금액을 계산 - 연산자
			//4. 금액을 출력 - 출력하기
				
	}

}
