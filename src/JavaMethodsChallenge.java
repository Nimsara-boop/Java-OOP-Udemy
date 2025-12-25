import java.util.ArrayList;

public class JavaMethodsChallenge {

    public int calculateHighScorePosition(int score){
        if (score>=1000) return 1;
        else if (1000>score && score>=500) return 2;
        else if (500>score && score>=100) return 3;
        else return 4;
    }
    public void displayHighScorePosition(int position){
        System.out.println("managed to get into position "+position+" on the score list");
    }

    public static void main(String[] args) {
        JavaMethodsChallenge challenge = new JavaMethodsChallenge();
        ArrayList<Integer> scoresList = new ArrayList<>();
        scoresList.add(1500); scoresList.add(1000); scoresList.add(500); scoresList.add(100); scoresList.add(25);
        for (int score : scoresList){
            int position = challenge.calculateHighScorePosition(score);
            challenge.displayHighScorePosition(position);
        }

    }
}
