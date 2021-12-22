package lecture;

public class ArrayExample {
//배열
	public static void main(String[] args) {
		int arr[] = new int[10];// 배열 만드는 법 []는 앞이나 뒤나 상관 없다 뒤에가서는 ArrayList를 더 쓰게 될 것
		// 미리 정해두면 그 이상은 쓸 수가 없다
		arr[0] = 10;
		arr[1] = 15;
		arr[2] = 17;
		arr[3] = 32;
		arr[4] = 80;
		System.out.println(arr[5]);// 0~9까지만 쓸 수 있다
		int arr02[] = { 1, 2, 3, 100, 5, 4, 50 };// 갯수를 자유롭게 쓸 수 있다{}안에 정수만 써서 사용 가능
		System.out.println(arr02[3]);
//	int arr03[10]; // 이러한 것은 없다
	}
//정수 5개를 입력 받아서 배열로 만들어 보기
	//세번째꺼 출력하기
}
