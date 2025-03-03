import java.util.Scanner;
/**
 * Write a description of class AwardPointsCalculator here.
 * @author Maheer Ahmad
 */
public class AwardPointsCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //taking input from user here
        System.out.print("Enter the amount spent (in euros): ");
        double euroSpent = scanner.nextDouble();
        //declaring variables 
        int awardPoints = calculateAwardPoints(euroSpent);
        double voucherAmount = calculateVoucherAmount(awardPoints);
        int pointsToCarryOver = awardPoints % 100;
        System.out.println("You have earned " + awardPoints + " points.");
        System.out.println("Discount earned: " + voucherAmount + " Euros.");
        System.out.println("Points to carry over: " + pointsToCarryOver);
    }

    public static int calculateAwardPoints(double euroSpent) {
        return (int) euroSpent;
    }

    public static double calculateVoucherAmount(int awardPoints) {
        double voucherAmount = 0;
        if (awardPoints >= 600) {
            voucherAmount += 4;
        }
        if (awardPoints >= 300) {
            voucherAmount += 2.5;
        }
        if (awardPoints >= 100) {
            voucherAmount += 1;
        }
        return voucherAmount;
    }
}

