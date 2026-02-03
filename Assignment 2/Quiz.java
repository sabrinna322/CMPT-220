import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) throws Exception {
        //Sabrinna Pesev | Finance | Computer Science
        
        //Creating a Scanner object named sc to read user input.
        Scanner sc = new Scanner(System.in);
         //This will track how many questions the user gets correct.
        int score = 0;

        //Question 1 & Following Input
        System.out.println("Q1: What is James Bond's code name?");
        String answer1 = sc.nextLine();

        //Using if/else to check the user's answer, and adds to the score if correct.
        if (answer1.equals("007")) {
            score += 1;
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong.");
        }

        //Question 2 & Following Input
        System.out.println("Q2: Which actor ploys Private Ryan in 'Saving Private Ryan?'");
        String answer2 = sc.nextLine();

        //Comparing strings, and adds to the score if correct.
        if (answer2.equals("Matt Damon")) {
            score += 1;
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong.");
        }

        //Question 3 & Following Input
        System.out.println("Q3: True or False: Toto was paid more than the Munchkins in the 'Wizard of Oz.'");
        boolean answer3 = sc.nextBoolean();

        //Checking the boolean response with an if/else statement.
        if (answer3 == true) {
            score += 1;
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong.");
        }

        //Displaying the final score out of 3. 
        System.out.println("You got " + score + " out of 3 correct.");
        }

        //What I learned:
        //I learned how to use if/else statements with variables (which is slightly different than Pytho) to create a quiz and track a user's score. 
    }
