package day6;

import java.util.Scanner;

public class maxnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 11, 87, 42, 100, 24 };
		int check = 0, idx=0;
		int c = 0;

		while (c < 5) {
			System.out.print("[ ");
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println("]");
			System.out.println("최댓값을 입력하시오");
			int num = sc.nextInt();

			for (int i = 0; i < arr.length; i++) {
				if (check < arr[i]) {
					check = arr[i];
					idx=i;
				}
			}
			if(num==check) {
				arr[idx]=0;
				check=0;
				c++;
			}
			else {
				System.out.println("최댓값을 다시 입력하시오");
			}

		}
		System.out.println("프로그램 종료");

	}
}
