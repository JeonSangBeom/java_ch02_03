package lecture;

public class Lecture01 {
	public static void main(String[] args) {
		//System.out.println("Hello World");
		//int num = 10;, double = 10.0; , char = 'a' , boolean, String ="sdfsd
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum = sum + i; // 1,3
			System.out.println(i);
			if(i==10) {
				System.out.println("=");
			}else {
				System.out.println("+");
			}
		}
		System.out.println(sum);
	}

}

