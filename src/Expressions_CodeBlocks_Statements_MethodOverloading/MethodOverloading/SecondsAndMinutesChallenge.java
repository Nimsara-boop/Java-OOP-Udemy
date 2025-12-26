package Expressions_CodeBlocks_Statements_MethodOverloading.MethodOverloading;

public class SecondsAndMinutesChallenge {
    public static String getDurationString(int seconds){
        if (seconds>=0){
        int hours = (int) (seconds/3600);
        int minutes = (int) ((seconds%3600)/60);
        int remainingSeconds = (int) ((seconds%3600)%60);

        return hours+"h "+minutes+"m "+remainingSeconds+"s";
        }
        else return "Invalid input.";
    }
    public static String getDurationString(int minutes, int seconds){
        if (minutes>=0 && seconds>=0 && seconds<=59) {
            int totalSeconds = minutes * 60 + seconds;
            return getDurationString(totalSeconds);
        }
        else return "Invalid input";
    }
}
