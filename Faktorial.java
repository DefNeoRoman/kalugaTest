/**
 * Created by роман on 11.04.2017.
 */
public class Faktorial {



    public int factorial(int n) {


        if (n == 1 || n == 0)
            return 1;
        int out = n * factorial(n - 1);
        return out;
    }
}
