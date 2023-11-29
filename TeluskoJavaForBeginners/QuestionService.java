import java.util.Arrays;
import java.util.Scanner;

public class QuestionService {
    private Scanner sc = new Scanner(System.in);
    private Question[] questions;
    private byte i = 0;
    private int score = 0;
    private int noOfQuestion = 5;

    public QuestionService() {
        this.questions = new Question[noOfQuestion];
        loadQuestions();
    }

    private void loadQuestions() {
        String[] list = new ReadTextFile().getDataLines();
        String[] lineSplitted = new String[4];
        for (String line : list) {
            lineSplitted = line.split("\\|");
            populateQuestion(lineSplitted);
        }
        i = 0;
    }

    private void populateQuestion(String[] lineSplitted) {
        questions[i] = new Question();
        questions[i].setId(Byte.parseByte(lineSplitted[0]));
        questions[i].setQuestion(lineSplitted[1]);
        questions[i].setOptionArray(lineSplitted[2].split("\\*"));
        questions[i].setCorrectAnswer(lineSplitted[3]);
        i++;
    }

    public void startQuiz() {
        displayQuestion();
        System.out.println("(------------Your score is: " + score + " out of " + noOfQuestion + "------------\n\n\n\n");
        score = 0;
    }

    private void displayQuestion() {
        if (i == 5) {
            System.out.println("Thanks for playing!!!");
            return;
        }
        System.out.println("------------Question " + (i + 1) + "------------");
        System.out.println();
        System.out.println(questions[i].getQuestion());
        System.out.println();
        System.out.println(Arrays.toString(questions[i].getOptionArray()));
        System.out.println();
        System.out.println();
        System.out.println("type one option a/b/c/d then press Enter");
        if (sc.next().equals(questions[i].getCorrectAnswer())) {
            System.out.println("Correct!!!");
            score++;
            System.out.println("you got 1 point");
        } else
            System.out.println("Wrong Y_Y   Better luck next time :)");
        i++;
        displayQuestion();
    }

}