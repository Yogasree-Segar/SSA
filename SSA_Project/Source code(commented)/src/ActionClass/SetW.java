package ActionClass;
//super class for setw extended by 2 classes for gp1 and gp2
import DataStore.DataStore;

public abstract class SetW {
	DataStore data;
	public SetW(DataStore data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}

	public abstract void setW(int a);
}
