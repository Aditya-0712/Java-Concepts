package Quiz;
import java.util.Arrays;

public class Question {
    private final int id;
    private final String question;
    private final String[] options;
    private final String answer;

    public Question(String question, String[] options, String answer) {
        double temp = Math.random()*10000;
        this.id = (int) temp;
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public String getQuestion() {
        return question;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", options=" + Arrays.toString(options);
    }

}
