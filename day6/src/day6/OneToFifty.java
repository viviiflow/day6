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
				System.out.println("���ڸ� �Է��Ͽ���.");
				int num = sc.nextInt();
				if (arr[num - 1] == n) {
					arr[num - 1] = 0;
					n++;
				} else {
					System.out.println("���ڸ� �ٽ� �Է����ּ���.");
				}

			}
		}
		System.out.println("��� �ε����� ������ϴ�.");
		System.out.println("���α׷� ����");

	}
}
