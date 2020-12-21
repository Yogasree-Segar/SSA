package State;
//S3 state and its func
public class S3 extends State{

	public S3(MDA_EFSM model) {
		// TODO Auto-generated constructor stub
		super(model);
	}
	public void SelectGas(int g) {
		if(model.curr_state ==model.SL[3]) {
			model.curr_state = model.SL[3];
			model.getOP().setPrice(g);
		}
	}
	public void Pump() {
		if(model.curr_state == model.SL[3]) {
			model.curr_state = model.SL[4];
			model.getOP().setInitialValues();
		}
	}
	public void Cancel() {
		if(model.curr_state == model.SL[3]) {
			model.curr_state = model.SL[0];
			model.getOP().cancelMsg();
			model.getOP().returnCash();
		}
	}
}
