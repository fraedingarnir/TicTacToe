package is.hr.TicTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BoardTest{
	
	@Test
	public void testPlay5() {
		Board b = new Board();
		assertEquals(true, b.addPlay(5, 'X'));
	}

	@Test
	public void testPlay5Again() {
		Board b = new Board();
		b.addPlay(5, 'X');
		assertEquals(false, b.addPlay(5, 'X'));
	}

	@Test
	public void testPlayOoutOfBoundsAbove() {
		Board b = new Board();
		assertEquals(false, b.addPlay(10, 'X'));
	}


	@Test
	public void testPlayOoutOfBoundsBelow() {
		Board b = new Board();
		assertEquals(false, b.addPlay(0, 'X'));
	}				
}
