import java.util.Scanner;

public class MathTester {

    public static void main(String[] args) {

        Scanner keyboard;
        String greeting;
        String explanation;
        String userHeightInchesQuestion;
        String userHeightFeetQuestion;
        String userWeightPoundsQuestion;
        String userHeightFeet, userHeightInches, userWeightPounds;

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
        int resultFeet = Integer.parseInt(numberFeet);
        System.out.print("Okay, so that is ");
        resultFeet*=12;
        System.out.println(resultFeet+ " "+ "inches");

        System.out.println(userHeightInchesQuestion);
        userHeightInches = keyboard.nextLine();
        String numberInches = userHeightInches;
        int resultInches = Integer.parseInt(numberInches);
        System.out.println("So you are " + (resultFeet+resultInches)+" inches tall.");

        float resultHeightTotal;
        resultHeightTotal = resultFeet+resultInches;
        resultHeightTotal*=0.0254;
        System.out.println("That converts to " +resultHeightTotal+ " meters tall.");


        System.out.println(userWeightPoundsQuestion);
        userWeightPounds = keyboard.nextLine();
        String numberpounds = userWeightPounds;
        float resultWeightTotal = Integer.parseInt(numberpounds);
        System.out.println("So your weight of " +resultWeightTotal+ " is then converted into");

        resultWeightTotal*=0.45359237;
        System.out.println(resultWeightTotal + " kilograms");
        System.out.println("Finally, your weigh is divided by you height squared and...");

        System.out.println(" ");
        System.out.println("\\ \\ \\ \\ \\ \\ \\ Results \\ \\ \\ \\ \\ \\ ");
        System.out.println(" ");

        float bodyMassIndex;
        bodyMassIndex = resultHeightTotal/(resultWeightTotal*resultWeightTotal);
        System.out.println("Your Body Mass Index is... " + bodyMassIndex + "!");



    }
}
