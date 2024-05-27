package testlion;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import com.example.Lion;

@RunWith(Parameterized.class)
public class LionExceptionTest {
    private static final String ERROR_MESSAGE = "Используйте допустимые значения пола животного - самец или самка";
    private final String sex;

    public LionExceptionTest(String sex){
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] irrelevantSexes(){
        return new Object[][]{
                {"Мужской"},
                {"Женский"},
                {"Мальчик"},
                {"Девочка"}
        };
    }

    @Test
    public void doesHaveMane(){
        Feline feline = new Feline();
        IndexOutOfBoundsException error = Assert.assertThrows(IndexOutOfBoundsException.class, () -> {  Lion lion = new Lion(sex, feline); });
        Assert.assertEquals(ERROR_MESSAGE, error.getMessage());
    }



}
