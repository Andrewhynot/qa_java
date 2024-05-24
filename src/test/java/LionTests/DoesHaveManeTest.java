package LionTests;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import com.example.Lion;


@RunWith(Parameterized.class)
public class DoesHaveManeTest {
    private final String sex;
    private final boolean expectedResult;

    public DoesHaveManeTest(String sex, boolean expectedResult){
        this.sex = sex;
        this.expectedResult = expectedResult;
    }


    @Parameterized.Parameters
    public static Object[][] lionVariants(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }



    @Test
    public void onlyLionsHaveMane(){
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        Assert.assertEquals(expectedResult, lion.doesHaveMane());
    }


}

