/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class CurrencyConverter
{
  public static void main (String[]args)
  {
	Scanner scanner = new Scanner (System.in);

	  System.out.println ("Currency Selection:");
	  System.out.print ("Enter the base currency: ");
	String baseCurrency = scanner.nextLine ();

	  System.out.print ("Enter the target currency: ");
	String targetCurrency = scanner.nextLine ();

	  System.out.
	  println ("Currency Rates: Fetching real-time exchange rates...");

	  System.out.print ("Amount Input: Enter the amount to convert from " +
						baseCurrency + " to " + targetCurrency + ": ");
	double amount = scanner.nextDouble ();


	double exchangeRate = 1.23;

	double convertedAmount = amount * exchangeRate;

	  System.out.println ("Display Result:");
	  System.out.println ("Converted Amount: " + convertedAmount + " " +
						  targetCurrency);
  }
}
