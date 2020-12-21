package ActionClass;
//super gaspumpunit to show units of gas pumped
import DataStore.DataStore;

public abstract class GasPumpUnit {
	DataStore data;
	public GasPumpUnit(DataStore data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}

	public abstract void gasPumpUnit();
}
