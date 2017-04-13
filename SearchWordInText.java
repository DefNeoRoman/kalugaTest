import java.io.IOException;
import java.nio.charset.Charset;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by роман on 11.04.2017.
 */
public class SearchWordInText {




    public static boolean checkWithRegExp(String line, String inSearchString){

        Pattern p = Pattern.compile(inSearchString);
        Matcher m = p.matcher(line);
        return m.matches();
    }


    public static int doSearch(String fileName, String search) throws IOException{
        Charset charset = Charset.forName("cp1251");
        Path path = Paths.get(fileName);

        String myText = new String(Files.readAllBytes(path), charset);


        int j = 0; // Счетчик слова
        if (myText != null){
            String[] tokens = myText.split("[,;:.!?\\s]+");
            for(String token: tokens){
                if(checkWithRegExp(token, search)){
                    j++;
                    System.out.println("Найдено слово: " + search);
                }
            }
        }

        return j;
    }

}
