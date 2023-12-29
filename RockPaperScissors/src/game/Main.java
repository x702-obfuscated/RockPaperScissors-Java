package game;

import java.util.Random;
import java.util.Scanner;

public class Main {
	private static final int SLEEP_TIME = 500;
	private static Scanner scanner = new Scanner(System.in);
	private static String[] rps = {"r", "p","s"};
	
	public static void main(String[] args) {
		
		
		String computerMove = rps[new Random().nextInt(rps.length)];
		System.out.println(checkWinner(acceptPlayerInput(),computerMove));
		playAgain();
		
	}
	
	public static String acceptPlayerInput() {
		String playerMove = "";
		while(true) {
			System.out.println("Please enter your move (r, p, or s)");
			playerMove = scanner.nextLine();
			
			if(playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
				break;
			}
			System.out.println(playerMove + " is not a valid move.");
		}
		return playerMove;
	}
	
	
	public static String checkWinner(String player, String computer) {
		try {
			System.out.println("ROCK...");
			Thread.sleep(SLEEP_TIME);
			System.out.println("PAPER...");
			Thread.sleep(SLEEP_TIME);
			System.out.println("SCISSORS...");
			Thread.sleep(SLEEP_TIME);
			System.out.println("SHOOT!!!");
			Thread.sleep(SLEEP_TIME);
			
			System.out.println("Computer played: " + computer);
			Thread.sleep(SLEEP_TIME);
			System.out.println("You played: " + player);
			Thread.sleep(SLEEP_TIME);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		String win = "You win!";
		String lose = "You lose!";
		if(player.equals(computer)) {
			return("The result is a tie!");	
		}
		else if(player.equals("r")) {
			if(computer.equals("p")) {
				return lose;
			}
			else if(computer.equals("s")) {
				return win;
			}
		}
		else if(player.equals("p")) {
			if(computer.equals("s")) {
				return lose;
			}
			else if(computer.equals("r")) {
				return win;
			}
		}
		else if(player.equals("s")) {
			if(computer.equals("r")){
				return lose;
			}
			else if(computer.equals("p")) {
				return win;
			
			}	
		}
		return "Something went wrong...";
	}
	
	public static void playAgain() {
		String input = "";
		while(true) {
			System.out.println("Play again? (y/n)");
			input = scanner.nextLine();
			if(input.equals("y") || input.equals("n")) {
				break;
			}
			System.out.println(input + " is not valid input.");
		}
		if(input.equals("y")) {
			main(null);
		}
	}
	

}
