import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class CodeupExercises {


    public static void exc1(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Text Input");

        String x = input.nextLine();

        if(StringUtils.isNumeric(x)){
            System.out.println("Invalid");
        } else {
            System.out.println("x = " + x);
        }
    }




    public static void main(String[] args) {

        exc1();

//        String num = "2134";
//        String nonNum = "No number in here just the word three";
//        System.out.println(StringUtils.isNumeric(num));
//        System.out.println(StringUtils.isNumeric(nonNum));

        String casetest = "Does This Work?";
        System.out.println(StringUtils.swapCase(casetest));

        String x = "REDRUM";

        System.out.println(StringUtils.reverse(x));


    }
}
