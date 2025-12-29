package ConditionalLogic_Loops_InteractiveJavaApplications.Switch;

public class NumberInWord {
    public static void printNumberInWord(int number){
        String word = switch(number){
            case 0 -> "ZERO"; case 6 -> "SIX";
            case 1-> "ONE"; case 7->"SEVEN";
            case 2 -> "TWO"; case 8-> "EIGHT";
            case 3 -> "THREE"; case 9 -> "NINE";
            case 4 ->"FOUR";
            case 5 -> "FIVE";
            default ->"OTHER";
        };
        System.out.println(word);
    }
}
