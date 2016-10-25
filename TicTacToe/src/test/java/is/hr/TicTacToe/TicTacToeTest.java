package is.hr.TicTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TicTacToeTest {
	
	public static void main(String args[]) {
    org.junit.runner.JUnitCore.main("is.hr.TicTacToe.TicTacToeTest");
    }
	
	@Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void testPlayerTurn() {
        TicTacToe.PlayerTurn();
        assertEquals("Player X, your turn", systemOutRule.getLog());
    }
	
	/*
	@Test
	public void testEmptyString() {
		assertEquals("Player X, your turn", TicTacToe.PlayerTurn());
	}
	*/
	
}
