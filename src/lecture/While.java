package lecture;

import java.util.Scanner;

public class While {
	//순서가 없을때 많이 사용
		public static void main(String[] args) {
			int num=10;
			int i = 0;
			int sum = 0;
			//정수를 여러개 입력받아서 평균을 구하라. -1을 입력하면 종료된다.
			Scanner scanner = new Scanner(System.in);
			System.out.println("점수를 입력하시오. 마지막에 -1을 입력하면 평균을 보여드립니다.");
			num = scanner.nextInt();
			while(num!=-1) {
				System.out.println("나는 -1을 입력받을때까지 계속 일을 수행하는 while입니다.");
				sum+=num;
				i++;
				num = scanner.nextInt();
//			while(i<10) {
//				System.out.println("나는 10보다 작을때까지 뭔가를 수행하는 while 입니다");
//			i++;
			}
			System.out.println("당신은 "+i+"개 입력하였고 평균은 "+sum/i+"입니다");
			scanner.close();
		}

	

	//public static void main(String[] args) {
//		int num=10;
//		int i = 0;
//		int sum = 0;
//		//정수를 여러개 입력받아서 평균을 구하라. -1을 입력하면 종료된다.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("점수를 입력하시오. 마지막에 -1을 입력하면 평균을 보여드립니다.");
//		num = scanner.nextInt();
//		while(true) {
//			System.out.println("나는 -1을 입력받을때까지 계속 일을 수행하는 while입니다.");
//			sum+=num;
//			if(num==-1)break;
//			i++;
//			num = scanner.nextInt();
////		while(i<10) {
////			System.out.println("나는 10보다 작을때까지 뭔가를 수행하는 while 입니다");
////		i++;
//		}
//		System.out.println("당신은 "+i+"개 입력하였고 평균은 "+sum/i+"입니다");
//		scanner.close();
}
