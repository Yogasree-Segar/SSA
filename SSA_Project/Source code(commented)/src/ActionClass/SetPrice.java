package ActionClass;
//super class for returncash extended by 2 classes for gp1 and gp2

import DataStore.DataStore;

public abstract class SetPrice {
	DataStore data;
	public SetPrice(DataStore data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}

	public abstract void setPrice(int a);
}
