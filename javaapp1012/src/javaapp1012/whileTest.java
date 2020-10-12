package javaapp1012;

public class whileTest {
		public static void main (String [] args) {
			//Hello java 5번 출력
			int i = 0 ;
			while(i<5) {
				System.out.println("Hello java");
				i = i + 1;
				
		
			}
			//image 1, 2 ,3 을 출력
			
			int j = 1 ;
			while(j < 4) {
				System.out.println("image" + j);
			j = j + 1;
			}
			
			//image1.png, image3.png, image5.png를 출력 반복문
			//3번 출력
			//공통된 부분 image .png
			//패턴을 갖는 부분은 1, 3, 5
			
			int k = 1;
			while(k < 4) {
				System.out.println("image"+ (2*k-1) +".png");
				k = k + 1;
//			int k = 1;
//			while(k < 6) {
//				System.out.println("image"+ k +".png");
//				k = k + 2;	
			}
			
			//1~100까지  홀 수의 합
//			int z = 1;
//			int sum = 0;
//			do {
//				
//				sum = sum + z;
//				z = z + 2;
//				
//			
//			}while(z < 101);
//			System.out.println("sum : " + sum);
			
			//1씩 증가하는 형태로 해결
			
			int z = 1 ; 
			int sum = 0;
			do {
				
				sum = sum + 2*z-1;
				z = z + 1;
				
			
			}while(z < 51);
			System.out.println("sum : " + sum);
			
			
			
			
		}
		
}
