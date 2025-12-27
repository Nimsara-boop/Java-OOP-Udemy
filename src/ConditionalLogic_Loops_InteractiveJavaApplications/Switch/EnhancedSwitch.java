package ConditionalLogic_Loops_InteractiveJavaApplications.Switch;

public class EnhancedSwitch {

    public static void main(String[] args) {
        //regular traditional switch

        int switchValue = 2;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value was either 3, 4 or 5");
                System.out.println("Actually it was " + switchValue);
                break;
            default:
                System.out.println("was not 1,2,3,4 or 5");

        }
    }
}