import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    MainClass Main = new MainClass();
    @Test
    public void testGetLocalNumber() {
            Assert.assertTrue("Method getLocalNumber return NOT 14",Main.getLocalNumber() == 14);
        }
    }
