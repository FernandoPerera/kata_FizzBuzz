import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzTest {

    /*
    * Casos de uso :
    *
    *   - Si llega una lista vacia devuelve 0.
    *
    *   - Si llega un número divisible por 3 devolver 'Fizz'.
    *
    *   - Si llega un número que contenga 3 devolver 'Fizz'.
    *
    *   - Si llega un número divisible por 5 devolver 'Buzz'.
    *
    *   - Si llega un número que contiene 5 devolver 'Buzz'.
    *
    *   - Si llega un número divisible por 3 y por 5 devolver 'FizzBuzz'.
    *
    *   - Si llega un número que contenga el 3 y el 5 devolver 'FizzBuzz'.
    *
    *   - Si llega un número que contenga el 3 y el 5 y sea divisible por
    *     5 devolver 'FizzBuzzBuzz'.
    *
    *   - Si llega un número que no es divisible ni por 3 ni por 5 ni contiene
    *     el 3 ni el 5 devolver el mismo número.
    *
    *   - Si llega una lista de números devolver una correcta respuesta.
    *
    */

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void given_empty_list_return_0() {

        List<String> expectedList = new ArrayList<>();
        List<String> fizzBuzzList = fizzBuzz.fizzBuzzNumbers(expectedList);

        assertEquals(0,fizzBuzzList.size() );

    }

    @Test
    public void given_divisible_number_by_3_return_fizz() {

        List<String> expectedList = new ArrayList<>();
        expectedList.add("3");

        List<String> fizzBuzzList = fizzBuzz.fizzBuzzNumbers(expectedList);

        assertEquals("Fizz", fizzBuzzList.get(0));
    }

    @Test
    public void given_number_that_contain_3_return_fizz() {

        List<String> expectedList = new ArrayList<>();
        expectedList.add("13");

        List<String> fizzBuzzList = fizzBuzz.fizzBuzzNumbers(expectedList);

        assertEquals("Fizz", fizzBuzzList.get(0));
    }

    @Test
    public void given_divisible_number_by_5_return_buzz(){

        List<String> expectedList = new ArrayList<>();
        expectedList.add("5");

        List<String> fizzBuzzList = fizzBuzz.fizzBuzzNumbers(expectedList);

        assertEquals("Buzz", fizzBuzzList.get(0));
    }

    @Test
    public void given_number_that_contain_5_return_buzz() {

        List<String> expectedList = new ArrayList<>();
        expectedList.add("52");

        List<String> fizzBuzzList = fizzBuzz.fizzBuzzNumbers(expectedList);

        assertEquals("Buzz", fizzBuzzList.get(0));
    }

    @Test
    public void given_divisible_number_by_3_and_5_return_fizz_buzz(){

        List<String> expectedList = new ArrayList<>();
        expectedList.add("15");

        List<String> fizzBuzzList = fizzBuzz.fizzBuzzNumbers(expectedList);

        assertEquals("FizzBuzz", fizzBuzzList.get(0));

    }

    @Test
    public void given_number_not_divisible_by_3_and_5_return_same_number(){

        List<String> expectedList = new ArrayList<>();
        expectedList.add("4");

        List<String> fizzBuzzList = fizzBuzz.fizzBuzzNumbers(expectedList);

        assertEquals(expectedList.get(0), fizzBuzzList.get(0));

    }

    /*
    *   Test given_different_numbers_return_correct_response_for_each_number()
    *
    *       - Añadiré en una lista los datos que espero que devuelva
    *         el método 'fizzBuzzNumbers' y en otra los que pasaré al método mencionado.
    *
    *       - Luego añadiré un contador que mediante un bucle for se irá incrementando
    *         cada vez que un elemento de una lista sea igual al otro.
    *
    *       - Por último si el contador es igual al tamaño de la lista esperada será
    *         una respuesta correcta.
    */

    @Test
    public void given_different_numbers_return_correct_response_for_each_number(){

        List<String> listToCheck = addElementsToCheck();
        List<String> expectedList = addExpectedElements();
        List<String> fizzBuzzList = fizzBuzz.fizzBuzzNumbers(listToCheck);

        int contador = 0;

        for (int index = 0; index < expectedList.size() ; index++) {
            if ( fizzBuzzList.get(index).equals(expectedList.get(index)) ){
                contador++;
            }
        }
        boolean correctResponse = contador == expectedList.size();
        assertTrue(correctResponse);
    }

    /*
    *   Método privado que devuelve una lista con los datos que esperamos
    *   que devuelva el método 'fizzBuzzNumbers'.
    */

    private List<String> addExpectedElements(){

        List<String> expectedList = new ArrayList<>();

        expectedList.add("1");
        expectedList.add("2");
        expectedList.add("Fizz");
        expectedList.add("4");
        expectedList.add("Buzz");
        expectedList.add("Fizz");
        expectedList.add("7");
        expectedList.add("8");
        expectedList.add("Fizz");
        expectedList.add("Buzz");
        expectedList.add("11");
        expectedList.add("Fizz");
        expectedList.add("13");
        expectedList.add("14");
        expectedList.add("FizzBuzz");

        return expectedList;
    }

    /*
    *   Método privado que devuelve una lista con elementos
    *   que pasaremos al método 'fizzBuzzNumbers'.
    */

    private List<String> addElementsToCheck(){

        List<String> listToCheck = new ArrayList<>();

        for (int index = 1; index <= 15 ; index++) {
            listToCheck.add(String.valueOf(index));
        }
        return listToCheck;
    }

}
