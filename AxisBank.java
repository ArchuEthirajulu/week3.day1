package week3.day1;

public class AxisBank extends BankInfo{
   public void deposit() {
		System.out.println("overridden deposited 10000");
	}
   public static void main(String[] args) {
	   AxisBank n = new AxisBank();
	   n.deposit();
	   
	   BankInfo b =new BankInfo();
	   b.deposit();
	   b.fixed();
	   b.saving();
   }
}

