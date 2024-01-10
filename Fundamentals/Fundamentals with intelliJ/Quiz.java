package bites.examples;

public class Quiz {
    String QuestionOne;
    String QuestionTwo;
    public Quiz(String QuestionOne, String QuestionTwo) {
        this.QuestionOne = QuestionOne;
        this.QuestionTwo = QuestionTwo;
    }

    public String getQuestionOne(){
        return this.QuestionOne;
    }

    public String getQuestionTwo(){
        return this.QuestionTwo;
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz("What is the capital of Burkina Faso?", "What is the capital of Bhutan?");
        System.out.println("This is Question One: " + quiz.getQuestionOne());
        System.out.println("This is Question Two: " + quiz.getQuestionTwo());
    }
}
