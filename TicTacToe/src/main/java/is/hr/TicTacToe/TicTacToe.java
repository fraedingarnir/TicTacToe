package is.hr.TicTacToe;

public class TicTacToe {
	
	private static final char empty = ' ';
	private static final char X = 'x';
	private static final char O = 'o';
	private static boolean isWon = false; //
	private static final int COL = 9;
	private static char[] board = new char[COL];
	private static boolean PlayerTurn = false;
	
	public static void InitGame()
	{
    	for (int col = 0; col < COL; ++col) 
		{
    		board[col] = empty;
		}
	}

	public static void PlayerTurn()
	{
		for(int turn = 0; turn < 9; turn++)
		{
			if(!PlayerTurn)
			{
				System.out.println("Player X, your turn");
			}
			else
			{
				System.out.println("Player O, your turn");
			}
		}
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
}
