package is.hr.TicTacToe;
/*
import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class TicTacToeWeb implements SparkApplication{
	
	    public static void main(String[] args) {
        staticFileLocation("/public");
        SparkApplication chuckweb = new ChuckWeb();

        String port = System.getenv("PORT");
        if (port != null) {
            port(Integer.valueOf(port));
        }

        TicTacToeWeb.init();
    }
	
	@Override
    public void init() {
        final Board board = new Board();
		
        post("/play", (req, res) -> Board.addPlay("id", "symbol"));
        post("/id", (req, res) -> chuck.getById(req.queryParams("id")));
        post("/setName", (req, res) -> {
            chuck.alterName(
                req.queryParams("firstName"),
                req.queryParams("lastName")
            );          
            res.status(200);
            return res;
        });
    }
	
}
*/
