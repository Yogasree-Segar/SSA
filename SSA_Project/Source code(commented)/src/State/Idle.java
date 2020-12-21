package State;

public class Idle extends State{// idle state

	 Idle(MDA_EFSM model) {
		// TODO Auto-generated constructor stub
		 super(model);
	}
	 public void Activate() {
		if(model.curr_state ==model.SL[6]) {
			model.curr_state = model.SL[0];
			model.getOP().storePrices();
			
		}
	 }

}
