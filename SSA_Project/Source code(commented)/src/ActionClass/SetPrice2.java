package ActionClass;

import DataStore.DataStore;
import DataStore.DataStore2;


public class SetPrice2 extends SetPrice{

	public SetPrice2(DataStore data) {
		// TODO Auto-generated constructor stub
		super(data);
	}

	@Override
	public void setPrice(int a) {
		// TODO Auto-generated method stub
		DataStore2 d = (DataStore2) data;
		if(a==1) {
			d.price = d.Rprice;
		}
		else if(a==2) {
			d.price = d.Sprice;
		}
		else if(a==3) {
			d.price = d.Dprice;
		}
		
	}

}
