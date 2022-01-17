package day6;

import java.util.Scanner;
import java.util.Random;

public class OneToFifty {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int[] arr = new int[9];

		for (int j = 0; j < 9; j++) {
			arr[j] = j + 1;
		}

		int i = 0;
		while (i < 1000) {
			int num = ran.nextInt(9);
			int temp = arr[0];
			arr[0] = arr[num];
			arr[num] = temp;
			i++;
		}

		int n = 1;
		{
			while (n < 10) {
				System.out.print("[ ");
				for (i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println("]");
				System.out.println("숫자를 입력하여라.");
				int num = sc.nextInt();
				if (arr[num - 1] == n) {
					arr[num - 1] = 0;
					n++;
				} else {
					System.out.println("숫자를 다시 입력해주세요.");
				}

			}
		}
		System.out.println("모든 인덱스를 맞췄습니다.");
		System.out.println("프로그램 종료");

	}
}
