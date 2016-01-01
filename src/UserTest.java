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
        myUser.incProgress(2);
        myUser.incProgress(-1);

        myUser.incProgress(-8);
        assertEquals("Same rank", 3, myUser.getCurrentProgress(), 0);
        myUser.incProgress(-7);
        assertEquals("Rank higher than current by 1", 13, myUser.getCurrentProgress(), 0);
        myUser.incProgress(1);
        assertEquals("Progress to higher rank", -2, myUser.getRank(), 0);
        assertEquals("Check residual progress", 3, myUser.getCurrentProgress(), 0);
        myUser.incProgress(-8);
        assertEquals("Rank lower than current by 1", 3, myUser.getCurrentProgress(), 0);
        for(int i = 0; i<6; i++){
            myUser.incProgress(3+i);
        }
        myUser.incProgress(8);
        myUser.incProgress(8);
        assertEquals("Check rank not zero", 1, myUser.getRank(), 0);
        for(int i = 0; i<30; i++){
            myUser.incProgress(8);
        }
        assertEquals("Check rank not above 8", 8, myUser.getRank(), 0);
    }
}
/**
/UserTest.java:8: error: cannot find symbol
        assertEquals("After applying rank of " + rank + " the progress was expected to be " + expectedProgress + ", but was actually " + user.progress, expectedProgress, user.progress);
        symbol: variable progress
        location: variable user of type User
        /UserTest.java:8: error: cannot find symbol
        assertEquals("After applying rank of " + rank + " the progress was expected to be " + expectedProgress + ", but was actually " + user.progress, expectedProgress, user.progress);
        ^
        symbol: variable progress
        location: variable user of type User
        2 errors

        java.lang.RuntimeException: /UserTest.java:8: error: cannot find symbol assertEquals("After applying rank of " + rank + " the progress was expected to be " + expectedProgress + ", but was actually " + user.progress, expectedProgress, user.progress); ^ symbol: variable progress location: variable user of type User /UserTest.java:8: error: cannot find symbol assertEquals("After applying rank of " + rank + " the progress was expected to be " + expectedProgress + ", but was actually " + user.progress, expectedProgress, user.progress); ^ symbol: variable progress location: variable user of type User 2 errors at codewars.runners.java$compile_and_load.doInvoke(java.clj:85) at clojure.lang.RestFn.invoke(RestFn.java:439) at codewars.runners.java$fn__572.invoke(java.clj:110) at clojure.lang.MultiFn.invoke(MultiFn.java:227) at codewars.runners$run.invoke(runners.clj:22) at codewars.core$_main$fn__634.invoke(core.clj:40) at clojure.lang.AFn.call(AFn.java:18) at java.util.concurrent.FutureTask.run(FutureTask.java:266) at java.lang.Thread.run(Thread.java:745)
        0 Passed
        0 Failed
        1 Errors
        Process took 2559ms to complete

 Current rank: -8 Current progress: 0 applied rank: 1
 Current rank: 0 Current progress: 10 applied rank: 1
 After applying rank of 1 the resulting user rank was expected to be -2, but was actually 0 expected:<-2> but was:<0>
**/