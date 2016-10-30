package is.hr.TicTacToe;


import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class TicTacToeWeb implements SparkApplication{
	
	    public static void main(String[] args) {
			
		System.out.println("v1");
		
        staticFileLocation("/public");
		System.out.println("v2");
        SparkApplication TicWeb = new TicTacToeWeb();
		System.out.println("v3");
        String port = System.getenv("PORT");
        if (port != null) {
            port(Integer.valueOf(port));
        }
		System.out.println("port: "+ port);
		System.out.println("virkar");
        TicWeb.init();
    }
	
	@Override
    public void init() {
		System.out.println("virkar2");
        final Board board = new Board();
		System.out.println("virkar3");
		board.addPlay(1,'X');
		System.out.println(board.getSquareElement(1));
       // post("/play", (req, res) -> Board.addPlay(req.queryParams("id"), req.queryParams("symbol")));
		
    }
}
