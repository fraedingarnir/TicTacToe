package is.hr.TicTacToe;

public class TicTacToe {
	
	private static final char empty = ' ';
	private static final char X = 'x';
	private static final char O = 'o';
	private static int currentState; //
	private static final int COL = 9;
	private static char[] board = new char[COL];
	private static boolean PlayerTurn;
	
	public void InitGame()
	{
    	for (int col = 0; col < COL; ++col) 
		{
    		board[col] = empty;
		}
		PlayerTurn = false;
	}

	public void PlayerTurn()
	{
		for(int turn = 0; turn < 9; turn++)
		{
			if(PlayerTurn == 0)
			{
				System.out.println("Player X, your turn");
			}
			if(PlayerTurn == 1)
			{
				System.out.println("Player X, your turn");
			}
		}
	}
}
