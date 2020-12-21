package State;
//S2 state and its func
public class S2 extends State{

	public S2(MDA_EFSM model) {
		// TODO Auto-generated constructor stub
		super(model);
	}
	public void Approved() {
		if(model.curr_state == model.SL[2]) {
			model.curr_state = model.SL[3];
			model.getOP().displayMenu();
			model.getOP().ejectCard();
		}
	}
	public void Reject() {
		if(model.curr_state == model.SL[2]) {
			model.curr_state = model.SL[0];
			model.getOP().rejectMsg();
			model.getOP().ejectCard();
		}
	}

}
