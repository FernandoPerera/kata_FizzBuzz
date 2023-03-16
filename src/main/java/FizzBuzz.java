
import java.util.List;


public class FizzBuzz {

    /*
    *   El método 'fizzBuzzNumbers' recibe una lista de strings
    *   las cual esta compuesta por números.
    *
    *   Se deberá devolver la misma lista pero con una serie de
    *   condiciones :
    *
    *       - Si el número es divisible por 3 este se sustituirá
    *         por la palabra 'Fizz'.
    *
    *       - Si el número es divisible por 5 este se sustituirá
    *         por la palabra 'Buzz'.
    *
    *       - Si el número es divisible por 3 y por 5  este se
    *         sustituirá por la palabra 'FizzBuzz'.
    *
    *       - Si el número no es divisible ni por 3 ni por 5 no
    *         se cambiará el número.
    */
    public List<String> fizzBuzzNumbers(List<String> fizzBuzzList) {

        for ( int index = 0; index < fizzBuzzList.size() ; index++ ) {

            int actualNumber = Integer.parseInt((fizzBuzzList.get(index)));

            if ( actualNumber % 3 == 0 || fizzBuzzList.get(index).contains("3") && actualNumber % 5 != 0 ) {

                fizzBuzzList.remove(fizzBuzzList.get(index));
                fizzBuzzList.add(index, "Fizz");

            }

            if (actualNumber % 5 == 0 || fizzBuzzList.get(index).contains("5")) {

                fizzBuzzList.remove(fizzBuzzList.get(index));
                fizzBuzzList.add(index, "Buzz");
            }

            if ( String.valueOf(actualNumber).contains("3") && String.valueOf(actualNumber).contains("5") ) {

                fizzBuzzList.remove(fizzBuzzList.get(index));
                fizzBuzzList.add(index, "FizzBuzz");
            }

        }
        return fizzBuzzList;
    }

}
