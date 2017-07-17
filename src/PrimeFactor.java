import java.util.ArrayList;
import java.util.List;

/**
 * Created by vinayam on 7/18/17.
 */
public class PrimeFactor {

    public static List<Integer> primeFactor(int N) {
        List<Integer> factors=new ArrayList<>();
        while (N % 2 == 0) {
            factors.add(2);
            N /= 2;
        }
        for (int counter = 3; counter <= Math.sqrt(N); counter += 2) {
            while (N % counter == 0) {
                factors.add(counter);
                N =N / counter;
            }
        }
        if (N > 2)
            factors.add(N);
        return factors;
    }

    public static void main(String args[]) {
        List<Integer> factors=primeFactor(100);
        System.out.println(factors);
    }
}

