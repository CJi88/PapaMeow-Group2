import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import org.knowm.xchart.*;

public class SimpleMachineExercise {

    public static void main(String[] args) {

        // Prompt the user to input the velocity and time
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the velocity in meters per second: ");
        double velocity = input.nextDouble();
        System.out.print("Enter the time in seconds: ");
        double time = input.nextDouble();
        scanner.close();

        // Calculate the distance using the formula: distance = velocity * time
        double distance = velocity * time;

        // Plot the graph of the object;s position over time
        List<Double> timeData = new ArrayList<>();
        List<Double> positionData = new ArrayList<>();
        for (double t = 0; t <= time; t += 0.1) {
            timeData.add(t);
            positionData.add(velocity * t);
        }

        XYChart chart = QuickChart.getChart("Position vs Time", "Time (s)", "Position (m)", "Position", timeData,
                positionData);
        new SwingWrapper<>(chart).displayChart();

        // Output the distance traveled by the object
        System.out.println("The distance traveled is " + distance + " meters");
    }
}
