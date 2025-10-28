public class UnitConverter {

    /**
     * Convert from feet to meters
     * 
     * @param foot The value in feet
     * @return The equivalent value in meters
     */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    /**
     * Convert from meters to feet
     * 
     * @param meter The value in meters
     * @return The equivalent value in feet
     */
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        // Display the table for Feet to Meters
        System.out.printf("%-10s%-10s%n", "Feet", "Meters");
        System.out.println("--------------------");
        for (double feet = 1.0; feet <= 10.0; feet++) {
            System.out.printf("%-10.1f%-10.3f%n", feet, footToMeter(feet));
        }

        System.out.println("\n"); // Add a blank line for separation

        // Display the table for Meters to Feet
        System.out.printf("%-10s%-10s%n", "Meters", "Feet");
        System.out.println("--------------------");
        for (double meters = 20.0; meters <= 65.0; meters += 5.0) {
            System.out.printf("%-10.1f%-10.3f%n", meters, meterToFoot(meters));
        }
    }
}