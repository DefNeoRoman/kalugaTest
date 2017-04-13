

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by роман on 11.04.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException{

        System.out.println("Все задачи будут выводиться в заданном порядке");
        //1.Задача на факториал
        System.out.println("Введите число для вычисления факториала");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int f = Integer.parseInt(reader.readLine());
        Faktorial fact = new Faktorial();

        int resultFact =  fact.factorial(f);
        System.out.println("Вычисленный факториал = " + resultFact);


        //2.Количество вхождений слов в тексте
        System.out.println("Поиск количества вхождений слова в тексте.");

        System.out.println("Введите имя файла , в котором будем искать");

        String fName = reader.readLine();

        System.out.println("Теперь введите слово");
        String search = reader.readLine();
        SearchWordInText searchWordInText = new SearchWordInText();
        int number = searchWordInText.doSearch(fName,search);
        System.out.println("В этом тексте: "+number+" слов ");

        //3.Реализация Калькулятора
        System.out.println("Введите арифметическое выражение в формате [число][знак][число]");
        String line = reader.readLine();
        Calculator.calculate(line);



        //4. Утилита для  копирования
        System.out.println("утилита для копирования ");
        System.out.println("Задайте имя файла");
        String pathSource = reader.readLine();
        System.out.println("задайте имя для конечного файла");
        String pathDestination = reader.readLine();
        FIleCopyUtil fIleCopyUtil = new FIleCopyUtil(pathSource, pathDestination);
        fIleCopyUtil.doCopy();
        System.out.println("готово");

        reader.close();

        System.exit(0); // Программа завершена с кодом Ноль


    }
}
