/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz_app;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author youss
 */
public class Quiz {
     private ArrayList<Question> questions;

    /**
     * Constructor to initialize an empty quiz.
     */
    public Quiz() {
        questions = new ArrayList<>();
    }

  
    public void addQuestion(Question question) {
        questions.add(question);
    }

 
    public void takeQuiz(User user) {
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            question.displayQuestion();
            System.out.print("Your answer: ");
            int answer = -1;

            try {
                answer = Integer.parseInt(scanner.nextLine());
                if (answer < 1 || answer > question.options.length) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid option number.");
                continue;
            }

            if (question.isCorrect(answer)) {
                score++;
            }
        }

        user.setScore(score);
        System.out.println("Quiz completed. Your score: " + score + "/" + questions.size());
    }
}
