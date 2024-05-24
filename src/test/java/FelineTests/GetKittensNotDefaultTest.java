package FelineTests;


import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class GetKittensNotDefaultTest {

    private final int kittenCountParam;
    private final int expectedKittenCount;

    public GetKittensNotDefaultTest(int kittenCountParam, int expectedKittenCount){
        this.kittenCountParam = kittenCountParam;
        this.expectedKittenCount = expectedKittenCount;
    }


    @Parameterized.Parameters
    public static Object[][] data(){
        return new Object[][]{
                {1, 1},
                {10, 10},
                {100, 100}
        };
    }

    @Test
    public void felineGivesDifferentKittenCount(){
        Feline feline = new Feline();
        assertThat(feline.getKittens(kittenCountParam), is(expectedKittenCount));
    }



}
