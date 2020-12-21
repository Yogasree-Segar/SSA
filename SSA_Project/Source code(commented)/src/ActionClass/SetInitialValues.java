package ActionClass;
//super class for returncash extended by 2 classes for gp1 and gp2

import DataStore.DataStore;

public abstract class SetInitialValues {
	DataStore data;
	public SetInitialValues(DataStore data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}

	public abstract void setInitialValues();
}
