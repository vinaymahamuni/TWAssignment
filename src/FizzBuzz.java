/**
 * Created by vinayam on 7/16/17.
 */
public class FizzBuzz {

    static void fizzbuzz(int n) {
        for (int counter = 1; counter <= n; counter++) {
            if (counter % 3 != 0 && counter % 5 != 0)
                System.out.print("" + counter);

            else {
                if (counter % 3 == 0)
                    System.out.print("Fizz");
                if (counter % 5 == 0)
                    System.out.print("Buzz");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        fizzbuzz(100);
    }
}
