package Expressions_CodeBlocks_Statements_MethodOverloading;

public class JavaOperatorPrecedenceChallenge {
    public static void main (String[] args){
        double value1 = 20.00;
        double value2 = 80.00;

        double sum1 = 100.00*(value1 + value2);

        double remainder = sum1 % 40.00;
        System.out.println(remainder);

        boolean check = remainder==0.00? true : false;
        System.out.println(check);

        if (!check){
            System.out.println("Got some remainder!");
        }
    }
}
