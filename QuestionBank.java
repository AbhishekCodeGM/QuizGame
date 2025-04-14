import java.util.*;

public class QuestionBank {
    public static List<Question> getQuestions() {
        List<Question> list = new ArrayList<>();

        list.add(new Question("Which keyword is used to inherit a class in Java?", "extends", "implements", "inherit", "instanceof", "extends"));
        list.add(new Question("Which of the following is not a primitive data type in Java?", "int", "String", "char", "boolean", "String"));
        list.add(new Question("Which method is the entry point of any Java program?", "start()", "run()", "main()", "execute()", "main()"));
        list.add(new Question("What is the default value of a boolean variable in Java?", "true", "false", "0", "null", "false"));
        list.add(new Question("Which access modifier makes a member accessible only within its own class?", "public", "protected", "private", "default", "private"));
        list.add(new Question("Which of the following is used to handle exceptions in Java?", "throw", "catch", "try-catch", "error", "try-catch"));
        list.add(new Question("What is the size of an int variable in Java?", "2 bytes", "4 bytes", "8 bytes", "Depends on system", "4 bytes"));
        list.add(new Question("Which class is the parent of all classes in Java?", "Object", "Class", "Main", "Base", "Object"));
        list.add(new Question("Which keyword is used to define a constant in Java?", "const", "define", "static", "final", "final"));
        list.add(new Question("Which collection class does not allow duplicates?", "ArrayList", "Vector", "HashSet", "LinkedList", "HashSet"));

        return list;
    }
}
