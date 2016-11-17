import com.thoughtworks.dojos.fizzbuzz.FizzBuzz;
import com.thoughtworks.dojos.fizzbuzz.Translator;

public class Main {
    public static void main(String args[]) {
        Translator translator = new Translator();
        FizzBuzz fizzBuzz = new FizzBuzz(translator);

        fizzBuzz.doIt(100);
    }
}
