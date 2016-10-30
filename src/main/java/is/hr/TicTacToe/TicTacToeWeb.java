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
		
		console.log("virkar");
        TicWeb.init();
    }
	
	@Override
    public void init() {
		console.log("virkar2")
        final Board board = new Board();
		console.log("virkar3")
       // post("/play", (req, res) -> Board.addPlay(req.queryParams("id"), req.queryParams("symbol")));
		
    }
}
