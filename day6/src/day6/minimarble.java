package day6;

import java.util.Scanner;

public class minimarble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] p1 = { 1, 0, 0, 0, 0, 0, 0, 0 };
		int[] p2 = { 2, 0, 0, 0, 0, 0, 0, 0 };
		int t1 = 0, pn1 = 0, t2 = 0, pn2 = 0, turn = 1;

		while (true) {
			System.out.print("[");
			for (int i = 0; i < p1.length; i++) {
				System.out.print(p1[i] + " ");
			}
			System.out.println("]");
			System.out.println("p1은 " + t1 + "바퀴째 입니다.");

			System.out.print("[");
			for (int i = 0; i < p2.length; i++) {
				System.out.print(p2[i] + " ");
			}
			System.out.println("]");
			System.out.println("p2은 " + t2 + "바퀴째 입니다.");

			if (turn % 2 != 0) {
				System.out.print("[p1] 1~3 입력:");
				int n1 = sc.nextInt();
				if ((n1 > 3) || (n1 < 0)) {
					System.out.println("1~3 사이의 수를 입력해주세요.");
					System.out.println("");
					continue;
				}
				pn1 += n1;

				if ((pn1 / 8) == 1) {
					t1++;
					pn1 %= 8;
				}
				if (t1 == 3) {
					System.out.println("p1이 이겼습니다.");
					break;
				}

				for (int j = 0; j < p1.length; j++) {
					p1[j] = 0;
				}
				p1[pn1] = 1;

				if (p2[pn1] != 0) {
					System.out.println("p1가 p2를 잡았다.");
					p2[pn2]=0;
					pn2 = 0;
					p2[0] = 2;
					System.out.println("");
				} else {
					System.out.println("");
				}

				turn++;
				continue;

			}

			if (turn % 2 == 0) {
				System.out.print("[p2] 1~3 입력:");
				int n2 = sc.nextInt();
				if ((n2 > 3) || (n2 < 0)) {
					System.out.println("1~3 사이의 수를 입력해주세요.");
					System.out.println("");
					continue;
				}
				pn2 += n2;

				if ((pn2 / 8) != 0) {
					t2++;
					pn2 %= 8;
				}
				if (t2 == 3) {
					System.out.println("p2이 이겼습니다.");
					break;
				}

				for (int j = 0; j < p2.length; j++) {
					p2[j] = 0;
				}
				p2[pn2] = 2;

				if (p1[pn2] == 1) {
					System.out.println("p2가 p1를 잡았다.");
					p1[pn1]=0;
					pn1 = 0;
					p1[0] = 1;
					System.out.println("");
				} else {
					System.out.println("");
				}

				turn++;
				continue;

			}
		}
	}

}
