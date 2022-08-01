package ex06;

public class BubbleEx2 {

	public static void main(String[] args) {

		// 하나 더 추가됨
		int[] arr = { 40, 10, 5, 30, 8, 50 };

		// 버블 정렬

		// 1번째 사이클
		for (int i = 0; i < 5; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp;
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}

		System.out.println("첫번째 사이클");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");

		// 2번째 사이클
		for (int i = 0; i < 4; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp;
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}

		System.out.println("두번째 사이클");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");

		// 3번째 사이클
		for (int i = 0; i < 3; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp;
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}

		System.out.println("세번째 사이클");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");

		// 4번째 사이클
		for (int i = 0; i < 3; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp;
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}

		System.out.println("네번째 사이클");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");

		// 5번째 사이클
		for (int i = 0; i < 2; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp;
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}

		System.out.println("다섯번째 사이클");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");

	}

}
