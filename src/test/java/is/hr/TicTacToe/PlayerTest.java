package is.hr.TicTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class PlayerTest {
	
	public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("is.hr.TicTacToe.PlayerTest");
    }


	@Test
	public void PlayerSymbol(){
		
		Player p1 = new Player('x');
	
		assertEquals('x', p1.symbol);
	}
	
	/*
		public int addPlay()
	{
		System.out.println(playerMsg(symbol));
		int val = in.nextInt();
		return val;
	}
	*/
	
	@Test
	public void addPlay(){
		
		//Player p1 = new Player('x');
		
	
		assertEquals("Player x your turn, pick a value between 1-9", Player.playerMsg('x'));
	}
	
	
	
	@Test
	public void PlayerMessage(){
		
		//Player p1 = new Player('x');
	
		assertEquals("Player x your turn, pick a value between 1-9", Player.playerMsg('x'));
	}


}
