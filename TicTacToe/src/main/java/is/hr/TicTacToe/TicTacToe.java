package is.hr.TicTacToe;

public class TicTacToe {
	
	private static final char empty = ' ';
	private static final char X = 'x';
	private static final char O = 'o';
	private static int currentState; //
	private static final int COL = 9;
	private static char[] board;
	private static boolean PlayerTurn;

	public TicTacToe()
	{
			board = new char[COL];
	}
	
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

	public void printBoard()
	{
		int line = 0;
		for(int row = 0; row < 3; row++){
			for(int col = line; col < line+3; col++)
				if(col%3 != 0)
					System.out.print(board[col] + " | ");
			if(row != 2)
				System.out.println("\n--|---|--");
			line += 3;
		}

	}
	/*
	public static void main(String[] args) {
			TicTacToe ttt = new TicTacToe();
			ttt.InitGame();
			ttt.printBoard();
	}
		*/
}

