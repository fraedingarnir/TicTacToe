package is.hr.TicTacToe;

public class Board {
	private static char[] board;

	public Board()
	{
		board = new char[9];
		init();
	}

	private void init()
	{
        	for (int col = 49; col < 49+ 9; ++col)
        	{
        		board[col-49] = (char) col;
        	}
	}

	public boolean addPlay(int input, char symbol)
	{
		if(input < 1 || input > 9)
			return false;
		if(board[input-1] !=  (char)(input+48))
			return false;

		board[input-1] = symbol;
		return true;
	}
}
