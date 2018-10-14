/*
 *5.20 (Display prime numbers between 2 and 1,000) Modify Listing 5.15 to display 
all the prime numbers between 2 and 1,000, inclusive. Display eight prime numbers
per line. Numbers are separated by exactly one space.
 */
package Chapter_05;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise20_05 {

    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES_PER_LINE = 8; // Display 8 per line
        int count = 0; // Count the number of prime numbers
        int number = 2; // A number to be tested for primeness
        
        System.out.println("The prime numbers between 2 and 1000 are:");
        
        // Repeatedly find prime numbers
        while (number <= 1000) {
            // Assume the number is prime
            boolean isPrime = true; // Is the current number prime?
       
            // Test whether number is prime
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) { // If true, number is not prime
                    isPrime = false; // Set isPrime to false
                    break; // Exit the for loop
                }
            }
              
            // Display the prime number and increase the count
			if (isPrime) {
				count++; // Increase the count
		   
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					// Display the number and advance to the new line
					System.out.println(number);
				}
				else
					System.out.print(number + " ");
			}
		   
			// Check if the next number is prime
			number++;
        }
    }
    
}
