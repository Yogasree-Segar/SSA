package ActionClass;
import DataStore.DataStore;
import DataStore.DataStore1;
public class SetW1 extends SetW{
	
	public SetW1 (DataStore data) {
		super(data);
	}

	@Override
	public void setW(int a) {
		// TODO Auto-generated method stub
		DataStore1 d = (DataStore1) data;
		d.w = a;
	}

}
