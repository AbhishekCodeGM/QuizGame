public class Question {
    String question, optionA, optionB, optionC, optionD, correctAnswer;

    public Question(String question, String a, String b, String c, String d, String correct) {
        this.question = question;
        this.optionA = a;
        this.optionB = b;
        this.optionC = c;
        this.optionD = d;
        this.correctAnswer = correct;
    }

    public boolean isCorrect(String answer) {
        return correctAnswer.equalsIgnoreCase(answer);
    }
}
