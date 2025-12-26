package Expressions_CodeBlocks_Statements_MethodOverloading;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        long milesPerHour = 0;
        return (kilometersPerHour<0) ? -1 :
        (milesPerHour = Math.round(kilometersPerHour/1.609));
    }

    public static void printConversion(double kilometersPerHour){
        int kilometerPerHour = 0;
        System.out.println( (kilometersPerHour<0) ? "Invalid Value" : kilometersPerHour+" km/h = "+toMilesPerHour(kilometersPerHour)+"mi/h");
    }
}
