public class Conversion {

    /**
     * Convert from feet to meters
     */
    public static double footToMeter(double foot) {
        // The formula is: meter = 0.305 * foot
        return 0.305 * foot;
    }

    /**
     * Convert from meters to feet
     */
    public static double meterToFoot(double meter) {
        // The formula is: foot = 3.279 * meter
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        // Display the table header
        System.out.printf("%-10s%-10s|  %-10s%-10s%n", "Feet", "Meters", "Meters", "Feet");
        System.out.println("--------------------------------------------------");

        // Generate and display the table rows
        for (int feet = 1, meters = 20; feet <= 10; feet++, meters += 5) {
            // Convert feet to meters
            double metersValue = footToMeter(feet);
            // Convert meters to feet
            double feetValue = meterToFoot(meters);

            // Display the row with two decimal places for the results
            System.out.printf("%-10d%-10.3f|  %-10d%-10.3f%n",
                    feet, metersValue, meters, feetValue);
        }
    }
}
