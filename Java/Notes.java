// package notes;
import java.util.Scanner;
/**
 *
 * @author Melis
 */
public class Notes {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // Loops
      // do while - post test loop - executes the block of code at least once since it doesn't check the status of the condition until after executing the code in the loop
      int count = 0;
      do {
        System.out.println("Hello");
        count++;
      } while (count < 3);
      // while - pre test loop
      // repeats as long as a conditional statement is true
      count = 0;
      while(count < 3) {
        System.out.println("Hello while");
        count ++;
      };
      //  for - pre test loop
      // executes predetermined number of times
      for(int i = 0; i < 3; i++)
      {
        System.out.println("Hello for loop");
        count++;
      }
    // functions - types of parameters: call by reference vs call by value
      //call by reference - points to same reference in memory that contains value of variable, changes made in method, reflect outside the method
        //arrays are always a pass/call by reference
      //call by value - makes copy of reference with value, changes made do not reflect outside the method
      // An easy rule of thumb is to remember that primitive data types are considered call by value and therefore are a copy of the variable and variables such as arrays and objects which we will talk about shortly are call by reference.
  }
  
}