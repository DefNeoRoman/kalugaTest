import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by роман on 11.04.2017.
 */
public class Calculator {


    public static void calculate(String line) throws IOException {



        String characters[] = line.split("[^0-9]"); //Разделили через регулярное выражение
        int number1 = Integer.parseInt(characters[0]);
        int number2 = Integer.parseInt(characters[1]);

        String character = line.replaceAll("[0-9]",""); //В условии прописано, что символов будет всего три


        switch (character) {
            case "+": {
                System.out.println(number1 + number2);
                break;
            }

            case "-": {
                System.out.println(number1 - number2);
                break;
            }

            case "*": {
                System.out.println(number1 * number2);
                break;
            }

            case "/": {
                if (number2 != 0) {
                    System.out.println(number1 / number2 + "и остаток: " + number1 % number2);
                    break;
                } else {
                    System.out.println("Not divide by zero!");
                }
                break;
            }


            default:
                System.out.println("Incorrect character");
        }


    }

}
