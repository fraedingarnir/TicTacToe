package is.hr.TicTacToe;
<<<<<<< HEAD

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
=======
public class Board {
	
	private static char[] board;
	
	private Player player1;
	private Player player2;
	
	public Board(Player player1, Player player2)
	{
		this.player1 = player1;
		this.player2 = player2;
		board = new char[9];
	}
	
	public void init()
	{
        for (int col = 49; col < 49+ 9; ++col)
        {
        	board[col-49] = (char) col;
        }
	}
}
>>>>>>> 1ecb8e6d73c5c610c57cc2b26a542742808d8327
