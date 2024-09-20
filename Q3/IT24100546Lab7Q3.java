import java.util.Scanner;

	public class IT24100546Lab7Q3{
		public static void main(String[] args){

		double total_bill,discount,final_price;
		char paymode;
		
		final double discount_rate = 0.05;
		final double customers=5;

		Scanner x = new Scanner(System.in);

		for(int i=1; i<=customers; i++){
			System.out.println("Customer "+i);

			System.out.print("Enter total bill amount: ");
			total_bill=x.nextDouble();
		
			System.out.print("Enter mode of payment(C for cash, O for other): ");
			paymode = x.next().toUpperCase().charAt(0);

			discount=total_bill*discount_rate;
			final_price = total_bill -discount;

			if(paymode=='C'){
				
				System.out.println("Discount is: "+discount);
				System.out.println("Amount to be paid: "+final_price);
				
			}
			
			else if(paymode=='O'){
				System.out.println("No discount is applicable");
				System.out.println("Amount to be paid: "+total_bill);
			}

			else{
				System.out.println("Payment mode is not valid");			
			}

			System.out.println(); 
	}


}



}