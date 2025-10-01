import org.example.Main;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ComplexTest {
    @Before
    public void testBefore() {
        Main.isRunningTest = true;
    }

    @Test
    public void testComplex() {

    }

    @Test
    public void testExit() {
        Main.main(null);
    }

    @Test
    public void testChoice1() {
        Main.testChoice = '1';
        Main.main(null);
    }
    @Test
    public void testChoice2() {

    }
    @Test
    public void testChoice3() {

    }
    @Test
    public void testChoice4() {

    }
    @Test
    public void testChoice5() {

    }

    @After
    public void testAfter() {
        Main.isRunningTest = false;
    }
}
