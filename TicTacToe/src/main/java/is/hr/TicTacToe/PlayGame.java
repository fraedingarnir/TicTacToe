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

		char player = 'X';
		int turn = 0;
		while(!board.hasWon())
		{
			if(turn%2 == 0)
				player = 'X';
			else
				player = 'O';

			printBoard(board);
			System.out.println("Player " + player + " your turn, pick a value between 1-9");
			
			while(true)
			{
				int play = in.nextInt();
				if(board.addPlay(play, player))
					break;
				else
					System.out.println("That move is not allowed");
			}

			turn++;
		}

		printBoard(board);
		System.out.println("Congratulations " + player + "! you are the winner!!!");
		
	}

	private static void printBoard(Board board)
	{
		int line = 0;
        for(int row = 0; row < 3; row++)
        {
                for(int col = line; col < line+3; col++)
                {
                        System.out.print(" " + board.getSquareElement(col));
                        if(col != 2 && col != 5 && col != 8 || col == 0)
                                System.out.print(" |");
                }

                if(row != 2)
                        System.out.println("\n---|---|---");
                line += 3;
        }
        System.out.println();
	}


}
