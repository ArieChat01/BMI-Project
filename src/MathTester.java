import java.util.Scanner;

public class MathTester {

    public static void main(String[] args) {

        Scanner keyboard;
        String greeting;
        String explanation;
        String userHeightInchesQuestion;
        String userHeightFeetQuestion;
        String userWeightPoundsQuestion;
        String userHeightFeet, userHeightInches;

        greeting = "Hello there!";
        explanation = "This program will allow you calculate your body mass index through a few simple steps.\n Let's begin.";
        userHeightFeetQuestion = "What is you height (only the feet)?";
        userHeightInchesQuestion = "Now, what is your height (only the inches)?";
        userWeightPoundsQuestion = "What is your weight (in pounds)?";
        keyboard = new Scanner(System.in);

        System.out.println(greeting);
        System.out.println(explanation);

        System.out.println(userHeightFeetQuestion);
        userHeightFeet = keyboard.nextLine();

        String numberFeet = userHeightFeet;
        int resultOne = Integer.parseInt(numberFeet);
        System.out.print("Okay, so that is ");
        resultOne*=12;
        System.out.println(resultOne+ " "+ "inches");

        System.out.println(userHeightInchesQuestion);
        userHeightInches = keyboard.nextLine();
        String numberInches = userHeightInches;
        int resultTwo = Integer.parseInt(numberInches);
        System.out.println("So you are " + (resultOne+resultTwo)+" inches tall.");

        System.out.println(userWeightPoundsQuestion);
    }
}
