package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner( System.in );
		while(true) {
			//random 
			Random r= new Random();
			int k = r.nextInt(100)+1;
			int min=1;
			int max=100;
			//k==number까지만 반복

			System.out.println("수를 결정하였습니다. 맞추어보세요.");

			for(int i = 1; true; i++) {

				System.out.println(min+"-"+max);

				//사용자가 입력하는 숫자를 변수에 담아야겠다
				System.out.print(i+">>");
				int number = scanner.nextInt();
				//k랑 number를 비교한다
				// k가 number보다 클 경우 더 높게 출력
				if(k>number) {
					System.out.println("더 높게");
					if(min<number) {
						min=number;
					}
				} else if(k<number) {
					//				k가 number보다 작을 경우 더 낮게 출력
					System.out.println("더 낮게");
					if(max>number) {
						max=number;
					}
				} else if(k==number) {
					//				k가 number와 같을 경우 맞았습니다. 출력
					System.out.println("맞았습니다.");
					break;
				}
			}

			// 다시 하시겠습니까? 출력
			System.out.print("다시하시겠습니까 (y/n)>>");
			String answer = scanner.next();
			if(answer.charAt(0) == 'n') {
				break;
			}
		}
		scanner.close();
	}

}