package ex06;

public class BubbleEx01 {

	public static void main(String[] args) {

		int[] arr = { 40, 10, 5, 30, 8 };

		// 버블 정렬

		// 1번째 사이클
		if (arr[0] > arr[1]) {
			int temp;
			temp = arr[0]; // 먼저 데이터 값을 저장, 바꾸기 위해
			arr[0] = arr[1];
			arr[1] = temp; // 스와프 라고 함
		}
		if (arr[1] > arr[2]) {
			int temp;
			temp = arr[1];
			arr[1] = arr[2];
			arr[2] = temp;
		}
		if (arr[2] > arr[3]) {
			int temp;
			temp = arr[2];
			arr[2] = arr[3];
			arr[3] = temp;
		}
		if (arr[3] > arr[4]) {
			int temp;
			temp = arr[3];
			arr[3] = arr[4];
			arr[4] = temp;
		}

		System.out.println("첫번째 사이클");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");

		// 2번째 사이클
		if (arr[0] > arr[1]) {
			int temp;
			temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}
		if (arr[1] > arr[2]) {
			int temp;
			temp = arr[1];
			arr[1] = arr[2];
			arr[2] = temp;
		}
		if (arr[2] > arr[3]) {
			int temp;
			temp = arr[2];
			arr[2] = arr[3];
			arr[3] = temp;
		}

		System.out.println("두번째 사이클");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");

		// 3번째 사이클
		if (arr[0] > arr[1]) {
			int temp;
			temp = arr[0]; 
			arr[0] = arr[1];
			arr[1] = temp; 
		}
		if (arr[1] > arr[2]) {
			int temp;
			temp = arr[1];
			arr[1] = arr[2];
			arr[2] = temp;
		}
		System.out.println("세번째 사이클");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		// 4번째 사이클
		if (arr[0] > arr[1]) {
			int temp;
			temp = arr[0]; 
			arr[0] = arr[1];
			arr[1] = temp;
		}
	
		System.out.println("네번째 사이클");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");

	}

}
