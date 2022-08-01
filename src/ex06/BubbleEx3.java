package ex06;

public class BubbleEx3 {

	public static void main(String[] args) {

		// 하나 더 추가됨
		int[] arr = { 40, 10, 5, 30, 8, 51, 100, 200};

		// 버블 정렬

		// n번째 사이클
		for (int j = arr.length-1; j > 1; j--) {
			for (int i = 0; i < j; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp;
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			System.out.println(j + "번째 사이클");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("");
		}

	}

}
