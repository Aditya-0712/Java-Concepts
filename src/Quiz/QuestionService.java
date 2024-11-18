package Quiz;
import java.util.Scanner;

public class QuestionService {
    public Question[] questions = new Question[5];
    private final String[] answers = new String[5];

    public QuestionService(){
        questions[0] = new Question("What is 2+5 ?", new String[]{"2", "4", "5", "7"}, "7" );
        questions[1] = new Question("What is 1+1 ?", new String[]{"2", "4", "5", "7"}, "2" );
        questions[2] = new Question("What is 2+2 ?", new String[]{"2", "4", "5", "7"}, "4" );
        questions[3] = new Question("What is 2+3 ?", new String[]{"2", "4", "5", "7"}, "5" );
        questions[4] = new Question("What is 3+4 ?", new String[]{"2", "4", "5", "7"}, "7" );
    }

    public void start(){
        Scanner sc = new Scanner(System.in);
        int i=0;
        for (Question question: questions){
            System.out.println(question);
            System.out.print("Your answer: ");
            answers[i++] = sc.nextLine();
        }
    }

    private int calculateResult(){
        int i=0, score=0;
        for (Question question: this.questions){
            if (question.getAnswer().equals(answers[i++])){
                score++;
            }
        }

        return score;
    }

    public void showResult(){
        int finalScore = calculateResult();
        int i=0;
        for (Question question: this.questions){
            System.out.println("\n" + question.getQuestion());
            System.out.println("Correct answer: " + question.getAnswer());
            System.out.println("Your answer: " + answers[i++]);
        }

        System.out.println("\nYour final score is "+finalScore);
    }
}
