package daniel.martinsson.testtesttesttesttest;

/**
 * Created by danielmartinsson on 2017-11-20.
 */

public class Questions {

    private String category;
    private String question;
    private String trueAnswer;
    private String falseAnswer;
    private String answer;

    public Questions(String category, String question, String trueAnswer, String falseAnswer, String answer) {
        this.category = category;
        this.question = question;
        this.trueAnswer = trueAnswer;
        this.falseAnswer = falseAnswer;
        this.answer = answer;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getTrueAnswer() {
        return trueAnswer;
    }

    public void setTrueAnswer(String trueAnswer) {
        this.trueAnswer = trueAnswer;
    }

    public String getFalseAnswer() {
        return falseAnswer;
    }

    public void setFalseAnswer(String falseAnswer) {
        this.falseAnswer = falseAnswer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
