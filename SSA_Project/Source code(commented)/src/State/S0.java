package State;
//S0 state
public class S0 extends State{

	public S0(MDA_EFSM model) {
		// TODO Auto-generated constructor stub
		super(model);
	}
	public void Start() {
		if(model.curr_state == model.SL[0]) {
			model.curr_state = model.SL[1];
			model.getOP().payMsg();
			model.getOP().initializeData();
			model.getOP().setW(1);
		}
	}
}
