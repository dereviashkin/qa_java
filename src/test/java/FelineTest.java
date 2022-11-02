import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    @Test
    public void getMeatSuccess() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        Assert.assertEquals("List of food is incorrect!", expected, actual);
    }

    @Test
    public void getFamilySuccess() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        Assert.assertEquals("Family is incorrect!", expected, actual);
    }

    @Test
    public void getKittensOneSuccess() {
        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens();
        Assert.assertEquals("Amount of kittens is incorrect!", expected, actual);
    }

    @Test
    public void getKittensMultiSuccess() {
        Feline feline = new Feline();
        int expected = 5;
        int actual = feline.getKittens(expected);
        Assert.assertEquals("Amount of kittens is incorrect!", expected, actual);
    }
}