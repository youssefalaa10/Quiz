/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz_app;

/**
 *
 * @author youss
 */
public class Question {
       private String questionText;
    String[] options;
    private int rightAns;

    public Question(String questionText, String[] options, int rightAns) {
        this.questionText = questionText;
        this.options = options;
        this.rightAns = rightAns;
    }

    /**
     * Displays the question and options.
     */
    public void displayQuestion() {
        System.out.println(questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    /**
     * Checks if the given answer is correct.
     * 
     * @param answer The answer to be checked.
     * @return True if the answer is correct, otherwise false.
     */
    public boolean isCorrect(int answer) {
        return answer == rightAns + 1;
    }
}
