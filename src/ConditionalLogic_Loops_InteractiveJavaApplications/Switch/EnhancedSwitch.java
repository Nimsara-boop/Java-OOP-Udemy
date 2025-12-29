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

        int newSwitchValue = 2;
        //enhanced switch statement - MUST include a default statement

        switch (newSwitchValue){
            case 1 -> System.out.println("Value is 1");
            case 2 -> System.out.println("Value is 2");
            case 3, 4, 5 -> {
                System.out.println("Value is either 3, 4 or 5");
                System.out.println("Actually it was "+newSwitchValue);
            }
            default -> System.out.println("Value is not 1, 2, 3, 4 or 5");
            //gives a run time error without the default statement

        }
        String month = "XYZ";
        System.out.println(month+" belongs to the "+getQuarter(month)+" half of the year.");

        System.out.println(getHighestDivisible(67));

    }

    public static String getQuarter(String month){

        return switch(month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default ->{
                String badResponse = month+" is bad";
                yield badResponse;
                //yield keyword is used when u need to write more than one line of code for a condition. written inside curly braces.
            }
        };
    }

    //another example using yield keyword

    public static String getHighestDivisible(int number){
        int div;
        return switch(number){
            case 4-> {
                div = 2;
                yield "Highest divisible by 2";
            }
            case 6,9->{
                div = 3;
                yield "Highest divisible by 3";
            }
            case 8->{
                yield "highest divisible by 4";
            }
            case 10->{
                yield "Highest divisible by 5";
            }
            case 1, 2, 3, 5, 7 ->{
                yield "Highest divisible by "+number;
            }
            default ->{
                String badResponse = number+" is a bad number";
                yield badResponse;
            }
        };
    }

}