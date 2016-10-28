package is.hr.TicTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class PlayerTest {
	
	public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("is.hr.TicTacToe.TicTacToeTest");
    }


	@Test
	public void PlayerSymbol(){
		
		Player p1 = new Player('x');
	
		assertEquals('x', p1.symbol);
	}
	
	
	
	@Test
	public void PlayerMessage(){
		
		//Player p1 = new Player('x');
	
		assertEquals("Player x your turn, pick a value between 1-9", Player.playerMsg('x'));
	}


}
