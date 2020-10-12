package javaapp1012;

public class Gugudan {
		public static void main(String [] args) {
			//반복문의 중첩을 이용한 구구단 출력
			for(int j = 2; j<=9; j = j+1) {
				for(int i = 1; i <=9; i=i+1) {
				 
				System.out.printf(" %d * %d =%3d" ,i, j,i*j);
				
				}
			System.out.printf("\n");
			}
		/*1)	1.***** 1-5
				2.***** 1-5
				3.***** 1-5
				4.***** 1-5
				5.***** 1-5
			*/
			for(int k =1; k<=5; k = k +1 ) {
				for(int z = 1; z<=5; z=z+1) {
					System.out.printf("*");
				}
				System.out.printf("\n");
				
				
			}
			System.out.println("");
		/*2)	1.*
			  	2.**
		  		3.***
		  		4.****
		  		5.*****
			  *이하나씩 증가하는 구조
			  *변하는 숫자의 증감치를 구해서 바깥쪽 반복문의 변수에 곱한 후 더하기 빼기를 이용해서 결과를
			  *맞추는 작업 수행 1씩 증가하므로 1*i
			 * 
			 */
			for(int k =1; k<=5; k = k +1 ) {
				for(int z = 1; z<= k; z = z+1) {
					System.out.printf("*");
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
			
			/*3)	1.***** 1-5
	  		2.****  1-4
			3.***   1-3
			4.**    1-2
			5.*     1-1
		 *이하나씩 감소하는 구조
		  *변하는 숫자의 증감치를 구해서 바깥쪽 반복문의 변수에 곱한 후 더하기 빼기를 이용해서 결과를
		  *맞추는 작업 수행
		  1씩 증가하므로 1-1 * i + 6 => 6-i 		 		 
		 */
			for(int k =1; k<=5; k = k +1 ) {
				for(int z = 1; z<=6-k; z=z+1) {
					System.out.printf("*");
				}
				System.out.printf("\n");
				
				
			}
			System.out.printf("\n");
	
			
	
			for(int k =1; k<=5; k = k +1 ) {
				for(int z = 1; z<=6-k; z=z+1) {
					System.out.printf("*");
				}
				System.out.printf("\n");
				
				
			}
		}
}

