package javaapp1008;

public class ElseIfTest {
				public static void main(String[] args) {
					
//					int score = 87;
//					
//					//90이상이면 A, 80이상이면 B, 70이상이면 C, 60이상이면 D, 그 이외는 F
//					
//					if(score >= 90) {System.out.println("A");}
//					else if(score >= 80) {System.out.println("B");}
//					else if(score >= 70) {System.out.println("C");}
//					else if(score >= 60) {System.out.println("D");} 
//					else {System.out.println("F");}
//					
					
					
					
					java.util.Scanner sc = new java.util.Scanner(System.in);
					
					
					
					System.out.printf("%11s","ID : ");
					String id = sc.nextLine();
					
					
					System.out.printf("PASSWORD : ");			
					String pw = sc.nextLine();
					
					if(id.equals("root") && pw.equals("system")) {System.out.print("로그인 성공");}
					else if (id.contentEquals("root") && !pw.equals("system")){System.out.print("잘못된 비밀번호 입니다.");}
					else {System.out.print("잘못된 아이디 입니다.");}
					
					sc.close();
					
					//id가 root이고 pw가 system이면 로그인 성공
					//id가 root이고 pw가 system이 아니면 비밀번호 틀림
					//id가 root가 아니면 잘못된 id라고 출력

					
				}
}
