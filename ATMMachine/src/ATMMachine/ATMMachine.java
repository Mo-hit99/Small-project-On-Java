package ATMMachine;
import java.util.Scanner;
class ATM{
	double Balance;
	int Pin = 5674;
	
	public void checkpin() {
		System.out.println("Enter your pin");
		Scanner sc=new Scanner(System.in);
		int enteredpin =sc.nextInt();
		if(enteredpin==Pin) {
			menu();
		}else {
			System.out.println("Enter a valid pin");
			menu();
		}
		
	}
	public void menu() {
		System.out.println("Enter Your Choice: ");
		System.out.println("1. Check A/C Balance");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. Exit");
		
		Scanner sc = new Scanner(System.in);
		int opt =sc.nextInt();
		
		if(opt==1) {
			checkBalnce();
		}else if(opt==2) {
			withDraw();
		}else if(opt==3) {
			depositeMoney();
		}else if(opt==4) {
			return;
		}else {
			System.out.println("Enter the valid choice!");
		}
	}
	public void checkBalnce() {
		System.out.println("Balance: "+ Balance);
		menu();
	}
	public void  withDraw() {
		System.out.println("Enter Amount to WithDraw: " );
		Scanner sc=new Scanner(System.in);
		double amount=sc.nextDouble();
		if(amount>Balance) {
			System.out.println("Insufficient Balance");
		}else {
			Balance= Balance - amount;
			System.out.println("Money WithDraw Successful");
		}
		menu();
	}
	public void depositeMoney() {
		System.out.println("Enter the Amount");
		Scanner sc=new Scanner(System.in);
		double amount = sc.nextDouble();
		Balance=Balance + amount;
		System.out.println("Money Deposited Successfully");
		menu();
	}
}

public class ATMMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ATM atm= new ATM();
		atm.checkpin();

	}

}
