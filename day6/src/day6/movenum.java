package day6;

import java.util.Scanner;

public class movenum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] game = { 0, 0, 1, 0, 2, 0, 0, 1, 0 };
		int idx = 0;

		while (true) {
			for (int i = 0; i < 9; i++) {
				if (game[i] == 0) {
					System.out.print("0 ");
				} else if (game[i] == 1) {
					System.out.print("�� ");
				} else if (game[i] == 2) {
					System.out.print("�� ");
				}
			}
			System.out.println("");
			System.out.println("[1]���� [2]������");
			int num = sc.nextInt();

			if (num == 1) {
				for (int i = 0; i < game.length; i++) {
					if (game[i] == 2) {
						idx = i;
					}
				}
				if(idx==0) {
					break;
				}
				if (game[idx - 1] == 1) {
					System.out.println("���� ���� ������ �� �����ϴ�.");
					System.out.println("�� �μ��� -> 3");
				} else {
					game[idx] = 0;
					game[idx - 1] = 2;
				}
			}

			if (num == 2) {
				for (int i = 0; i < game.length; i++) {
					if (game[i] == 2) {
						idx = i;
					}
				}
				if(idx==8) {
					break;
				}
				if (game[idx + 1] == 1) {
					System.out.println("���� ���� ������ �� �����ϴ�.");
					System.out.println("�� �μ��� -> 3");
				} else {
					game[idx] = 0;
					game[idx + 1] = 2;
				}
			}

			if (num == 3) {
				if (game[idx - 1] == 1) {
					game[idx - 1] = 0;
				} else if (game[idx + 1] == 1) {
					game[idx + 1] = 0;
				}
			}
			
		}
		System.out.println("���� �����Ͽ����ϴ�.");
		
	}
}
