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

	public boolean hasWon()
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

        if(board[0] == board[4] && board[4] == board[8])
        	return true;
        if(board[2] == board[4] && board[4] == board[6])
        	return true;

        return false;
	}

	public char getSquareElement(int n) {
		return board[n];
	}
}
