package is.hr.TicTacToe;

import java.util.Scanner;

public class TicTacToe {
	
	private static final char X = 'x';
	private static final char O = 'o';
	private static boolean isWon = false; //
	private static final int COL = 9;
	private static char[] board;
	private static boolean PlayerTurn = false; //false for X and true for O
	private static Scanner in;

	public TicTacToe()
	{
			board = new char[COL];
			in = new Scanner(System.in);	
	}
	
	public void InitGame()
	{
    		for (int col = 49; col < 49+COL; ++col) 
		{
    			board[col-49] = (char) col;
		}
	}

	public static void PlayerTurn()
	{
		char playerSymbol;
		
		for(int turn = 0; turn < 9; turn++)
		{
			boolean played = false;
			if(!PlayerTurn)
			{
				playerSymbol = X;
			}
			else 
				playerSymbol = O;
			
			printBoard();
			while(!played)
			{
				System.out.println("\nPlayer " + playerSymbol + ", your turn, pick a value between 1-9");
				int Value = in.nextInt();
				Value--;
				if(0 <= Value && Value < 9)
				{

					if(CheckFilled(Value))
						System.out.println("This square has already been played, select another");
					else
					{
						board[Value] = playerSymbol;
						if(CheckWon())
						{
							System.out.println("Congratulations " + playerSymbol + ", you won!");
							isWon = true;
							return;
						}
						PlayerTurn = !PlayerTurn ;
						played = true;
					}
					
				}
				else
				{
					System.out.println("Value out of range");
				}
			}


			
			
		}
	}

	public static void printBoard()
	{
		int line = 0;
		for(int row = 0; row < 3; row++){
			for(int col = line; col < line+3; col++)
			{
				System.out.print(" " + board[col]);
				if(col != 2 && col != 5 && col != 8 || col == 0)
					System.out.print(" |");
			}
			
			if(row != 2)
				System.out.println("\n---|---|---");
			line += 3;
		}

	}
	
	public static void main(String[] args) {
			TicTacToe ttt = new TicTacToe();
			char Play = 'Y';
			while(Play == 'Y' || Play == 'y')
			{
				ttt.InitGame();
				ttt.PlayerTurn();
				if(!isWon)
				{
					System.out.println("It's a tie!");
				}
				Play = 'n';
				//System.out.println("Another game? (Y/N)");
				//Play = Character.to(in.nextLine())[0];
			}
			

	}

	private static boolean CheckWon()
	{        
		for(int i = 0; i <= 6; i += 3){
	        if(board[i] == board[i+1] && board[i+1] == board[i+2]){
	            return true;
	        }
	    }
		
		for(int i = 0; i <= 2; i++){
	        if(board[i] == board[i+3] && board[i+3] == board[i+6]){
	            return true;
	        }
	    }
		
		return false;
	}

	private static boolean CheckFilled(int num)
	{
		if(board[num] == X || board[num] == O)
			return true;
		else
			return false;
	}
}

