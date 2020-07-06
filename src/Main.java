import java.util.Scanner;

/**
 * Created by KPS on 7/6/2020.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a decimal number :");
        int decimal = scanner.nextInt();
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String string_num = "";
        while (decimal>0){
            string_num = hex[(decimal%16)]+string_num;
            decimal=decimal/16;
            }
            System.out.println(string_num);


    }
}
