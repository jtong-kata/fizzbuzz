package com.thoughtworks.dojos.fizzbuzz;

public class FizzBuzz {


    private Translator translator;

    public FizzBuzz(Translator translator) {

        this.translator = translator;
    }


    public void doIt(int n) {
        for(int i = 0; i < n; i++) {
            String translate = translator.translate(i + 1);
            System.out.println(translate);
        }

    }


}
