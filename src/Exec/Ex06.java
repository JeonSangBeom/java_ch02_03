package Exec;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int unit[]= {50000,10000,1000,100,10,1};
		
		System.out.println("금액을 입력하시오>>");
		int money=scanner.nextInt();
		
		for(int i=0;i<unit.length;i++) {
			System.out.println(unit[i]+"원 짜리 :"+money/unit[i]+"원 ");
			money-=(money/unit[i])*unit[i]; //남은 돈 계산식
		}
		
	}

}
