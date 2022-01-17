package day6;

import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] game = new int[9];
		int turn = 1;
		int win = 0;

		while (true) {
			for (int i = 0; i < 3; i++) {
				System.out.print("[");
				if (game[i] == 0) {
					System.out.print(" ");
				} else if (game[i] == 1) {
					System.out.print("O");
				} else {
					System.out.print("X");
				}
				System.out.print("]");
			}
			System.out.println("");
			for (int i = 3; i < 6; i++) {
				System.out.print("[");
				if (game[i] == 0) {
					System.out.print(" ");
				} else if (game[i] == 1) {
					System.out.print("O");
				} else {
					System.out.print("X");
				}
				System.out.print("]");
			}
			System.out.println("");
			for (int i = 6; i < 9; i++) {
				System.out.print("[");
				if (game[i] == 0) {
					System.out.print(" ");
				} else if (game[i] == 1) {
					System.out.print("O");
				} else {
					System.out.print("X");
				}
				System.out.print("]");
			}
			System.out.println("");

			for (int j = 0; j < 7; j += 3) {
				if ((game[j] == 1) && (game[j + 1] == 1) && (game[j + 2] == 1)) {
					win = 1;
				} else if ((game[j] == 2) && (game[j + 1] == 2) && (game[j + 2] == 2)) {
					win = 2;
				}
			}

			for (int j = 0; j < 3; j++) {
				if ((game[j] == 1) && (game[j + 3] == 1) && (game[j + 6] == 1)) {
					win = 1;
				} else if ((game[j] == 2) && (game[j + 3] == 2) && (game[j + 6] == 2)) {
					win = 2;
				}
			}

			if ((game[0] == 1) && (game[4] == 1) && (game[8] == 1)) {
				win = 1;
			} else if ((game[0] == 2) && (game[4] == 2) && (game[8] == 2)) {
				win = 2;
			}

			if ((game[2] == 1) && (game[4] == 1) && (game[6] == 1)) {
				win = 1;
			} else if ((game[2] == 2) && (game[4] == 2) && (game[6] == 2)) {
				win = 2;
			}

			if (win == 1) {
				System.out.println("p1 승리");
				break;
			} else if (win == 2) {
				System.out.println("p2 승리");
				break;
			}

			if (turn % 2 != 0) {
				System.out.print("[p1]인덱스 입력:");
				int idx1 = sc.nextInt();
				if (game[idx1] != 0) {
					System.out.println("다른 숫자를 입력해주세요.");
				} else {
					game[idx1] = 1;
					turn++;
				}

				continue;

			}
			if (turn % 2 == 0) {
				System.out.print("[p2]인덱스 입력:");
				int idx2 = sc.nextInt();
				if (game[idx2] != 0) {
					System.out.println("다른 숫자를 입력해주세요.");
				} else {
					game[idx2] = 2;
					turn++;
				}
				continue;
			}
		}

	}
}
