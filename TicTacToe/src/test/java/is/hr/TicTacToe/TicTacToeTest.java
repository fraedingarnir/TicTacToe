package is.hr.TicTacToe;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

import org.junit.Test;


public class ChuckTest {

    @Test
    public void randomJokeContainsName() {
        Chuck chuck = new Chuck();
        assertThat(chuck.random(), containsString("Chuck Norris"));
    }
}
