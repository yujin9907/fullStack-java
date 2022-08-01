package ex06;

public class SelectionEx01 {

	public static void main(String[] args) {
		
		int[] arr =  { 40, 10, 5, 30, 8 };
		int min = arr[0];
		
		// 1 사이클
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				min=i;
			} else {
				min=i-1;
			}
		}
		System.out.println(min);
		int temp = arr[min];
		arr[0]=arr[min];
		arr[min]=temp;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
