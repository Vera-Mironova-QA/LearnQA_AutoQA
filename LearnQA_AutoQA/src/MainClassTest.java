import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    MainClass Main = new MainClass();

    @Test
    public void testGetLocalNumber() {
        Assert.assertTrue("Method getLocalNumber return NOT 14", Main.getLocalNumber() == 14);
    }

    @Test
    public void testClassNumber() {
        Assert.assertTrue("Class number less  or equal 45",Main.getClassNumber() > 45);
    }

    @Test
    public void testGetClassString() {
        Assert.assertTrue("String does not contain 'hello' or 'Hello'", Main.getClassString().contains("hello")||Main.getClassString().contains("Hello"));
    }
}
