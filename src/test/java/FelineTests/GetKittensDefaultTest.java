package FelineTests;

import com.example.Feline;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GetKittensDefaultTest {

    private final int felineKittensCount = 1;

    @Test
    public void felineDefaultKittenCount(){
        Feline feline = new Feline();
        assertThat(feline.getKittens(), is(felineKittensCount));
    }

}
