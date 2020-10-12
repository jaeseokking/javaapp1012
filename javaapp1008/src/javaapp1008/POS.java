package javaapp1008;

public class POS {
			
		public static void main(String[] args) {
			//메뉴 정하기
			//1.돈까스 - 8000
			//2.치킨덮밥 - 7000
			//3.비빔면 - 5000
			
			//키보드로 부터 입력받는 객체 만들기
			
			//입력받는 객체 사용 종료하는 코드를 작성
			
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.printf("돈까스는 1번, 치킨덮밥는 2번, 비빔면은 3번을 입력하시오 : " );
		int menu = sc.nextInt();
		//잘못된 메뉴를 입력하면 메뉴 선택화면으로 되돌린다
		
		//수량입력받기	
		System.out.printf("수량을 입력하세요(1~9) : ");
		int cnt = sc.nextInt();
		
		int total = 0;
		
		switch(menu) {
			case 1 :total = 8000 * cnt;
			break;
			case 2 :total = 7000 * cnt;
			break;
			case 3 :total = 5000 * cnt;
			break;
			default :
					System.out.printf("잘못 선택하였습니다.");
					break;
		}	
		
		
		//주문 여부 확인
		System.out.printf("총 결제 금액은 %d 원입니다.\n", total);
		System.out.printf( "주문은 Y 최소는 N");
		
		
		//주문여부입력받기
	
		String input ;
		sc.nextLine();
		input = sc.nextLine();
		if(input.equals("Y")){System.out.printf("주문 완료\n");}
		else if(input.equals("N")){System.out.printf("주문 취소\n");}
		
		
		
		sc.close();
			
		}
		
		
		
			
		}

