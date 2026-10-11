import java.util.Scanner;

class NumberStatistics {
    private double[] numbers;

    NumberStatistics(double[] numbers) {
        this.numbers = numbers;
    }

    double calculateAverage() {
        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++) sum += numbers[i];
        return sum / numbers.length;
    }

    int countAboveAverage() {
        double average = calculateAverage();
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average) count++;
        }
        return count;
    }
}

public class AverageAboveAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }
        NumberStatistics statistics = new NumberStatistics(numbers);
        System.out.println("Average: " + statistics.calculateAverage());
        System.out.println("Numbers above average: " + statistics.countAboveAverage());
        scanner.close();
    }
}
