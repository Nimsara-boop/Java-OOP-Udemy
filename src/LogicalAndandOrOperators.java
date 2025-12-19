public class LogicalAndandOrOperators {
    public static void main(String[] args){
        int firstScore = 90;
        int secondScore = 80;

        if ((firstScore>70) && (secondScore>70)){
            System.out.println("Excellent Scores");
        }
        if (firstScore>70 || secondScore>70){
            System.out.println("Good scores");
        }

    }
}
