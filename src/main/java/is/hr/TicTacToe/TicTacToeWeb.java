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
		
		post("/getvalue", (req, res) -> board.getSquareElement(1));
		
		post("/play", (req, res) -> board.addPlay(1));
			//Board.addPlay(req.queryParams("id"), req.queryParams("symbol"));
		
		res.status(200);
		return res;
		});
	   
    }
}