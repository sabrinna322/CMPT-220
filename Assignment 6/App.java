import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Minutes worked out:");
        int minutes = sc.nextInt();

        System.out.println("Your weight:");
        double weight = sc.nextDouble();

        sc.nextLine();

        System.out.println("Workout type (cardio/strength):");
        String type = sc.nextLine();

        workoutTracker tracker = new workoutTracker(minutes, weight, type);

        System.out.println("Calories burned: " + tracker.calcCals());
        System.out.println(tracker.feedback());

        sc.close();
    }
}
