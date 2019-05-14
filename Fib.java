/** 
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1
  
  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /** 
      @return the nth Fibonacci number
              by implementing the recurrence relation
		I made this a class method because I would prefer to simply
		call upon this method without having to change an instance of the class.
     */
    public static long fib_recurrence( int n) {
        if (n == 0) // decision to solve base case or recursive cases
			return 0; // solution for base case
		//recursive cases
		else if (n == 1) // leftover processsing
			return 1;
		else return fib_recurrence(n-1) //recursive abstraction
					+ fib_recurrence (n - 2); //concatenation and recursive abstraction
    }
     /* These are class methods because the method
	    does not use instance variables
    */


    /** 
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
        int numFirst = 0;
		int numSecond = 1;
		int numSecondCopy = numSecond;
		for (int i = 0; i < n; i++){
			numSecondCopy = numSecond;
			numSecond = numFirst + numSecond;
			numFirst = numSecondCopy;
		}
		return numFirst;
    }
    /* Time complexity:
       Consider the size of the problem to be ...
       n
       As the proxy for the time required, count...
       the iterations of the for loop
       Then cost of the the recurrence algorithm
       grows linearly because
       as the size of the problem increases,
	   for iterates n times
     */


    /** 
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
		double oVariable = (1 + Math.sqrt(5))/2;
		double vVariable = (1 - Math.sqrt(5))/2;
		return (Math.pow(oVariable, n) - Math.pow(vVariable, n))/ Math.sqrt(5);
    }
    /* Time complexity:
       Consider the size of the problem to be ...
       n
       As the proxy for the time required, count...
       the amount of arithmetic operations
       Then cost of the the recurrence algorithm
       does not grow
       as the size of the problem increases,
       the procedure remains constant.
     */
}
