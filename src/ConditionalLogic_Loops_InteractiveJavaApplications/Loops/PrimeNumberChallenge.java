package ConditionalLogic_Loops_InteractiveJavaApplications.Loops;

public class PrimeNumberChallenge {
    public static boolean isPrimeNumber(int number){
        if (number<=2){
            return true;
        }
        for (int divisor = 2 ; divisor<number; divisor++){
            if (number%divisor==0){
                return false;
            }
            else return true;
        }
    }
}
