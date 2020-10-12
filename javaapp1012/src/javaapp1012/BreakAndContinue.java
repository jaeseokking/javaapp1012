package javaapp1012;

public class BreakAndContinue {
	public static void main(String[] args) {
			//break는 반복문을 중단하느 역할
			for(int i=1; i<=10; i=i+1) {
				//i의 값이 3의 배수가 되면 반복문을 종료
				if(i%3 == 0) {
					break;
					//continue; //는 반복문앞에서 아래 문장은 수행하지 않고 다음 반복으로 진행
					
					
				}
				System.out.println("Hello java:" + i);
			}
			
}
}