//25. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

public class EvenDaysInAugust {
    public static void main(String[] args) {
        int totalDays = 31; // Total days in August
        int countEvenDays = 0;

        // Loop through the days of the month
        for (int day = 1; day <= totalDays; day++) {
            if (day % 2 == 0) { // Check if the day is even
                countEvenDays++;
            }
        }

        // Display the result
        System.out.println("Kunal can go out with his friends on " + countEvenDays + " even days in August.");
    }
}
