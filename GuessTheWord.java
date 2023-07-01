package Guess;
import java.util.Scanner;

public class GuessTheWord {
	
	private boolean play=true;
	private Words randomWord=new Words();
	private Scanner scanner=new Scanner(System.in);
	private int rounds=10;
	private char lastRound;
	
	
	public void start() {
		
		do {	
			showWord();
			getInput();
			checkInput();	
		}while(play);
	}
	
	void showWord() {
		System.out.println("You have wrong guess try again"  +rounds+  "tries left");
		System.out.println(randomWord);
	}
	void getInput() {
		//System.out.println("getInput");
		System.out.println("Enter a letter to guess the word");
		String userGuess=scanner.nextLine();
		//char letter;
		//randomWords.guess(letter);
		//randomWord.guess(userGuess.charAt(0));
		lastRound =userGuess.charAt(0);
	}
	void checkInput() {
		//System.out.println("checkInput");
		boolean isGuessedRight = randomWord.guess(lastRound);
		
		if(isGuessedRight) {
			if(randomWord.isGuessedRight()) {
			System.out.println("Congrats!!, you won!");
			System.out.println("The word is: "+randomWord);
			play=false;
		}
	}
		else {
			rounds--;
			
			if(rounds == 0) {
				System.out.println("Oh No....Game Over!!");
				play=false;
			}
		}
}		
	
	public void end() {
		
		scanner.close();
	}

}
