public class PositiveNegativeOrZero {
    public static void checkNumber(int number){

//        String result = "zero";
//        if (number>0) result = "positive";
//        else if (number<0) result = "negative";
//        System.out.println(result);


        System.out.println( (number>0) ? "positive" : ((number<0)? "negative" :
        ("zero")));
    }
}
