package ConditionalLogic_Loops_InteractiveJavaApplications.Switch;

public class SwitchChallengeNATO {


    public static void main(String[] args) {
        char letter= 'j';
        System.out.println(getNATO(letter));
    }


    public static String getNATO(char letter) {

        return switch (letter) {
            case ('A')-> "A-Able";
            case('B') ->"B-Baker";
            case('C')->" C-Charlie";
            case ('D')->"D-Dog";
            case('E')->"E-Easy";
            default -> letter+ " is not a letter between A-E";

        };
    }
}
