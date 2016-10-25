package TicTacToe;

public class TicTacToe {
	
	public static final int ROWS = 3, COLS = 3;    
	public static int[][] board = new int[ROWS][COLS];
	
	public void InitGame()
	{
    	for (int row = 0; row < ROWS; ++row) 
		{
    		for (int col = 0; col < COLS; ++col) 
			{
    				board[row][col] = 0;  
    		}
		}
		//tjekka hvort þetta virki
	}
}
