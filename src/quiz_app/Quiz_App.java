/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz_app;

import java.util.Scanner;

/**
 *
 * @author youss
 */
public class Quiz_App {

    public static void main(String[] args) {
//        ------------------------ First Method --------------------------
//------------------------ Put Questions first then Answer (Way)--------------------------------
//       Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your name: ");
//        User user = new User(scanner.nextLine());
//
//        Quiz quiz = new Quiz();
//
//        System.out.print("How many questions do you want to add? ");
//        int numQuestions = Integer.parseInt(scanner.nextLine());
//
//        for (int i = 0; i < numQuestions; i++) {
//            System.out.println("Enter details for question " + (i + 1) + ":");
//
//            System.out.print("Question text: ");
//            String questionText = scanner.nextLine();
//
//            String[] options = new String[4];
//            for (int j = 0; j < 4; j++) {
//                System.out.print("Option " + (j + 1) + ": ");
//                options[j] = scanner.nextLine();
//            }
//
//            int rightAns = -1;
//            while (rightAns < 0 || rightAns >= 4) {
//                System.out.print("Enter the correct option number (1-4): ");
//                rightAns = Integer.parseInt(scanner.nextLine()) - 1;
//            }
//
//            quiz.addQuestion(new Question(questionText, options, rightAns));
//        }
//
//        quiz.takeQuiz(user);
//       ------------------------ Second Method --------------------------
//------------ Quiz start Ask-----------------------------------
   Quiz quiz = new Quiz();
    Scanner scanner = new Scanner(System.in);
         System.out.print("Enter your name: ");
        User user = new User(scanner.nextLine());

        String[] options1 = {"Brazil", "Germany", "Argentina", "Italy"};
        String[] options2 = {"Cristiano Ronaldo", "Lionel Messi", "Pele", "Maradona"};
        String[] options3 = {"Real Madrid", "Barcelona", "Bayern Munich", "Manchester United"};

        quiz.addQuestion(new Question("Which country has won the most FIFA World Cups?", options1, 0));
        quiz.addQuestion(new Question("Who is the Greatest of All Time", options2, 1));
        quiz.addQuestion(new Question("Which club has won the most UEFA Champions League titles?", options3, 0));

        quiz.takeQuiz(user);
    }
    
}
