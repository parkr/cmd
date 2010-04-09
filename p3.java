import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/** Name: Parker Moore
 * Class: AP Computer Science
 * Teacher: Mr. Klus
 * Program: 
 * Description: 
 */

public class p3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat fmt = new DecimalFormat("0.00");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		StringTokenizer tok = new StringTokenizer(line);
		int num = Integer.parseInt(tok.nextToken());
		int subtotal = 0;
		double taxRate =0, taxes = 0;
		ArrayList<Integer> nums = new ArrayList<Integer>();
		while(num >= 0){
			nums.add(num);
			num = Integer.parseInt(tok.nextToken());
		}
		for(Integer n: nums){
			subtotal += n;
			if(n%2 != 0){
				String lastDigit = n.toString().substring(n.toString().length()-1, n.toString().length());
				taxRate = Double.parseDouble(lastDigit)/100.0;
				taxes += (taxRate * n);
			}
		}
		double grandTotal = subtotal + taxes;
		System.out.println("Subtotal    = "+subtotal);
		System.out.println("Total Taxes = "+fmt.format(taxes));
		System.out.println("Grand Total = "+fmt.format(grandTotal));
	}

}
