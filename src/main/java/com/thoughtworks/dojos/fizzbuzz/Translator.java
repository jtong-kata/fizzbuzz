package com.thoughtworks.dojos.fizzbuzz;

public class Translator {
    public String translate(int i) {

        String result = "";
        if (i % 3 == 0) {
            result += "Fizz";
        }
        if (i % 5 == 0) {
            result += "Buzz";
        }

        return result.equals("")? String.valueOf(i) :result;
    }
}
