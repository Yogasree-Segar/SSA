package GP;
//GP super class. GPs are implemented from this.
import DataStore.*;
import State.MDA_EFSM;
import State.OP;
import AbstractFactory.AbstractFactory;

public abstract class GP {
	DataStore data;
	MDA_EFSM model;
	
	GP(AbstractFactory af){
		this.data = af.getData(); //connecting to dataStore
		this.model = new MDA_EFSM(); //connecting to MDA_EFSM
		this.model.setOP(new OP(af)); //connecting to OP
		
		//child classes access the other classes through this super class
	}
}
