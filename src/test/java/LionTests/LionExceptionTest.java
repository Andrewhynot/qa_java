package LionTests;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import com.example.Lion;

@RunWith(Parameterized.class)
public class LionExceptionTest {

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

    @Test(expected = IndexOutOfBoundsException.class)
    public void doesHaveMane(){
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
    }




}
