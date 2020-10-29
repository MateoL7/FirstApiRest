package dto;

public class Answer {

    private String uid;
    private double answer;

    public Answer() {
    }

    public Answer(String uid, double answer) {
        this.uid = uid;
        this.answer = answer;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }
}
