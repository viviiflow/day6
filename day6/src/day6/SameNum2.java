package day6;
import java.util.Random;
public class SameNum2 {
public static void main(String[] args) {
	Random ran = new Random();
	int[] check = new int[5];
	int[] arr=new int[5];
	
	for(int i=0; i<5;) {
		check[i]=ran.nextInt(9)+1;
		for(int j=0; j<5; j++) {
			if(check[i]!=arr[j]) {
				arr[j]=check[i];
				i++;
			}
			
		}
		
	}
	
	for(int i=0; i<5;) {
	System.out.println(arr[i]+" ");
	}
	
}
}
