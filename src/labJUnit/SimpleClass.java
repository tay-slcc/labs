package labJUnit;

/**
 * Simple class to demonstrate automated testing with JUnit Jupiter (JUnit 5).
 * 
 * @author chantay
 *
 */
public class SimpleClass {

   /**    
   * Determines whether a given year is a leap year.    
   * <p>    
   * @param y year     
   * @return true if <code>year</code> is a leap year and false otherwise.    
   * @throws IllegalArgumentException if <code>year</code> is not positive.   
   */
   public static boolean isLeapYear(int year) { 
	   if (year <= 0) throw new IllegalArgumentException("Year must be greater than zero.");
	   if (year % 100 == 0 && year % 400 !=0) return false;
	   return year % 4 == 0;  
   }
}