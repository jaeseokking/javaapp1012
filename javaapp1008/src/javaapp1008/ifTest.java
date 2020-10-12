package javaapp1008;

public class ifTest {
	
		public static void main(String [] args) {
			
			int su = 21465153;
			//숫자가 짝수이면 짝수라고 출력하기
			if(su % 2 == 0) {System.out.println("짝수");} 
			
			else {System.out.println("홀수");}
			
				
			//숫자가 짝수라면 짝수라고 훌력하고 아니면 홀수라고 출력하기
			
			//아이딩와 비밀번호를 입력받아서 아이디가 root이고 비밀번호가 system 이면 로그인 성공이라고 출력하고
			//그렇기 않으면 로그인 실패라고 출력하기
		
			//1.아이디와 비밀번호를 입력받기 -Scanner
			java.util.Scanner sc = new java.util.Scanner(System.in);
			
			
			
			System.out.printf("%11s","ID : ");
			String id = sc.nextLine();
			
			
			System.out.printf("PASSWORD : ");			
			String pw = sc.nextLine();
			
			if(id.equals("root") && pw.equals("system")) {System.out.print("로그인 성공!");}
			else {System.out.println("로그인 실패");}
			
			sc.close();
			}
			//2.아이디와 비밀번호를 비교해서 처리
			//숫자 데이터나 boolean 데이터는 == 로 일치하는지 확인하지만 문자열은 equals를 이용해서 검사
}



