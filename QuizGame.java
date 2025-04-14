import java.util.*;

public class QuizGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Question> questions = QuestionBank.getQuestions();
        Collections.shuffle(questions);
        int score = 0;

        System.out.print("Enter your name: ");
        String playerName = sc.nextLine();

        System.out.println("\nWelcome to the Quiz, " + playerName + "!");
        System.out.println("You have 10 seconds for each question.\n");

        for (Question q : questions) {
            System.out.println(q.question);
            System.out.println("A. " + q.optionA);
            System.out.println("B. " + q.optionB);
            System.out.println("C. " + q.optionC);
            System.out.println("D. " + q.optionD);

            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                public void run() {
                    System.out.println("\n⏰ Time's up!");
                    System.exit(0);
                }
            };

            timer.schedule(task, 10000);  // 10 seconds

            System.out.print("Enter your answer (A/B/C/D): ");
            String ans = sc.nextLine();
            timer.cancel();

            String selected = switch (ans.toUpperCase()) {
                case "A" -> q.optionA;
                case "B" -> q.optionB;
                case "C" -> q.optionC;
                case "D" -> q.optionD;
                default -> "";
            };

            if (q.isCorrect(selected)) {
                System.out.println("✅ Correct!\n");
                score += 10;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + q.correctAnswer + "\n");
            }
        }

        System.out.println("🎉 Quiz Completed! Your score: " + score);
        LeaderboardManager.saveScore(playerName, score);
        LeaderboardManager.displayLeaderboard();
    }
}
