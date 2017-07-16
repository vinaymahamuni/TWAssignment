/**
 * Created by vinayam on 7/16/17.
 */
public class Diamond {

    static void drawIsoscelesTriangle(int N) {
        for (int counter = 1; counter <= N; counter++) {
            drawHorizontalLineOfGivenCharacter(N - counter, ' ');
            drawHorizontalLineOfGivenCharacter(2 * counter - 1, '*');
            System.out.println();
        }

    }

    private static void drawReverseIsoscelesTriangle(int N) {
        for (int counter = 1; counter < N; counter++) {
            drawHorizontalLineOfGivenCharacter(counter, ' ');
            drawHorizontalLineOfGivenCharacter(2 * (N - counter) - 1, '*');
            System.out.println();
        }

    }
    static void drawDiamond(int N){

        drawIsoscelesTriangle(N);
        drawReverseIsoscelesTriangle(N);
    }

    static void drawHorizontalLineOfGivenCharacter(int N, char symbol) {
        String output = "";
        for (int counter = 0; counter < N; counter++) {
            output += symbol;
        }
        System.out.print(output);
    }

    public static void main(String args[]) {
        System.out.println("IsoscelesTriangle");
        drawIsoscelesTriangle(5);

        System.out.println("Diamond");
        drawDiamond(5);

    }
}
