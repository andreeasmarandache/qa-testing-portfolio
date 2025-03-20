package Tests;

public class Puzzle4 {

    public static void main(String[] args) {
        Value[] values = new Value[6]; // Create an array of Value objects with a size of 6
        int number = 1; // Initialize a variable 'number' to 1
        int i = 0; // Initialize a loop counter 'i' to 0

        // Populate the 'values' array with Value objects and assign values to intValue
        while (i < 6) { // Loop while 'i' is less than 6
            values[i] = new Value(); // Create a new Value object at index 'i'
            values[i].intValue = number; // Assign 'number' to the intValue field of the current Value object
            number = number * 10; // Update 'number' to be 10 times its current value for the next iteration
            i = i + 1; // Increment the loop counter 'i' to move to the next index
        }

        int result = 0; // Initialize a variable 'result' to accumulate results
        i = 6; // Reset 'i' to 6 for the next loop

        // Calculate the result using the doStuff method of each Value object
        while (i > 0) { // Loop while 'i' is greater than 0
            i = i - 1; // Decrement 'i' by 1
            // Call doStuff on the Value object at index 'i' with 'i' as the factor
            result = result + values[i].doStuff(i); // Add the result of doStuff to 'result'
        }

        // Print the final computed result to the console
        System.out.println("result " + result); // Output the result
    }
}

class Value { // Define the Value class
    int intValue; // Field to store an integer value

    // Method that performs operations based on the intValue and the given factor
    int doStuff(int factor) { // Method takes an integer 'factor' as a parameter
        if (intValue > 100) { // If the intValue is greater than 100
            return intValue * factor; // Return the product of intValue and factor
        } else { // If intValue is 100 or less
            return intValue * (5 - factor); // Return the product of intValue and (5 - factor)
        }
    }
}

//Summary of Key Steps
//Values Assigned:
//1, 10, 100, 1000, 10000, 100000.
//Calculations in doStuff based on conditions:
//Multiply by the factor for values greater than 100.
//Use the formula
//intValue×(5−factor) for values 100 or less.
