package ActionClass;
import DataStore.DataStore;
//super pumpgasunit class
public abstract class PumpGasUnit {
	DataStore data;
	public PumpGasUnit(DataStore data) {
		this.data = data;
	}
	public abstract void pumpGasUnit();
}
