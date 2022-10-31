import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

//@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    //@Mock
    //Animal animal;

    @Test
    public void getMeatSuccess() throws Exception {
        //Arrange
        Feline feline = new Feline();
        /*
          Хотя в методе используется обращение к родительскому классу, закомментил мок, т.к. при прогоне выпадает эксепшн о ненужном стабе
         */
//      Mockito.when(animal.getFood(Mockito.anyString())).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        //Act
        List<String> actual = feline.eatMeat();
        //Assert
        Assert.assertEquals("List of food is incorrect!", expected, actual);
    }

    @Test
    public void getFamilySuccess() {
        //Arrange
        Feline feline = new Feline();
        String expected = "Кошачьи";
        //Act
        String actual = feline.getFamily();
        //Assert
        Assert.assertEquals("Family is incorrect!", expected, actual);
    }

    @Test
    public void getKittensOneSuccess() {
        //Arrange
        Feline feline = new Feline();
        int expected = 1;
        //Act
        int actual = feline.getKittens();
        //Assert
        Assert.assertEquals("Amount of kittens is incorrect!", expected, actual);
    }

    @Test
    public void getKittensMultiSuccess() {
        //Arrange
        Feline feline = new Feline();
        int expected = 5;
        //Act
        int actual = feline.getKittens(expected);
        //Assert
        Assert.assertEquals("Amount of kittens is incorrect!", expected, actual);
    }
}