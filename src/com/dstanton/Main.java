package com.dstanton;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 5000;
	    int levelCompleted = 5;
	    int bonus = 100;

//	    if (score == 5000) {
//            System.out.println("Your score was 5000");
//        }

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}

		score = 10000;
		levelCompleted = 8;
		bonus = 200;

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your 2nd final score was " + finalScore);
		}

		//This commented added to code on 3/1/2021 @ 1603 PST from Dan's T420
		//This commented added to code on 3/1/2020 @ 1657 PST from Dan's MacBook Air 11"

	}
}
