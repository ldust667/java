import java.util.Random;

import javax.swing.JOptionPane;

public class guess {

	String[] words={"one","two","three"};
	Random myRandomNumber=new Random();
	
		int firstRandom=myRandomNumber.nextInt(words.length);
	
	
	String input= JOptionPane.showInputDialog("What is your guess?");
	
	if(input.equals(words[firstRandom])){
	System.out.print("Great job");
	}
	
	//System.out.print("word is: "+words[firstRandom]);
	
	StringBuilder guessedWord= new StringBuilder("---");
	//guessedWord.setCharAt(2,'X');
}
