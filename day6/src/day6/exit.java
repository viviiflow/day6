package day6;

import java.util.Scanner;

public class exit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int exit = 10;
		int[] game = { 11, 15, 10, 14, 12, 13 };
		int idx = 0;

		while (exit <= 15) {
			System.out.println("exit=" + exit);
			System.out.print("[ ");
			for (int i = 0; i < game.length; i++) {
				System.out.print(game[i] + " ");
			}
			System.out.println("] �ε��� ��ġ�� �Է��Ͻÿ�");
			int num = sc.nextInt();

			for (int j = 0; j < game.length; j++) {
				if (exit == game[j]) {
					idx = j;
				}
			}
			
			if(exit==game[num]) {
				game[idx]=0;
				exit++;
			}
			else {
				System.out.println("�ε��� ��ġ�� �ٽ� �Է��Ͻÿ�");
			}
		}
		System.out.println("��� �ε��� ��ġ�� ������ϴ�.");
	}
}
