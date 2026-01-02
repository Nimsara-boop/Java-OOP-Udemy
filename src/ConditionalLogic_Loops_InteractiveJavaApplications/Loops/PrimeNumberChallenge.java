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
        return false;
    }

    public static void printPrimeNumbers(){

        int count=0;
        int i =0;

        for (i = 2; i<=1000; i++){
            boolean hasDivisor = false;
            for (int j=2; j<=i/2; j++ ){
                if (i%j==0) {
                    hasDivisor = true;
                }
            }
            if (hasDivisor==false){
                System.out.print(i+" ");
                count++;
            }continue;
        }
        System.out.println(" ");
        System.out.println(count+" prime numbers under "+(i-1));

    }

    public static void main(String[] args) {
        printPrimeNumbers();
    }

}
