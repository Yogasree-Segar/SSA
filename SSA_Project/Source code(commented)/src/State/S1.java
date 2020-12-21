package State;
//S1 state and its functions
public class S1 extends State{
	

	public S1(MDA_EFSM model) {
		// TODO Auto-generated constructor stub
		super(model);
	}
	public void PayCash() {
		if(model.curr_state ==model.SL[1]) {
			model.curr_state = model.SL[3];
			model.getOP().storeCash();
			model.getOP().displayMenu();
			model.getOP().setW(1);
		}
	}
	public void PayDebit() {
		if(model.curr_state ==model.SL[1]) {
			model.curr_state = model.SL[5];
			model.getOP().enterPinMsg();
			model.getOP().storePin();
			model.k = 0;
		}
	}
	public void PayCredit() {
		if(model.curr_state ==model.SL[1]) {
			model.curr_state = model.SL[2];
		}
	}
}
