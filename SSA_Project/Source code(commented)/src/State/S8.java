package State;

//S8 state and its func
public class S8 extends State{
	public int k;
	public S8(MDA_EFSM model) {
		// TODO Auto-generated constructor stub
		super(model);
	}
	public void CorrectPin() {
		if(model.curr_state == model.SL[5]) {
			model.curr_state = model.SL[3];
			model.getOP().displayMenu();
			model.getOP().ejectCard();
		}
	}
	public void IncorrectPin(int max) {
		if(model.curr_state == model.SL[5]) {
			if(model.k > max) {
				model.curr_state = model.SL[0];
				model.getOP().wrongPinMsg();
				model.getOP().ejectCard();
			}
			else if(model.k < max) {
				model.curr_state = model.SL[5];
				model.getOP().wrongPinMsg();
				model.k = model.k + 1;
			}
		}
	}

}
