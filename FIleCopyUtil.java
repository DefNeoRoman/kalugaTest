import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by роман on 11.04.2017.
 */
public class FIleCopyUtil {

    String pathSource;
    String pathDestination;

    public FIleCopyUtil(String pathSource, String pathDestination) {
        this.pathSource = pathSource;
        this.pathDestination = pathDestination;
    }



    public void doCopy(){
        try {
            Path source = Paths.get(pathSource);
            Path destination = Paths.get(pathDestination);
            long start = System.currentTimeMillis();
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            long finish = System.currentTimeMillis();
            long timeConsumedMillis = finish - start;
            System.out.println("Source file copied successfully за время: " + timeConsumedMillis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
