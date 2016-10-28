package is.hr.TicTacToe;

public class Controller {
	
	public static void main(String[] args)
	{
		Player player1 = new Player('x');
		Player player2 = new Player('o');
		
		Board game = new Board(player1, player2);
		
		game.init();
		
		while(!game.hasWon())
		{
			game.drawBoard();
			while(!game.addPlay(player1.addPlay(), player1.symbol));
			
			if(game.hasWon())
			{
				System.out.println("Congratulations " + player1.symbol + ", you won!");
				break;
			}
			
			game.drawBoard();
			while(!game.addPlay(player2.addPlay(), player2.symbol));
			if(game.hasWon())
			{
				System.out.println("Congratulations " + player2.symbol + ", you won!");
				break;
			}
		}
	}
}