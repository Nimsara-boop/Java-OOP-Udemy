package ConditionalLogic_Loops_InteractiveJavaApplications.Switch;

public class DayOfTheWeekChallenge {
    public static void main(String[] args) {
        System.out.println(printDayOfWeek(0));
        System.out.println(printDayOfWeek(1));
        System.out.println(printDayOfWeek(2));
        System.out.println(printDayOfWeek(3));
        System.out.println(printDayOfWeek(4));
        System.out.println(printDayOfWeek(5));
        System.out.println(printDayOfWeek(6));
        System.out.println(printDayOfWeek(7));

    }

    public static String printDayOfWeek(int dayNumber){
        String dayOfTheWeek;
        return switch(dayNumber){
            case 0-> {
                dayOfTheWeek = "Sunday";
                yield dayNumber+" "+dayOfTheWeek;
            }
            case 1-> {
                dayOfTheWeek = "Monday";
                yield dayNumber+" "+dayOfTheWeek;
            }
            case 2-> {
                dayOfTheWeek = "Tuesday";
                yield dayNumber+" "+dayOfTheWeek;
            }
            case 3-> {
                dayOfTheWeek = "Wednesday";
                yield dayNumber+" "+dayOfTheWeek;
            }
            case 4-> {
                dayOfTheWeek = "Thursday";
                yield dayNumber+" "+dayOfTheWeek;
            }
            case 5-> {
                dayOfTheWeek = "Friday";
                yield dayNumber+" "+dayOfTheWeek;
            }
            case 6-> {
                dayOfTheWeek = "Saturday";
                yield dayNumber+" "+dayOfTheWeek;
            }
            default->{
                String bad = "Invalid Day";
                yield bad;
            }
        };
    }
}
