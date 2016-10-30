package is.hr.TicTacToe;

import java.util.Scanner;

public class PlayGame {
	
	public static void main(String[] args)
	{
		//Player player1 = new Player('X');
		//Player player2 = new Player('O');
		
		Board board = new Board();

		Scanner in = new Scanner(System.in);

		//printBoard(board);
		int cont = 1;
		while(cont == 1)
		{
			board.init();
			char player = 'X';
			int turn = 0;
			for(; !board.hasWon() && turn < 9; turn++)
			{
				if(turn%2 == 0)
					player = 'X';
				else
					player = 'O';

				System.out.println(printBoard(board));
				System.out.println("Player " + player + " your turn, pick a value between 1-9");
				
				while(true)
				{
					int play = in.nextInt();
					if(board.addPlay(play, player))
						break;
					else
						System.out.println("That move is not allowed");
				}
			}

			System.out.println(printBoard(board));

			if(turn == 9 && !board.hasWon())
				System.out.println("It's a Draw!");
			else
				System.out.println("Congratulations " + player + "! you are the winner!!!");
			
			System.out.println("To play again type \"1\" ");
			cont = in.nextInt();		
		}
	}

	private static String printBoard(Board board)
	{
		String result = "";
		int line = 0;
        for(int row = 0; row < 3; row++)
        {
                for(int col = line; col < line+3; col++)
                {
                        result += (" " + board.getSquareElement(col));
                        if(col != 2 && col != 5 && col != 8 || col == 0)
                                result += (" |");
                }

                if(row != 2)
                        result += ("\n---|---|---\n");
                line += 3;
        }
        return result;
	}


}