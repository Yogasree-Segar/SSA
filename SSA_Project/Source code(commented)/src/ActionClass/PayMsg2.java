package ActionClass;
//paymsg2 for gp2 extends  paymsg
public class PayMsg2 extends PayMsg{

	@Override
	public void payMsg() {
		// TODO Auto-generated method stub
		System.out.println("Gas Pump2 Started");
		System.out.println("The following payment methods are available: \n Credit \n Debit");
		System.out.println("Press 2 for Credit method");
		System.out.println("Press 4 for Debit method");
	}

}
