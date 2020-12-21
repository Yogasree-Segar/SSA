package State;
//S5 state and its func
public class S5 extends State{

	public S5(MDA_EFSM model) {
		// TODO Auto-generated constructor stub
		super(model);
	}
	public void Pump() {
		if(model.curr_state == model.SL[4]) {
			model.curr_state = model.SL[4];
			model.getOP().pumpGasUnit();
			model.getOP().gasPumpUnit();
		}
	}
	public void StopPump() {
		if(model.curr_state == model.SL[4]) {
			model.curr_state = model.SL[0];
			model.getOP().printReceipt();
		}
	}
}
