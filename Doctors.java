// - Okay, it's time again for our challenge. The challenge objectives for this section are to add decision-making logic and use a loop to allow the program to continue multiple times. You want to write a program that computes and displays the total charges for our patient in a hospital stay. The patient might be admitted overnight. For an overnight stay, you're going to ask the user for the hospital overnight charges, as well as medication charges and lab service charges. If it's not an overnight stay, then you're just going to have medication charges and lab service charges.
// You're going to calculate the charges, print the final total, then ask the user if they want to calculate the charges for another patient. I've estimated 20 minutes for this activity, but it might take you a little longer, or you might get it done a little sooner, but either way, have fun.
import java.util.Scanner;
/**
 *
 * @author Melissa Bell
 */
public class Doctors {
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    double[] receipt = new double[2];
    getServiceCharges(receipt);
    double totalCost = getServiceTotal(receipt);
    System.out.println("Your total cost is" + totalCost);
  }
    public static void getServiceCharges(double[] receipt)
    {
      Scanner in = new Scanner(System.in);
      System.out.println("Was this an overnight stay? (Y/N)");
      int overnightStay = in.nextInt();
      System.out.println(overnightStay);
      if (overnightStay == '1'){
        System.out.println("What was yourovernight charge?");
        receipt[0] = in.nextDouble();
      } else {
        receipt[0] = 0.00;
      }
      System.out.println("What were your total medication charges?");
      receipt[1] = in.nextDouble();
      System.out.println("What were your total lab fees?");
      receipt[2] = in.nextDouble();
    }

    public static double getServiceTotal(double[] serviceCharges)
    {
      System.out.println("Wtf");
      return serviceCharges[0] + serviceCharges[1] + serviceCharges[2];
    }
  
}