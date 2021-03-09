import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Github repo:
//https://github.com/poloczmate/prog2-ss21-exercise1

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
    @Test
    public void number_test_1(){
        String toCheck = "AbCwefsdgs(asdasd";
        assertFalse(App.checkPassword(toCheck));
    }
    @Test
    public void no_ziffer(){
        String toCheck = "AbCwefsdgsasdasd";
        assertFalse(App.checkPassword(toCheck));
    }
    @Test
    public void no_lower(){
        String toCheck = "ABCDDJHFSKNKL(";
        assertFalse(App.checkPassword(toCheck));
    }
    @Test
    public void no_upper(){
        String toCheck = "sdgjbsgkndmsnb(";
        assertFalse(App.checkPassword(toCheck));
    }
    @Test
    public void wrong_ziffer(){
        String toCheck = "AbCwefsdgsasdasd+";
        assertFalse(App.checkPassword(toCheck));
    }
    @Test
    public void continuous_numbers_1(){
        String toCheck = "AbC123(asdasd";
        assertFalse(App.checkPassword(toCheck));
    }
    @Test
    public void continuous_numbers_2(){
        String toCheck = "AbC6789(asdasd";
        assertFalse(App.checkPassword(toCheck));
    }
    @Test
    public void continuous_numbers_3(){
        String toCheck = "AbC69(asdasd678";
        assertFalse(App.checkPassword(toCheck));
    }
    @Test
    public void same_numbers_1(){
        String toCheck = "AbC69(asdasd6666";
        assertFalse(App.checkPassword(toCheck));
    }
    @Test
    public void same_numbers_2(){
        String toCheck = "1111AbC69(asdasd";
        assertFalse(App.checkPassword(toCheck));
    }
    @Test
    public void same_numbers_3(){
        String toCheck = "AbC6666(asdasd";
        assertFalse(App.checkPassword(toCheck));
    }
}
