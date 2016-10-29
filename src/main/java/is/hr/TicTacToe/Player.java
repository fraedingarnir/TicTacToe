package is.hr.TicTacToe;

import java.util.Scanner;

public class Player {
	
	//private static Scanner in;
	public final char symbol;
	
	public Player(char symbol)
	{
		this.symbol = symbol;
		//in = new Scanner(System.in);
	}
	/*
	public int addPlay()
	{
		int val;
				
		return val;
	}
	*/
	public static String playerMsg(char symbol)
	{
		return ("Player " + symbol + " your turn, pick a value between 1-9");
	}
}
