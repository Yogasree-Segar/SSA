package AbstractFactory;
//af2 that connects GP2 and extends af. Includes all methods needed for GP2
import ActionClass.CancelMsg;
import ActionClass.CancelMsg2;
import ActionClass.DisplayMenu;
import ActionClass.DisplayMenu2;
import ActionClass.EjectCard;
import ActionClass.EjectCard2;
import ActionClass.EnterPinMsg;
import ActionClass.EnterPinMsg2;
import ActionClass.GasPumpUnit;
import ActionClass.GasPumpUnit2;
import ActionClass.InitializeData;
import ActionClass.InitializeData2;
import ActionClass.PayMsg;
import ActionClass.PayMsg2;
import ActionClass.PrintReceipt;
import ActionClass.PrintReceipt2;
import ActionClass.PumpGasUnit;
import ActionClass.PumpGasUnit2;
import ActionClass.RejectMsg;
import ActionClass.RejectMsg2;
import ActionClass.ReturnCash;
import ActionClass.ReturnCash2;
import ActionClass.SetInitialValues;
import ActionClass.SetInitialValues2;
import ActionClass.SetPrice;
import ActionClass.SetPrice2;
import ActionClass.SetW;
import ActionClass.SetW2;
import ActionClass.StoreCash;
import ActionClass.StoreCash2;
import ActionClass.StorePin;
import ActionClass.StorePin2;
import ActionClass.StorePrices;
import ActionClass.StorePrices2;
import ActionClass.WrongPinMsg;
import ActionClass.WrongPinMsg2;
import DataStore.DataStore;
import DataStore.DataStore2;

public class AbstractFactory2 extends AbstractFactory {
	private DataStore data;
	
	public AbstractFactory2() {
		this.data = new DataStore2();
	}

	@Override
	public DataStore getData() {
		// TODO Auto-generated method stub
		return this.data;
	}

	@Override
	public CancelMsg getcancelMsg() {
		// TODO Auto-generated method stub
		return new CancelMsg2();
	}

	@Override
	public DisplayMenu getdisplayMenu() {
		// TODO Auto-generated method stub
		return new DisplayMenu2(this.data);
	}

	@Override
	public EjectCard getejectCard() {
		// TODO Auto-generated method stub
		return new EjectCard2();
	}

	@Override
	public EnterPinMsg getenterPinMsg() {
		// TODO Auto-generated method stub
		return new EnterPinMsg2();
	}

	@Override
	public GasPumpUnit getgasPumpUnit() {
		// TODO Auto-generated method stub
		return new GasPumpUnit2(this.data);
	}

	@Override
	public InitializeData getinitializeData() {
		// TODO Auto-generated method stub
		return new InitializeData2(this.data);
	}

	@Override
	public PayMsg getpayMsg() {
		// TODO Auto-generated method stub
		return new PayMsg2();
	}

	@Override
	public PrintReceipt getprintReceipt() {
		// TODO Auto-generated method stub
		return new PrintReceipt2(this.data);
	}

	@Override
	public RejectMsg getrejectMsg() {
		// TODO Auto-generated method stub
		return new RejectMsg2();
	}

	@Override
	public PumpGasUnit getpumpGasUnit() {
		// TODO Auto-generated method stub
		return new PumpGasUnit2(this.data);
	}

	@Override
	public ReturnCash getreturnCash() {
		// TODO Auto-generated method stub
		return new ReturnCash2();
	}

	@Override
	public SetInitialValues getsetInitialValues() {
		// TODO Auto-generated method stub
		return new SetInitialValues2(this.data);
	}

	@Override
	public SetPrice getsetPrice() {
		// TODO Auto-generated method stub
		return new SetPrice2(this.data);
	}

	@Override
	public SetW getsetW() {
		// TODO Auto-generated method stub
		return new SetW2(this.data);
	}

	@Override
	public StoreCash getstoreCash() {
		// TODO Auto-generated method stub
		return new StoreCash2(this.data);
	}

	@Override
	public StorePin getstorePin() {
		// TODO Auto-generated method stub
		return new StorePin2(this.data);
	}

	@Override
	public StorePrices getstorePrices() {
		// TODO Auto-generated method stub
		return new StorePrices2(this.data);
	}

	@Override
	public WrongPinMsg getwrongPinMsg() {
		// TODO Auto-generated method stub
		return new WrongPinMsg2();
	}

}
