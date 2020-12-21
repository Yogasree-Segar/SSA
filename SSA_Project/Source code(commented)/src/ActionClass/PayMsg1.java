package ActionClass;
//paymsg1 for gp1 extends  paymsg
public class PayMsg1 extends PayMsg{

	@Override
	public void payMsg() {
		// TODO Auto-generated method stub
		System.out.println("Gas Pump1 Started");
		System.out.println("The following payment methods are available: \n Credit \n Cash");
		System.out.println("Press 2 for Credit method");
		System.out.println("Press 6 for Cash method");
	}

}
