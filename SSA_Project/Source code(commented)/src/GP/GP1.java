package GP;

import AbstractFactory.AbstractFactory;
import DataStore.DataStore1;

public class GP1 extends GP{
	
	public GP1(AbstractFactory af) { //connecting to super class and abstract factory through it
		super(af);
	}
	
	public void Activate (int a) {
		if(a>0) {
			DataStore1 d = (DataStore1) this.data; //access to datastore 1
			d.temp_a = a;
			model.Activate(); //calling activate through MDA_EFSM
		}
	}
	public void PayCash (int c) {
		if(c>0) {
			DataStore1 d = (DataStore1) this.data;
			d.temp_c = c;
			model.PayCash(); //calling PayCash through MDA_EFSM
		}
	}
	public void PayCredit () {
		model.PayCredit();//calling PayCredit through MDA_EFSM
	}
	public void Approved () {
		model.Approved();//calling Approved through MDA_EFSM
	}
	public void Reject () {
		model.Reject();//calling Reject through MDA_EFSM
	}
	public void Cancel () {
		model.Cancel();//calling Cancel through MDA_EFSM
	}
	public void StartPump () {
		model.StartPump();//calling StartPump through MDA_EFSM
	}
	public void PumpLiter() {
		DataStore1 d = (DataStore1) this.data;
		if(d.w == 1) {
			model.Pump();//calling the func through model
		}
		else if((d.cash >0) && (d.cash < d.price * (d.L + 1))) {
			model.StopPump();//calling the func through model
		}
		else {
			model.Pump();//calling the func through model
		}
	}
	public void StopPump () {
		model.StopPump();//calling the func through model
	}
	public void Start () {
		model.Start();//calling the func through model
		
	}
}
