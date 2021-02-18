package book.ch4;

import java.util.Random;
import java.util.Scanner;

class RandomGame {
	int solve;
	int guess;
	int judge;
	
	public void startGame() {
		
		Random r = new Random();
		this.solve = r.nextInt(10);
		System.out.println("이것은 1~10 사이의 수입니다.");
		this.judge = this.repeat();
		howYouAre(judge);
	}
		
	public int repeat() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			System.out.print("숫자를 맞춰보세요: ");
			this.guess = sc.nextInt();
			
			if(guess > solve) {
				System.out.println(guess+"보다 작은 수 입니다.");
			} else if(guess < solve){
				System.out.println(guess + "보다 큰 수 입니다.");
			} else {				
				return 0;
			}
		}
		return -1;
	}
	
	public void howYouAre(int judge) {
		if(judge == 0) {
			System.out.println("정답");
		} else {
			System.out.println("Stupid!");
		}
	}
}

public class RandomGame1_3 {
	
	public static void main(String[] args) {
		RandomGame rg = new RandomGame();
		rg.startGame();
	
	}
}
