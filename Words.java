package Guess;

import java.util.Random;

public class Words {
	
	private String[] randomWords= {"Yello","Green","Red","Blue","Black","Purpule","info","Ceremony",
									"Beneath","Properties","Students","employee"};
	
	private String selectedWord;
	private Random random=new Random();
	private char[] letters;
	
	public Words() {
		selectedWord=randomWords[random.nextInt(randomWords.length)];
		letters=new char[selectedWord.length()];
	}
	
	public String toString() {
		
		StringBuilder text=new StringBuilder();
		
		//String word="";
		//letters[2]='a';
		
		for(char letter:letters) {
			
			text.append(letter=='\u0000'? '-' : letter);
			
			/*if(letter=='\u0000') {
				text.append('-');
				//word +='-';
			}
			else {
				text.append(letter);
				//word +=letter;
			}*/
			text.append(' ');
		}
		
		return text.toString();
	}

	/*public void guess(char letter) {
		// TODO Auto-generated method stub
		
		
	}*/
	
	public boolean isGuessedRight() {
		
		for(char letter:letters) {
			if(letter=='\u0000') {
				return false;
			}
		}
		return true;
	}

	public boolean guess(char letter) {
		// TODO Auto-generated method stub
		
		boolean guessedRight=false;
		
		for (int i=0; i<selectedWord.length();i++)
		{
			if(letter==selectedWord.charAt(i)) {
				letters[i]=letter;
				guessedRight=true;
			}
		}
		return guessedRight;
		
	}
}
