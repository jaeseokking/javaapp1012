package javaapp1008;

public class SwiftTest {
				public static void main(String[] args) {
					//menu가 1번이면 중식 2번이면 한식 3번이면 분식을 출력하고자 합니다.
					//이 문제는 if로도 해결이 가능합니다. (대도록이면 if보다는 switch를 사용한다.)
					
					int menu = 2;
					final int CHINA = 1;
					final int KOREA = 2;
					final int SNACK = 3 ;
					
					switch(menu) {
					case CHINA :
						System.out.printf("중식\n");
						break; //안써줘도 괜찮지만 꼭쓰자
					case KOREA :
						System.out.printf("한식\n");
						break;
					case SNACK : 
						System.out.printf("분식\n");
						break;
					default :
						System.out.printf("잘못된 메뉴\n");
						break;
							
					}		
	
			}
}
