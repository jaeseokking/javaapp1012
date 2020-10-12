package javaapp1008;

public class Operator {
	public static void main(String[] args) {
		int score = 78 ;
		//msg 라는 변수에 score가 60이상이면 합격 아니면 불합격이라고 저장
		String msg = score >= 60 ? "합격" : "불합격";
		System.out.printf("%5s\n", msg);
		
		int a = 20;
		//a = a * 4; 로 변경이 가능
		a *= 4;
		System.out.printf("a=%2d\n", a);
		
		//다음 2개 변수의 값을 교환하기
		//n1은 20이 나오고 n2는 30이 나오도록
		//n1이나 n2에 직접 20이나 30은 대입하면 안됩니다.
		//데이터가 여러 개 있을 때 순서대로 나열 (정렬 - sort)
		//하기 위해서 자주 수행 - swap
		int n1 = 30;
		int n2 = 20;
		
		//임시변수를 생성해서 임시변수에 값을 넣어두고 하나를 변경하고 다른 하나의 값을 변겅
		int temp = n1;
		n1 = n2 ;
		n2 = temp;
		
		
		System.out.printf("n1:%3d\t n2:%3d\n", n1, n2 );
		
		
	}
}
