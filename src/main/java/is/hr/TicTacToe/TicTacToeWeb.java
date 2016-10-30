package is.hr.TicTacToe;


import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class TicTacToeWeb implements SparkApplication{
	
	    public static void main(String[] args) {
			
        staticFileLocation("/public");
        SparkApplication TicWeb = new TicTacToeWeb();
        String port = System.getenv("PORT");
        if (port != null) {
            port(Integer.valueOf(port));
        }
        TicWeb.init();
    }
	
	@Override
    public void init() {
        final Board board = new Board();
		
		post("/init", (req, res) -> board.init());
		
		post("/haswon", (req, res) -> board.hasWon());
		
		post("/addplay0x", (req, res) ->{ 
		
			Board.addPlay(1,'X');
		
			for(int i = 0; i < 9; i++)
			{
				System.out.println(board.getSquareElement(i));
			}
			
			return res;
		
		
		});
		post("/addplay0o", (req, res) -> Board.addPlay(1,'O'));
		
		post("/addplay1x", (req, res) -> Board.addPlay(2,'X'));
		post("/addplay1o", (req, res) -> Board.addPlay(2,'O'));
		
		post("/addplay2x", (req, res) -> Board.addPlay(3,'X'));
		post("/addplay2o", (req, res) -> Board.addPlay(3,'O'));
		
		post("/addplay3x", (req, res) -> Board.addPlay(4,'X'));
		post("/addplay3o", (req, res) -> Board.addPlay(4,'O'));
		
		post("/addplay4x", (req, res) -> Board.addPlay(5,'X'));
		post("/addplay4o", (req, res) -> Board.addPlay(5,'O'));
		
		post("/addplay5x", (req, res) -> Board.addPlay(6,'X'));
		post("/addplay5o", (req, res) -> Board.addPlay(6,'O'));
		
		post("/addplay6x", (req, res) -> Board.addPlay(7,'X'));
		post("/addplay6o", (req, res) -> Board.addPlay(7,'O'));
		
		post("/addplay7x", (req, res) -> Board.addPlay(8,'X'));
		post("/addplay7o", (req, res) -> Board.addPlay(8,'O'));
		
		post("/addplay8x", (req, res) -> Board.addPlay(9,'X'));
		post("/addplay8o", (req, res) -> Board.addPlay(9,'O'));
		
		post("/play", (req, res) -> {
			//Board.addPlay(req.queryParams("id"), req.queryParams("symbol"));
		
		res.status(200);
		return res;
		});
	   
    }
}