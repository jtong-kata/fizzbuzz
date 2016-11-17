package com.thoughtworks.dojos.fizzbuzz;

import com.thoughtworks.dojos.fizzbuzz.Translator;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TranslatorTest {
    @Test
    public void should_return_origin_number_when_input_normal_number_1(){
        int i = 1;
        Translator translator = new Translator();
        String message = translator.translate(i);

        assertThat(message, is("1"));
    }

    @Test
    public void should_return_origin_number_when_input_normal_number_2(){
        int i = 2;
        Translator translator = new Translator();
        String message = translator.translate(i);

        assertThat(message, is("2"));
    }

    @Test
    public void should_return_fizz_when_input_number_3(){
        //given
        int i = 3;
        Translator translator = new Translator();

        //when
        String message = translator.translate(i);

        //then
        assertThat(message, is("Fizz"));
    }

    @Test
    public void should_return_buzz_when_input_number_5(){
        //given
        int i = 5;
        Translator translator = new Translator();

        //when
        String message = translator.translate(i);

        //then
        assertThat(message, is("Buzz"));
    }

    @Test
    public void should_return_fizzbuzz_when_input_number_15() {
        //given
        int i = 15;
        Translator translator = new Translator();

        //when
        String message = translator.translate(i);

        //then
        assertThat(message, is("FizzBuzz"));
    }
}
