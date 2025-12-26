package Expressions_CodeBlocks_Statements_MethodOverloading.MethodOverloading;

public class OverloadedMethodChallenge {

    // inches -> Centimeter
    public static double convertToCentimeter(int inches){
        return inches*2.54;
    }

    public static double convertToCentimeters(int feet, int inches){
        return ((inches*2.54) + (feet*12*2.54));
    }
}
