package is.hr.TicTacToe;

import java.util.Scanner;

public class TicTacToe {
	
	private static final char empty = ' ';
	private static final char X = 'x';
	private static final char O = 'o';
	private static boolean isWon = false; //
	private static final int COL = 9;
	private static char[] board;
	private static boolean PlayerTurn = false;
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
		for(int turn = 0; turn < 9; turn++)
		{
			if(!PlayerTurn)
			{
				while(!PlayerTurn)
				{
					printBoard();
					System.out.println("Player X, your turn, pick a value between 1-9");
					int Value = in.nextInt();
					if(0 < Value && Value > 10)
					{
						if(CheckFilled(Value))
							;
						else
						{
							board[Value] = X;
							PlayerTurn = true;
						}

					}
					else
					{
						System.out.println("Value out of range");
					}
				}


			}
			else
			{
				while(PlayerTurn)
				{
					printBoard();
					System.out.println("Player X, your turn, pick a value between 1-9");
					int Value = in.nextInt();
					if(0 < Value && Value > 10)
					{
						if(CheckFilled(Value))
							;
						else
						{
							board[Value] = O;
							PlayerTurn = false;
						}

					}
					else
					{
						System.out.println("Value out of range");
					}
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
			ttt.InitGame();
			ttt.printBoard();
	}

	private static boolean CheckWon()
	{        
		if (board[0] == board[3] && board[3] == board[6] && (board[0] == X || board[0] == O)) 
            return true;
        else if (board[3] == board[4] && board[4] == board[5] && (board[3] == X || board[3] == O))
            return true;
        else if (board[2] == board[5] && board[5] == board[8] && (board[2] == X || board[2] == O)) 
            return true;
        else if (board[0] == board[1] && board[1] == board[2] && (board[0] == X || board[0] == O)) 
            return true;
        else if (board[3] == board[4] && board[4] == board[5] && (board[3] == X || board[3] == O)) 
            return true;
        else if (board[6] == board[7] && board[7] == board[8] && (board[6] == X || board[6] == O)) 
            return true;
        else if (board[0] == board[4] && board[4] == board[8] && (board[0] == X || board[0] == O)) 
            return true;
        else if (board[2] == board[4] && board[4] == board[6] && (board[2] == X || board[2] == O)) 
            return true;
        else 
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

