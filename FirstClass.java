import java.util.Scanner;

/**
 * MY First Java Class
 * 
 * @author Theo Breaux
 * 
 */
public class FirstClass {
    /**
     * This is the main method, the entry point to any Java program
     * 
     * @param args
     */
    public static void main(String[] args) {
        // Printing using SOPL: Short for System.out.println()
        System.out.println("Hello World!");
        System.out.println(); // print a blank line

        /*
         * Defining variables
         */
        int x = 5;
        double y = 5.0;
        boolean flag = true;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("flag: " + flag);

        /*
         * String and characters
         */

        String dept = "cit"; // String
        char letter = 'a'; // Character

        String course = dept + 590; // String with int
        String grade = letter + ""; // Char with String
        String courseInformation = course + ": " + grade;

        System.out.println(courseInformation);

        /*
         * Math operations
         *
         */

        double d = 2 * x + 10;
        double z = 2 * y + 5;

        System.out.println();
        System.out.println("d: " + d);
        System.out.println("z: " + z);

        // divisiion with ints
        // uses integer division and ignores the remainder
        System.out.println("x / 2: " + (x / 2));

        // division with floats
        System.out.println("x / 2.0: " + (x / 2.0));

        // power operations
        System.out.println("x pow 4: " + Math.pow(x, 4));

        /*
         * String operations
         */

        // String Concatenation
        String fullName = "Theo " + "Ashley " + "Breaux";
        // String method for converting to upper case
        String fullNameUpper = fullName.toUpperCase();

        System.out.println();
        System.out.println(fullName);
        System.out.println(fullNameUpper);

        /*
         * Conditionals and loops
         */

        // Conditional chceking if x is even using the % operator
        System.out.println();
        System.out.println("x: " + x);

        if (x % 2 == 0) {
            System.out.println(x + " is even");
        } else {
            System.out.println(x + " is odd");
        }

        double e = 2.3;
        double f = 2.4;
        double g = 2.5;

        // boolean operators
        // && (and) - true only if both operands are true
        System.out.println();
        if (e > 2 && e < f) {
            System.out.println(e + " is between 2 and " + f);
        }

        // (or) - true if either operand is true
        if (f > e || f > g) {
            System.out.println(f + " is greater than " + e + " or greater than " + g);
        }

        // ! (not) revereses the truth value of its one operand
        if (g != 2.6) {
            System.out.println(g + " is not equal to 2.6");
        }

        // while loops
        int i = 0;

        while (i < 5) {
            System.out.println("i: " + i);

            i++; // same as i = i + 1;
        }

        // for loops
        System.out.println();

        for (int k = 0; k < 10; k++) {
            System.out.println("k: " + k);
        }

        /*
         * Casting
         */

        // Cast int to string
        String intToString = Integer.toString(1);

        // Cast double to string
        String doubleToString = Double.toString(1.1);

        // Print the valus and type
        System.out.println();

        System.out.println(intToString + "........" + intToString.getClass());
        System.out.println(doubleToString + "........" + doubleToString.getClass());

        // Cast String to int
        int stringToInt = Integer.parseInt("1");

        // Cast string to double
        double stringToDouble = Double.parseDouble("1.1");

        System.out.println(stringToInt);
        System.out.println(stringToDouble);
        // Cast to object then call get.Class()
        System.out.println(((Object) stringToInt).getClass());
        System.out.println(((Object) stringToDouble).getClass());

        /*
         * Use input
         */

        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter a number:");
        int myInt = scan.nextInt(); // get next input as int
        System.out.println("Your number is " + myInt);

        // Print the mutiplication table up to 10 for myInt
        for (int t = 1; t < 11; t++) {
            // print result o t multipllied by myInt
            System.out.println(t + " x " + myInt + " : " + (t * myInt));
        }

        System.out.println();
        System.out.println("Enter a string:");
        String myString = scan.next(); // get next input value as String

        // print each char in myString seperatly
        for (int u = 0; u < myString.length(); u++) {
            // print char at index u
            System.out.println(myString.charAt(u));
        }

        scan.close();

    }
}
