package State;
//connected to MDA_EFSM. Super state class that includes the empty functions to be implemented at each states
public abstract class State {
	MDA_EFSM model;

	public State(MDA_EFSM model) {
		// TODO Auto-generated constructor stub
		this.model = model;
	}

	public void Activate() {
		// TODO Auto-generated method stub
		
	}

	public void Start() {
		// TODO Auto-generated method stub
		
	}

	public void PayCash() {
		// TODO Auto-generated method stub
		
	}

	public void SelectGas(int max) {
		// TODO Auto-generated method stub
		
	}

	public void CorrectPin() {
		// TODO Auto-generated method stub
		
	}

	public void PayDebit() {
		// TODO Auto-generated method stub
		
	}

	public void StopPump() {
		// TODO Auto-generated method stub
		
	}

	public void Pump() {
		
	}

	public void Cancel() {
		// TODO Auto-generated method stub
		
	}

	public void Approved() {
		// TODO Auto-generated method stub
		
	}

	public void Reject() {
		// TODO Auto-generated method stub
		
	}

	public void PayCredit() {
		
	}

	public void IncorrectPin(int i) {
		// TODO Auto-generated method stub
		
	}

}
