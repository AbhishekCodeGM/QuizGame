import java.io.*;
import java.util.*;

public class LeaderboardManager {
    private static final String FILE_NAME = "leaderboard.txt";

    public static void saveScore(String name, int score) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            bw.write(name + ":" + score);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error saving score: " + e.getMessage());
        }
    }

    public static void displayLeaderboard() {
        System.out.println("\n=== Leaderboard ===");
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            List<String> scores = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                scores.add(line);
            }
            scores.sort((a, b) -> Integer.compare(
                Integer.parseInt(b.split(":")[1]),
                Integer.parseInt(a.split(":")[1])
            ));
            for (String scoreLine : scores) {
                System.out.println(scoreLine.replace(":", " - Score: "));
            }
        } catch (IOException e) {
            System.out.println("Error reading leaderboard: " + e.getMessage());
        }
    }
}

