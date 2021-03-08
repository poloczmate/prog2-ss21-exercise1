import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void test_length_1(){
        String toCheck = "AbC12(asdasd";
        assertTrue(App.checkPassword(toCheck));
    }
    @Test
    public void test_length_2(){
        String toCheck = "AbC12";
        assertFalse(App.checkPassword(toCheck));
    }
    @Test
    public void test_length_3(){
        String toCheck = "AbC12(asdasdAbC12(asdasdAbC12(asdasdAbC12(asdasd";
        assertFalse(App.checkPassword(toCheck));
    }
}
