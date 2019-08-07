package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );
		int i = 50000;
		int sw = 0 ;
		int cnt;
		System.out.print( "금액: " );
		int money = scanner.nextInt();
		
		for(int j=0 ; j<10;j++)
		{
			cnt=money/i;
			System.out.println(i+"원 : "+cnt+"개");
			money = money-(cnt*i);
			if(sw==0) {
				i=i/5;
				sw=1;
			}else {
				i=i/2;
				sw=0;
			}
		}
	
		scanner.close();
 	}
}