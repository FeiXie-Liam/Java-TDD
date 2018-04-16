package com.thoughtworks;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzGameTest {
    @Test
    public void should_return_Fizz_when_have_3() {
        FizzBuzzGame game = new FizzBuzzGame();
        assertThat(game.getOutput(3)).isEqualTo("Fizz");
    }

    @Test
    public void should_Return_Fizz_when_is_Multiple_of_3() {
        FizzBuzzGame game = new FizzBuzzGame();
        assertThat(game.getOutput(9)).isEqualTo("Fizz");
    }

    @Test
    public void should_Return_Bizz_when_is_Multiple_of_5() {
        FizzBuzzGame game = new FizzBuzzGame();
        assertThat(game.getOutput(10)).isEqualTo("Buzz");
    }

    @Test
    public void should_Return_Whizz_when_is_Multiple_of_7() {
        FizzBuzzGame game = new FizzBuzzGame();
        assertThat(game.getOutput(14)).isEqualTo("Whizz");
    }

    @Test
    public void should_Return_FizzBizz_when_is_Multiple_of_3_and_5(){
        FizzBuzzGame game = new FizzBuzzGame();
        assertThat(game.getOutput(15)).isEqualTo("FizzBuzz");
    }

}
