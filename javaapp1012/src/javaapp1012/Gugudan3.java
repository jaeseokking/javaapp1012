package javaapp1012;

public class Gugudan3 {
			public static void main(String [] args) {
				//5)
				for(int i = 1; i <=5; i = i +1) {
					if(i<=3) {
						for(int j = 1; j<=i-1; j = j+1) {
							
							System.out.printf(" ");
						
						}
						for(int j = 1; j<=4-i; j = j+1) {
							
							System.out.printf("*");
						
						}
					System.out.println("");
					}
					else {
						for(int j = 1; j<=5-i; j= j + 1 ) {
							
							System.out.printf(" ");
							}
						
						for(int j = 1; j<i-1; j = j +1) {
							
							System.out.printf("*");
							}
						
						System.out.println("");
						}
					}
					
				}
				
				
			}

