package is.hr.TicTacToe
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