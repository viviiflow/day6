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
			System.out.println("] 인덱스 위치를 입력하시오");
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
				System.out.println("인덱스 위치를 다시 입력하시오");
			}
		}
		System.out.println("모든 인덱스 위치를 맞췄습니다.");
	}
}
