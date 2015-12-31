import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    private User myUser = new User();

    @Test
    public void correctInitialisationTest() {
        assertEquals("Simple initialisation test1", -8, myUser.getRank(), 0);
        assertEquals("Simple initialisation test2", 0, myUser.getCurrentProgress(), 0);
    }
    @Test
    public void correctRankTest() {
        myUser.incProgress(-8);
        assertEquals("Same rank", 3, myUser.getCurrentProgress(), 0);
        myUser.incProgress(-7);
        assertEquals("Rank higher than current by 1", 13, myUser.getCurrentProgress(), 0);
        myUser.incProgress(1);
        assertEquals("Progress to higher rank", -7, myUser.getRank(), 0);
        assertEquals("Check residual progress", 3, myUser.getCurrentProgress(), 0);
        myUser.incProgress(-8);
        assertEquals("Rank lower than current by 1", 3, myUser.getCurrentProgress(), 0);
        for(int i = 0; i<6; i++){
            myUser.incProgress(3+i);
        }
        assertEquals("Check rank not zero", 1, myUser.getRank(), 0);
        for(int i = 0; i<20; i++){
            myUser.incProgress(8);
        }
        assertEquals("Check rank not above 8", 8, myUser.getRank(), 0);
    }
}
