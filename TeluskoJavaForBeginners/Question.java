public class Question {
    private byte id;
    private String question = "";
    private String[] optionArray = new String[4];
    private String correctAnswer = "";

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getOptionArray() {
        return optionArray;
    }

    public void setOptionArray(String[] answerArray) {
        this.optionArray = answerArray;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
