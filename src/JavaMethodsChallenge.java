import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JavaMethodsChallenge {

    public int calculateHighScorePosition(int score){
        if (score>=1000) return 1;
        else if (1000>score && score>=500) return 2;
        else if (500>score && score>=100) return 3;
        else return 4;
    }
    public void displayHighScorePosition(String name, int position){
        System.out.println(name+" managed to get into position "+position+" on the score list");
    }

    public static void main(String[] args) {

        JavaMethodsChallenge challenge = new JavaMethodsChallenge();

        //ArrayList<Integer> scoresList = new ArrayList<>();
        Map<String, Integer> scoresList = new HashMap<String, Integer>();
        scoresList.put("Melody", 2500); scoresList.put("Tim", 1500); scoresList.put("Jonah", 1000); scoresList.put("Marley", 500); scoresList.put("Yennifer", 100); scoresList.put("Alex",25);

        for (Map.Entry<String, Integer> entry : scoresList.entrySet()){
            int position = challenge.calculateHighScorePosition(entry.getValue());
            challenge.displayHighScorePosition(entry.getKey(), position);
        }

    }
}
