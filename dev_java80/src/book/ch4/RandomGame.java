package book.ch4;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int solve = r.nextInt(10)+1;
		int guess = 0;
		System.out.println("이것은 1~10 사이의 수입니다.");
		for(int i = 0; i < 5; i++) {
			System.out.print("숫자를 맞춰보세요: ");
			
			guess = sc.nextInt();
			
			if(guess > solve) {
				System.out.println(guess+"보다 작은 수 입니다.");
			} else if(guess < solve){
				System.out.println(guess + "보다 큰 수 입니다.");
			} else {
				System.out.println("정답입니다!");
				break;
			}
		}
	}

}
