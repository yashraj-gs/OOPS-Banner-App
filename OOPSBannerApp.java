/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 *
 * This use case improves UC3 by using a String array to store banner lines
 * and iterating through them with a loop to eliminate repetitive print
 * statements and improve modularity and reusability.
 *
 * @author Developer
 * @version 4
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Step 1: Create a String array to store the banner lines (7 lines)
        String[] lines = new String[7];

        // Step 2: Populate each line of the array using String.join()
        lines[0] = String.join(" ", " *** ", " *** ", " ***** ", " ***** ");
        lines[1] = String.join(" ", "*   *", "*   *", " *   * ", " *     ");
        lines[2] = String.join(" ", "*   *", "*   *", " ***** ", " ****  ");
        lines[3] = String.join(" ", "*   *", "*   *", " *     ", "    *  ");
        lines[4] = String.join(" ", " *** ", " *** ", " *     ", "***** ");
        lines[5] = "";
        lines[6] = "";

        // Step 3: Use a for-each loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}