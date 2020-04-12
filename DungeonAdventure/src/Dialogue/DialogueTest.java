package Dialogue;
import java.lang.reflect.Array;
import java.util.Scanner;

public class DialogueTest {
	
	int lastChoice = 0;
	
	public int getLastChoice() {
		return lastChoice;
	}
	
	public void setLastChoice(int choice) {
		lastChoice = choice;
	}
	
	public static void slowText(String dialogue, int speed) throws InterruptedException {
		char[] chars = dialogue.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
			Thread.sleep(speed);
		}
		System.out.print('\n');
	}
	
	public static int playerChoice(String choiceMessage) {
		Scanner scan = new Scanner(System.in);
		System.out.print(choiceMessage);
		int choice = scan.nextInt();
		return choice;
	}
	
	public static void responseToPlayerChoice(String choiceMessage, String[] responses) throws InterruptedException {
		int input = playerChoice(choiceMessage);
		slowText(responses[input - 1], 50);
	}
	
	public static int getResponseToPlayerChoice(String choiceMessage, String[] responses) throws InterruptedException {
		int input = playerChoice(choiceMessage);
		slowText(responses[input - 1], 50);
		return input;
	}
	

} //End of program

