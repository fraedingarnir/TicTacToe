package is.hr.TicTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TicTacToeTest {
	
	public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("is.hr.TicTacToe.TicTacToeTest");
    }

	/*
       @Test
    public void testPlayerTurn() {
        TicTacToe.PlayerTurn();
        assertEquals("Player X, your turn", systemOutRule.getLog());
    }
	*/
	/*
	@Test
	public void testEmptyString() {
		assertEquals("Player X, your turn", TicTacToe.PlayerTurn());
	}
	
	@Test
	public void testFunc {
		private static boolean PlayerTurn = false;
		TicTacToe.
		
	}
	*/
	
	private static char[] board;
	board[0] = X;
	board[3] = X;
	board[6] = X;
	
	@Test
	public void Won {
	
		assertEquals(true, TicTacToe.CheckWon());
		
	}
	
}
