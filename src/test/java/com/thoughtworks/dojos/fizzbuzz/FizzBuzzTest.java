package com.thoughtworks.dojos.fizzbuzz;

import com.thoughtworks.dojos.fizzbuzz.FizzBuzz;
import com.thoughtworks.dojos.fizzbuzz.Translator;
import org.junit.Test;
import org.mockito.InOrder;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.*;

public class FizzBuzzTest {

    @Test
    public void should_call_tranlator_2_times_with_param_2(){

        Translator translator = mock(Translator.class);
        int n = 2;
        InOrder inorder = inOrder(translator);

        FizzBuzz fizzbuzz = new FizzBuzz(translator);
        fizzbuzz.doIt(2);

        verify(translator, times(2)).translate(anyInt());
        inorder.verify(translator).translate(1);
        inorder.verify(translator).translate(2);

    }

}
