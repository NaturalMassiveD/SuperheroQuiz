/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniquiz;
import java.util.Scanner;
/**
 *
 * @author teel6
 */
public class QuizTime {
    public static void main(String[] args) {
        Question q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19, q20,
                q21, q22, q23, q24, q25;
        String possible;
        int score = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the DC Comics superhero quiz!");
        
        System.out.println();
        q1 = new Question("What is the secret identity of the Batman?",
                        "Bruce Wayne");
        q1.setComplexity(1);
        
        q2 = new Question("What is the secret identity of the Golden Age Flash?",
                        "Jay Garrick");
        q2.setComplexity(5);
        
        q3 = new Question("What is the secret identity of the Silver and Bronze Age Flash?",
                        "Barry Allen");
        q3.setComplexity(5);
        
        q4 = new Question("How many Modern Age Flashes are there currently?",
                        "2");
        q4.setComplexity(3);
        
        q5 = new Question("Barry Allen is one, who is the other?",
                        "Wally West");
        q5.setComplexity(4);
        
        q6 = new Question("Who is the strongest Green Lantern?",
                        "Hal Jordan");
        q6.setComplexity(2);
        
        q7 = new Question("Who is the Batman's best villain?",
                        "Condiment King");
        q7.setComplexity(10);
        
        q8 = new Question("How many Jokers are there concurrently?",
                        "3");
        q8.setComplexity(7);
        
        q9 = new Question("What is Superman's weakness?",
                        "Kryptonite");
        q9.setComplexity(1);
        
        q10 = new Question("Does Batman eventually kill the Joker?",
                        "Yes");
        q10.setComplexity(1);
        
        q11 = new Question("What is the identity of Captain America?",
                        "Steve Rogers");
        q11.setComplexity(3);
        
        q12 = new Question("What makes Bruce Banner hulk out?",
                        "Anger");
        q12.setComplexity(2);
        
        q13 = new Question("Do Green Lanterns need to recharge their power rings?",
                        "Yes");
        q13.setComplexity(1);
        
        q14 = new Question("Is wood a weakness to Green Lanterns?",
                        "Yes");
        q14.setComplexity(5);
        
        q15 = new Question("What is the other weakness?",
                        "Fear");
        q15.setComplexity(3);
        
        q16 = new Question("Can Doomsday ever truly die?",
                        "No");
        q16.setComplexity(2);
        
        q17 = new Question("What is Superman's most iconic hairstyle?",
                        "Mullet");
        q17.setComplexity(10);
        
        q18 = new Question("Which Robin was killed by the Joker?",
                        "Jason Todd");
        q18.setComplexity(5);
        
        q19 = new Question("Who is Batman's biological son?",
                        "Damian");
        q19.setComplexity(7);
        
        q20 = new Question("Is Catwoman his mother?",
                        "No");
        q20.setComplexity(7);
        
        q21 = new Question("Who is it?",
                        "Talia Al Ghul");
        q21.setComplexity(7);
        
        q22 = new Question("What is another name for Ra'as Al Ghul?",
                        "The Demon");
        q22.setComplexity(5);
        
        q23 = new Question("Who is the Flashes greatest villain?",
                        "Reverse Flash");
        q23.setComplexity(4);
        
        q24 = new Question("Who was Cyborg before the accident?",
                        "Victor Stone");
        q24.setComplexity(3);
        
        q25 = new Question("Who broke the Batman?",
                        "Bane");
        q25.setComplexity(4);
        
        System.out.print(q1.getQuestion());
        System.out.println(" (Level: " + q1.getComplexity() + ")");
        possible = sc.nextLine();
        if (q1.answerCorrect(possible)){
           System.out.println("Correct");
           score = score + 1;
        }
        else
           System.out.println("No, the answer is " + q1.getAnswer());

        System.out.println();
        System.out.print(q2.getQuestion());
        System.out.println(" (Level: " + q2.getComplexity() + ")");
        possible = sc.nextLine();
        if (q2.answerCorrect(possible)){
           System.out.println("Correct");
           score = score + 1;
        }
        else
           System.out.println("No, the answer is " + q2.getAnswer());
        
        System.out.println();
        System.out.print(q3.getQuestion());
        System.out.println(" (Level: " + q3.getComplexity() + ")");
        possible = sc.nextLine();
        if (q3.answerCorrect(possible)){
           System.out.println("Correct");
           score = score + 1;
        }
        else
           System.out.println("No, the answer is " + q3.getAnswer());

        System.out.println();
        System.out.print(q4.getQuestion());
        System.out.println(" (Level: " + q4.getComplexity() + ")");
        possible = sc.nextLine();
        if (q4.answerCorrect(possible)){
           System.out.println("Correct");
           score = score + 1;
        }
        else
           System.out.println("No, the answer is " + q4.getAnswer());
        
        System.out.println();
        System.out.print(q5.getQuestion());
        System.out.println(" (Level: " + q5.getComplexity() + ")");
        possible = sc.nextLine();
        if (q5.answerCorrect(possible)){
           System.out.println("Correct");
           score = score + 1;
        }
        else
           System.out.println("No, the answer is " + q5.getAnswer());
        
        System.out.println();
        System.out.print(q6.getQuestion());
        System.out.println(" (Level: " + q6.getComplexity() + ")");
        possible = sc.nextLine();
        if (q6.answerCorrect(possible)){
           System.out.println("Correct");
           score = score + 1;
        }
        else
           System.out.println("No, the answer is " + q6.getAnswer());

        System.out.println();
        System.out.print(q7.getQuestion());
        System.out.println(" (Level: " + q7.getComplexity() + ")");
        possible = sc.nextLine();
        if (q7.answerCorrect(possible)){
           System.out.println("Correct");
           score = score + 1;
        }
        else
           System.out.println("No, the answer is " + q7.getAnswer());
        
        System.out.println();
        System.out.print(q8.getQuestion());
        System.out.println(" (Level: " + q8.getComplexity() + ")");
        possible = sc.nextLine();
        if (q8.answerCorrect(possible)){
           System.out.println("Correct");
           score = score + 1;
        }
        else
           System.out.println("No, the answer is " + q8.getAnswer());

        System.out.println();
        System.out.print(q9.getQuestion());
        System.out.println(" (Level: " + q9.getComplexity() + ")");
        possible = sc.nextLine();
        if (q9.answerCorrect(possible)){
           System.out.println("Correct");
           score = score + 1;
        }
        else
           System.out.println("No, the answer is " + q9.getAnswer());
        
        System.out.println();
        System.out.print(q10.getQuestion());
        System.out.println(" (Level: " + q10.getComplexity() + ")");
        possible = sc.nextLine();
        if (q10.answerCorrect(possible)){
           System.out.println("Correct");
           score = score + 1;
        }
        else
           System.out.println("No, the answer is " + q10.getAnswer());

        System.out.println();
        System.out.print(q11.getQuestion());
        System.out.println(" (Level: " + q11.getComplexity() + ")");
        possible = sc.nextLine();
        if (q11.answerCorrect(possible)){
           System.out.println("Correct");
           score = score + 1;
        }
        else
           System.out.println("No, the answer is " + q11.getAnswer());

        System.out.println();
        System.out.print(q12.getQuestion());
        System.out.println(" (Level: " + q12.getComplexity() + ")");
        possible = sc.nextLine();
        if (q12.answerCorrect(possible)){
           System.out.println("Correct");
           score = score + 1;
        }
        else
           System.out.println("No, the answer is " + q12.getAnswer());
        
        System.out.println();
        System.out.print(q13.getQuestion());
        System.out.println(" (Level: " + q13.getComplexity() + ")");
        possible = sc.nextLine();
        if (q13.answerCorrect(possible)){
           System.out.println("Correct");
           score = score + 1;
        }
        else
           System.out.println("No, the answer is " + q13.getAnswer());

        System.out.println();
        System.out.print(q14.getQuestion());
        System.out.println(" (Level: " + q14.getComplexity() + ")");
        possible = sc.nextLine();
        if (q14.answerCorrect(possible)){
           System.out.println("Correct");
           score = score + 1;
        }
        else
           System.out.println("No, the answer is " + q14.getAnswer());
        
        System.out.println();
        System.out.print(q15.getQuestion());
        System.out.println(" (Level: " + q15.getComplexity() + ")");
        possible = sc.nextLine();
        if (q15.answerCorrect(possible)){
           System.out.println("Correct");
           score = score + 1;
        }
        else
           System.out.println("No, the answer is " + q15.getAnswer());
        
        System.out.println();
        System.out.print(q16.getQuestion());
        System.out.println(" (Level: " + q16.getComplexity() + ")");
        possible = sc.nextLine();
        if (q16.answerCorrect(possible)){
           System.out.println("Correct");
           score = score + 1;
        }
        else
           System.out.println("No, the answer is " + q16.getAnswer());

        System.out.println();
        System.out.print(q17.getQuestion());
        System.out.println(" (Level: " + q17.getComplexity() + ")");
        possible = sc.nextLine();
        if (q17.answerCorrect(possible)){
           System.out.println("Correct");
           score = score + 1;
        }
        else
           System.out.println("No, the answer is " + q17.getAnswer());
        
        System.out.println();
        System.out.print(q18.getQuestion());
        System.out.println(" (Level: " + q18.getComplexity() + ")");
        possible = sc.nextLine();
        if (q18.answerCorrect(possible)){
           System.out.println("Correct");
           score = score + 1;
        }
        else
           System.out.println("No, the answer is " + q18.getAnswer());

        System.out.println();
        System.out.print(q19.getQuestion());
        System.out.println(" (Level: " + q19.getComplexity() + ")");
        possible = sc.nextLine();
        if (q19.answerCorrect(possible)){
           System.out.println("Correct");
           score = score + 1;
        }
        else
           System.out.println("No, the answer is " + q19.getAnswer());
        
        System.out.println();
        System.out.print(q20.getQuestion());
        System.out.println(" (Level: " + q20.getComplexity() + ")");
        possible = sc.nextLine();
        if (q20.answerCorrect(possible)){
           System.out.println("Correct");
           score = score + 1;
        }
        else
           System.out.println("No, the answer is " + q20.getAnswer());
        
        System.out.println();
        System.out.print(q21.getQuestion());
        System.out.println(" (Level: " + q21.getComplexity() + ")");
        possible = sc.nextLine();
        if (q21.answerCorrect(possible)){
           System.out.println("Correct");
           score = score + 1;
        }
        else
           System.out.println("No, the answer is " + q21.getAnswer());

        System.out.println();
        System.out.print(q22.getQuestion());
        System.out.println(" (Level: " + q22.getComplexity() + ")");
        possible = sc.nextLine();
        if (q22.answerCorrect(possible)){
           System.out.println("Correct");
           score = score + 1;
        }
        else
           System.out.println("No, the answer is " + q22.getAnswer());
        
        System.out.println();
        System.out.print(q23.getQuestion());
        System.out.println(" (Level: " + q23.getComplexity() + ")");
        possible = sc.nextLine();
        if (q23.answerCorrect(possible)){
           System.out.println("Correct");
           score = score + 1;
        }
        else
           System.out.println("No, the answer is " + q23.getAnswer());

        System.out.println();
        System.out.print(q24.getQuestion());
        System.out.println(" (Level: " + q24.getComplexity() + ")");
        possible = sc.nextLine();
        if (q24.answerCorrect(possible)){
           System.out.println("Correct");
           score = score + 1;
        }
        else
           System.out.println("No, the answer is " + q24.getAnswer());
        
        System.out.println();
        System.out.print(q25.getQuestion());
        System.out.println(" (Level: " + q25.getComplexity() + ")");
        possible = sc.nextLine();
        if (q25.answerCorrect(possible)){
           System.out.println("Correct");
           score = score + 1;
        }
        else
           System.out.println("No, the answer is " + q25.getAnswer());
        
        System.out.println();
        System.out.println("You got a score of " + score + " and a percentage of " + (score * 4) + "%");
    }
}
