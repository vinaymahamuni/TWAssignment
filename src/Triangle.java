/**
 * Created by vinayam on 7/16/17.
 */
public class Triangle {

    static void drawOneAsterisk(){
        System.out.print("*");
    }

    static  void drawNHorizontalAsterisks(int N){
        String output="";
        for(int counter =0 ; counter < N ; counter++){
            output+="*";
        }
        System.out.print(output);
    }
    public static void main(String[] args){
            drawOneAsterisk();
            System.out.println();
            drawNHorizontalAsterisks(8);
    }
}
