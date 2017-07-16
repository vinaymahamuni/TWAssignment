/**
 * Created by vinayam on 7/16/17.
 */
public class Triangle {

    static void drawOneAsterisk() {
        drawHorizontalLineOfAsterisks(1);
    }

    static void drawHorizontalLineOfAsterisks(int N) {
        String output = "";
        for (int counter = 0; counter < N; counter++) {
            output += "*";
        }
        System.out.println(output);
    }

    static void drawVerticalLineOfAsterisk(int N) {
        String output = "";
        for (int counter = 0; counter < N; counter++) {
            output += "*\n";

        }
        System.out.print(output);
    }

    static void drawRightTriangle(int N) {
        for(int counter =1 ; counter<=N ; counter++){
            drawHorizontalLineOfAsterisks(counter);
        }
    }

    public static void main(String[] args) {
        System.out.println("one asterisk \n");
        drawOneAsterisk();
        System.out.println("\n\nhorizontal line");
        drawHorizontalLineOfAsterisks(8);
        System.out.println("\n\nVertical line");
        drawVerticalLineOfAsterisk(8);
        System.out.println("\n\nRightAngleTriangle");
        drawRightTriangle(10);
    }
}
