package day6;
import java.util.Scanner;
public class baseball {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int[] com= {1,7,3};
	int[] me= new int[3];
	int strike=0, ball=0;
	
	while(true) {
		System.out.print("com= ");
		for (int i = 0; i < com.length; i++) {
			System.out.print(com[i] + " ");
		}
		System.out.println("");
		
		System.out.print("me= ");
		for (int i = 0; i < me.length; i++) {
			System.out.print(me[i] + " ");
		}
		System.out.println("");
		System.out.println(strike+" strike");
		System.out.println(ball+" ball");
		
		System.out.print("[1]1~9 입력: ");
		int num1=sc.nextInt();
		
		int num2=0;
		do {
			System.out.print("[2]1~9 입력: ");
			num2=sc.nextInt();
			if(num1==num2) {
				System.out.println("중복된 숫자 입니다.");
			}
		}  while(num1==num2);
		
		
		int num3=0;
		do {
			System.out.print("[3]1~9 입력: ");
			num3=sc.nextInt();
			if((num1==num3)||(num2==num3)) {
				System.out.println("중복된 숫자 입니다.");
			}
		}  while((num1==num3)||(num2==num3));
		
		me[0]=num1;
		me[1]=num2;
		me[2]=num3;
		
		strike=0;
		ball=0;
		for(int s=0; s<3; s++) {
			if(com[s]==me[s]) {
				strike++;
			}
			for(int b=0; b<3; b++) {
				if((com[s]==me[b])&&(com[s]!=me[s])) {
					ball++;
				}
			}
		}
		
		if(strike==3) {
			break;
		}		
	}
	System.out.println("성공!");
}
}
