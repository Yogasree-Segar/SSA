package GP;

import AbstractFactory.AbstractFactory;
import DataStore.DataStore2;;

public class GP2 extends GP{
	
	public GP2(AbstractFactory af) {//extends GP and connected to af
		super(af);
	}
	public void Activate (float a, float b, float c) {
		if((a>0)&&(b>0)&&(c>0)) {
			DataStore2 d = (DataStore2) this.data;
			d.temp_a = a;
			d.temp_b = b;
			d.temp_c = c;
			model.Activate();//calling the func through model
		}
	}
	public void Start () {
		model.Start();//calling the func through model
	}
	public void PayCredit () {
		model.PayCredit();//calling the func through model
	}
	public void PayDebit (String a) {
		DataStore2 d = (DataStore2) this.data;
		d.temp_p = a;
		model.PayDebit();//calling the func through model
	}
	public void Pin (String a) {
		DataStore2 d = (DataStore2) this.data;
		if(d.pin == a) {
			model.CorrectPin();//calling the func through model
		}
		else {
			model.IncorrectPin(1);//calling the func through model
		}
	}
	public void Cancel () {
		model.Cancel();//calling the func through model
	}
	public void Approved () {
		model.Approved();//calling the func through model
	}
	public void Diesel () {
		model.SelectGas(3);//calling the func through model
	}
	public void Regular () {
		model.SelectGas(1);//calling the func through model
	}
	public void StartPump () {
		DataStore2 d = (DataStore2) this.data;
		if(d.price > 0){
			model.StartPump();//calling the func through model
		}
	}
	public void PumpGallon () {
		model.Pump();//calling the func through model
	}
	public void StopPump () {
		model.StopPump();//calling the func through model
	}
	public void FullTank () {
		model.StopPump();//calling the func through model
	}
	public void Super () {
		model.SelectGas(2);//calling the func through model
	}
	public void Reject () {
		model.Reject();//calling the func through model
	}
}
