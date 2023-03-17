
import java.util.List;


public class FizzBuzz {

    /*
    *   El método 'fizzBuzzNumbers' recibe una lista de strings
    *   las cual esta compuesta por números.
    *
    *   Se deberá devolver la misma lista pero con una serie de
    *   condiciones mencionadas en el test.
    */

    public List<String> fizzBuzzNumbers(List<String> fizzBuzzList) {

        for ( int index = 0; index < fizzBuzzList.size() ; index++ ) {

            int actualNumber = Integer.parseInt((fizzBuzzList.get(index)));

            boolean divisibleByThree = actualNumber % 3 == 0;
            boolean divisibleByFive = actualNumber % 5 == 0;
            boolean stringContainsThree = fizzBuzzList.get(index).contains("3");
            boolean stringContainsFive = fizzBuzzList.get(index).contains("5");
            boolean actualNumberContainsThree = String.valueOf(actualNumber).contains("3");
            boolean actualNumberContainsFive = String.valueOf(actualNumber).contains("5");

            if ( divisibleByThree || stringContainsThree && !divisibleByFive ) {
                fizzBuzzList.add(index, "Fizz");
                fizzBuzzList.remove(index + 1);
            } else if (divisibleByFive || stringContainsFive) {
                fizzBuzzList.add(index, "Buzz");
                fizzBuzzList.remove(index + 1);
            }

            if ( actualNumberContainsFive && actualNumberContainsThree || divisibleByThree && divisibleByFive){
                fizzBuzzList.add(index, "FizzBuzz");
                fizzBuzzList.remove(index + 1);
            }

            if ( stringContainsFive && stringContainsThree && divisibleByFive ){
                fizzBuzzList.add(index, "FizzBuzzBuzz");
                fizzBuzzList.remove(index + 1);
            }

        }
        return fizzBuzzList;
    }

}
