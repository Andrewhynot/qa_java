package testlion;


import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class GetKittensTest {

    private final String sex;

    public GetKittensTest(String sex){
        this.sex = sex;

    }

    @Mock
    Feline feline;

    @Parameterized.Parameters
    public static Object[][] lionVariants(){
        return new Object[][]{
                {"Самец"},
                {"Самка"}
        };
    }


    @Test
    public void lionsHaveOnlyOneKitten(){
        MockitoAnnotations.openMocks(this);
        Lion lion = new Lion(sex, feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }

}
