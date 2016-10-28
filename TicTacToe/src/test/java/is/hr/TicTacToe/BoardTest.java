package is.hr.TicTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BoardTest{
	
	@Test
	public void testPlay5() 
	{
		Board b = new Board();
		assertEquals(true, b.addPlay(5, 'X'));
	}

	@Test
	public void testPlay9() 
	{
		Board b = new Board();
		assertEquals(true, b.addPlay(9, 'X'));
	}

	@Test
	public void testPlay5Again() 
	{
		Board b = new Board();
		b.addPlay(5, 'X');
		assertEquals(false, b.addPlay(5, 'X'));
	}

	@Test
	public void testPlayOoutOfBoundsAbove() 
	{
		Board b = new Board();
		assertEquals(false, b.addPlay(10, 'X'));
	}


	@Test
	public void testPlayOoutOfBoundsBelow() 
	{
		Board b = new Board();
		assertEquals(false, b.addPlay(0, 'X'));
	}	

	@Test
	public void testWinHorizontalFirst()
	{
		Board b = new Board();
		for(int i = 1; i <= 3; i++)
		{
			b.addPlay(i, 'X');
		}
		assertEquals(true, b.hasWon());
	}		

	@Test
	public void testWinHorizontalMiddle()
	{
		Board b = new Board();
		for(int i = 4; i <= 6; i++)
		{
			b.addPlay(i, 'O');
		}
		assertEquals(true, b.hasWon());
	}

	@Test
	public void testWinHorizontalLast()
	{
		Board b = new Board();
		for(int i = 7; i <= 9; i++)
		{
			b.addPlay(i, 'X');
		}
		assertEquals(true, b.hasWon());
	}		

	@Test
	public void testWinVerticalFirst()
	{
		Board b = new Board();
		for(int i = 1; i <= 7; i += 3)
		{
			b.addPlay(i, 'X');
		}
		assertEquals(true, b.hasWon());
	}	

	@Test
	public void testWinVerticalMiddle()
	{
		Board b = new Board();
		for(int i = 2; i <= 8; i += 3)
		{
			b.addPlay(i, 'O');
		}
		assertEquals(true, b.hasWon());
	}

	@Test
	public void testWinVerticalLast()
	{
		Board b = new Board();
		for(int i = 3; i <= 9; i += 3)
		{
			b.addPlay(i, 'X');
		}
		assertEquals(true, b.hasWon());
	}

	@Test		
	public void testWinDownRight()
	{
		Board b = new Board();
		for(int i = 1; i <= 9; i += 4)
		{
			b.addPlay(i, 'X');
		}
		assertEquals(true, b.hasWon());
	}

	@Test		
	public void testWinDownLeft()
	{
		Board b = new Board();
		for(int i = 3; i <= 7; i += 2)
		{
			b.addPlay(i, 'X');
		}
		assertEquals(true, b.hasWon());
	}

	@Test		
	public void testGetSquareElementUnchanged()
	{
		Board b = new Board();
		assertEquals('1', b.getSquareElement(0));
	}
	
	@Test		
	public void testGetSquareElementChanged()
	{
		Board b = new Board();
		b.addPlay(1, 'X');
		assertEquals('X', b.getSquareElement(0));
	}
}
