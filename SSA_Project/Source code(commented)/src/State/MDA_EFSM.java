package State;

//State pattern is implemented here. De centralized pattern is followed. States are added if there are actions or change of state in state diagram.

public class MDA_EFSM {
	
	protected State curr_state;
	protected State[] SL;
	private OP op;
	public int k;
	
	public MDA_EFSM() {//defining the states
		SL = new State[7];
		SL[6] = new Idle(this);
		SL[0] = new S0(this);
		SL[1] = new S1(this);
		SL[2] = new S2(this);
		SL[3] = new S3(this);
		SL[4] = new S5(this);
		SL[5] = new S8(this);
		
		curr_state = SL[6];   //at idle state by default
		
	}
	
	public OP getOP() {
		return op;
	}
		
	public void setOP (OP op) {
		
		this.op =  op;
	}

	public void Activate() {
		// TODO Auto-generated method stub
		curr_state.Activate();
	}

	public void Start() {
		// TODO Auto-generated method stub
		curr_state.Start();
		
	}

	public void PayCash() {
		// TODO Auto-generated method stub
		curr_state.PayCash();
		
	}

	public void PayCredit() {
		// TODO Auto-generated method stub
		curr_state.PayCredit();
	}

	public void Approved() {
		// TODO Auto-generated method stub
		curr_state.Approved();
	}

	public void Reject() {
		// TODO Auto-generated method stub
		curr_state.Reject();
	}

	public void Cancel() {
		// TODO Auto-generated method stub
		curr_state.Cancel();
	}

	public void StartPump() {
		// TODO Auto-generated method stub
		curr_state.Pump();
	}

	public void Pump() {
		// TODO Auto-generated method stub
		curr_state.Pump();
	}

	public void StopPump() {
		// TODO Auto-generated method stub
		curr_state.StopPump();
	}

	public void PayDebit() {
		// TODO Auto-generated method stub
		curr_state.PayDebit();
	}

	public void CorrectPin() {
		// TODO Auto-generated method stub
		curr_state.CorrectPin();
	}
	public void SelectGas(int max) {
		curr_state.SelectGas(max);
	}

	public void IncorrectPin(int i) {
		// TODO Auto-generated method stub
		curr_state.IncorrectPin(i);
	}
}
