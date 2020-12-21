package AbstractFactory;
//af1 that is connected to af and GP1. Implements all the first classes of the Statergy pattern.
import ActionClass.CancelMsg;
import ActionClass.CancelMsg1;
import ActionClass.DisplayMenu;
import ActionClass.DisplayMenu1;
import ActionClass.EjectCard;
import ActionClass.EjectCard1;
import ActionClass.EnterPinMsg;
import ActionClass.EnterPinMsg1;
import ActionClass.GasPumpUnit;
import ActionClass.GasPumpUnit1;
import ActionClass.InitializeData;
import ActionClass.InitializeData1;
import ActionClass.PayMsg;
import ActionClass.PayMsg1;
import ActionClass.PrintReceipt;
import ActionClass.PrintReceipt1;
import ActionClass.PumpGasUnit;
import ActionClass.PumpGasUnit1;
import ActionClass.RejectMsg;
import ActionClass.RejectMsg1;
import ActionClass.ReturnCash;
import ActionClass.ReturnCash1;
import ActionClass.SetInitialValues;
import ActionClass.SetInitialValues1;
import ActionClass.SetPrice;
import ActionClass.SetPrice1;
import ActionClass.SetW;
import ActionClass.SetW1;
import ActionClass.StoreCash;
import ActionClass.StoreCash1;
import ActionClass.StorePin;
import ActionClass.StorePin1;
import ActionClass.StorePrices;
import ActionClass.StorePrices1;
import ActionClass.WrongPinMsg;
import ActionClass.WrongPinMsg1;
import DataStore.DataStore;
import DataStore.DataStore1;

public class AbstractFactory1 extends AbstractFactory{
	private DataStore data;
	
	public AbstractFactory1() {
		this.data = new DataStore1();
	}

	public DataStore getData() {
		// TODO Auto-generated method stub
		return this.data;
	}

	@Override
	public CancelMsg getcancelMsg() {
		// TODO Auto-generated method stub
		return new CancelMsg1();
	}

	@Override
	public DisplayMenu getdisplayMenu() {
		// TODO Auto-generated method stub
		return new DisplayMenu1(this.data);
	}

	@Override
	public EjectCard getejectCard() {
		// TODO Auto-generated method stub
		return new EjectCard1();
	}

	@Override
	public EnterPinMsg getenterPinMsg() {
		// TODO Auto-generated method stub
		return new EnterPinMsg1();
	}

	@Override
	public GasPumpUnit getgasPumpUnit() {
		// TODO Auto-generated method stub
		return new GasPumpUnit1(this.data);
	}

	@Override
	public InitializeData getinitializeData() {
		// TODO Auto-generated method stub
		return new InitializeData1(this.data);
	}

	@Override
	public PayMsg getpayMsg() {
		// TODO Auto-generated method stub
		return new PayMsg1();
	}

	@Override
	public PrintReceipt getprintReceipt() {
		// TODO Auto-generated method stub
		return new PrintReceipt1(this.data);
	}

	@Override
	public RejectMsg getrejectMsg() {
		// TODO Auto-generated method stub
		return new RejectMsg1();
	}

	@Override
	public PumpGasUnit getpumpGasUnit() {
		// TODO Auto-generated method stub
		return new PumpGasUnit1(this.data);
	}

	@Override
	public ReturnCash getreturnCash() {
		// TODO Auto-generated method stub
		return new ReturnCash1();
	}

	@Override
	public SetInitialValues getsetInitialValues() {
		// TODO Auto-generated method stub
		return new SetInitialValues1(this.data);
	}

	@Override
	public SetPrice getsetPrice() {
		// TODO Auto-generated method stub
		return new SetPrice1(this.data);
	}

	@Override
	public SetW getsetW() {
		// TODO Auto-generated method stub
		return new SetW1(this.data);
	}

	@Override
	public StoreCash getstoreCash() {
		// TODO Auto-generated method stub
		return new StoreCash1(this.data);
	}

	@Override
	public StorePin getstorePin() {
		// TODO Auto-generated method stub
		return new StorePin1(this.data);
	}

	@Override
	public StorePrices getstorePrices() {
		// TODO Auto-generated method stub
		return new StorePrices1(this.data);
	}

	@Override
	public WrongPinMsg getwrongPinMsg() {
		// TODO Auto-generated method stub
		return new WrongPinMsg1();
	}

}
