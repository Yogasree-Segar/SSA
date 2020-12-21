package Main;
//driver class to be run which includes options to display and connects to the GasPumps and its respective abstract Factories
import GP.*;
import AbstractFactory.*;
import java.util.Scanner; 
public class Driver {
	public static void main(String[] args)
    { // partial driver
		
          int type;
          System.out.println("Enter 1 for GasPump 1");
          System.out.println("Enter 2 for GasPump 2");
          System.out.println("Enter GasPump Type");
          Scanner sc = new Scanner(System.in);
          type = sc.nextInt();
          switch(type) {
        	  case 1:{
        		  AbstractFactory1 af1 = new AbstractFactory1();
        		  GP1 gp1 = new GP1(af1);
    	          System.out.print("                          GasPump-1");
    	          System.out.print("\n");
    	          System.out.print("                  MENU of Operations");
    	          System.out.print("\n");
    	          System.out.print("          0. Activate(int)");
    	          System.out.print("\n");
    	          System.out.print("          1. Start()");
    	          System.out.print("\n");
    	          System.out.print("          2. PayCredit()");
    	          System.out.print("\n");
    	          System.out.print("          3. Reject()");
    	          System.out.print("\n");
    	          System.out.print("          4. Cancel()");
    	          System.out.print("\n");
    	          System.out.print("          5. Approved()");
    	          System.out.print("\n");
    	          System.out.print("          6. PayCash(int)");
    	          System.out.print("\n");
    	          System.out.print("          7. StartPump()");
    	          System.out.print("\n");
    	          System.out.print("          8. PumpLiter()");
    	          System.out.print("\n");
    	          System.out.print("          9. StopPump()");
    	          System.out.print("\n");
    	          System.out.print("          q. Quit the program");
    	          System.out.print("\n");

    	          System.out.print("  Please make a note of these operations");
    	          System.out.print("\n");
    	          System.out.print("           GasPump-1 Execution");
    	          System.out.print("\n");
    	          char ch = '1'; 
    	      while (ch !='q')
    	      {
    	          System.out.print("  Select Operation: ");
    	          System.out.print("\n");
    	          System.out.print("0-Activate,1-Start,2-PayCredit,3-Reject,4-Cancel,5-Approved,6-PayCash,7-StartPump, 8-PumpLiter, 9-StopPump, q-quit");
    	          System.out.print("\n");
    	          ch=sc.next().charAt(0); 
    	          switch (ch){
    	          	case '0':
    	          		{ //Activate()
    	                 System.out.print("  Operation:  Activate(int a)");
    	                 System.out.print("\n");
    	                 System.out.print("  Enter value of the parameter a:");
    	                 System.out.print("\n");
    	                 int a = sc.nextInt();
    	                 gp1.Activate(a);
    	                 break;
    	          		}

    	          	case '1':
    	          		{ //Start
    	                System.out.print("  Operation:  Start()");
    	                System.out.print("\n");
    	                gp1.Start();
    	                break;
    	          		}

    	          	case '2':
    	          		{ //PayCredit
    	                    System.out.print("  Operation:  PayCredit()");
    	                    System.out.print("\n");
    	                gp1.PayCredit();
    	                break;
    	            }

    	        case '3':
    	        { //Reject
    	                    System.out.print("  Operation:  Reject()");
    	                    System.out.print("\n");
    	                gp1.Reject();
    	                break;
    	            }

    	        case '4':
    	        { //Cancel
    	                    System.out.print("  Operation:  Cancel()");
    	                    System.out.print("\n");
    	                gp1.Cancel();
    	                break;
    	            }

    	        case '5':
    	        { //Approved
    	                    System.out.print("  Operation:  Approved()");
    	                    System.out.print("\n");
    	                gp1.Approved();
    	                break;
    	            }

    	        case '6':
    	        { //PayCash
    	                      System.out.print("  Operation:  PayCash(int c)");
    	                      System.out.print("\n");
    	                System.out.print("  Enter value of the parameter c:");
    	                System.out.print("\n");
    	                int c =  sc.nextInt();
    	                gp1.PayCash(c);
    	                break;
    	               }

    	        case '7':
    	        { //StartPump
    	                    System.out.print("  Operation:  StartPump()");
    	                    System.out.print("\n");
    	                gp1.StartPump();
    	                break;
    	            }


    	        case '8':
    	        { //PumpLiter
    	                    System.out.print("  Operation:  PumpLiter()");
    	                    System.out.print("\n");
    	                gp1.PumpLiter();
    	                break;
    	            }

    	        case '9':
    	        { //StopPump
    	                    System.out.print("  Operation:  StopPump()");
    	                    System.out.print("\n");
    	                gp1.StopPump();
    	                break;
    	            }
    	      }; // endswitch

    	   }; //endwhile
    	   break;
    	   
        	}
        	  case 2:
        	  {
        		  AbstractFactory2 af2 = new AbstractFactory2();
                  GP2 gp2 = new GP2(af2);
        		  System.out.print("                          GasPump-2");
    	          System.out.print("\n");
    	          System.out.print("                  MENU of Operations");
    	          System.out.print("\n");
    	          System.out.print("          0. Activate(float,float,float)");
    	          System.out.print("\n");
    	          System.out.print("          1. Start()");
    	          System.out.print("\n");
    	          System.out.print("          2. PayCredit()");
    	          System.out.print("\n");
    	          System.out.print("          3. Reject()");
    	          System.out.print("\n");
    	          System.out.print("          4. PayDebit(string)");
    	          System.out.print("\n");
    	          System.out.print("          5. Pin(string)");
    	          System.out.print("\n");
    	          System.out.print("          6. Cancel()");
    	          System.out.print("\n");
    	          System.out.print("          7. Approved()");
    	          System.out.print("\n");
    	          System.out.print("          8. Diesel()");
    	          System.out.print("\n");
    	          System.out.print("          9. Regular()");
    	          System.out.print("\n");
    	          System.out.print("          10. Super()");
    	          System.out.print("\n");
    	          System.out.print("          11. StartPump()");
    	          System.out.print("\n");
    	          System.out.print("          12. PumpGallon()");
    	          System.out.print("\n");
    	          System.out.print("          13. FullTank()");
    	          System.out.print("\n");
    	          System.out.print("          14. StopPump()");
    	          System.out.print("\n");
    	          
    	          System.out.print("  Please make a note of these operations");
    	          System.out.print("\n");
    	          System.out.print("           GasPump-2 Execution");
    	          System.out.print("\n");
    	          String ch = null;
    	          //Scanner sc = new Scanner(System.in); 
    	      while (ch !="q")
    	      {
    	          System.out.print("  Select Operation: ");
    	          System.out.print("\n");
    	          System.out.print("0-Activate,1-Start,2-PayCredit,3-Reject,4-PayDebit,5-Pin(string),6-Cancel,7-Approved, 8-Diesel, 9-Regular, 10-Super, 11-StartPump, 12-PumpGallon, 13-FullTank, 14-StopPumpq-quit");
    	          System.out.print("\n");
    	          ch=sc.next(); 
    	          switch (ch)
    	          {
    	        case "0":
    	        { //Activate()
    	                 System.out.print("  Operation:  Activate(float a, float b,float c)");
    	                 System.out.print("\n");
    	                 System.out.print("  Enter value of the parameter a:");
    	                 System.out.print("\n");
    	                 float a = sc.nextFloat();
    	                 System.out.print("  Enter value of the parameter b:");
    	                 System.out.print("\n");
    	                 float b = sc.nextFloat();
    	                 System.out.print("  Enter value of the parameter c:");
    	                 System.out.print("\n");
    	                 float c = sc.nextFloat();
    	                 gp2.Activate(a,b,c);
    	                 break;
    	             }

    	        case "1":
    	        { //Start
    	                System.out.print("  Operation:  Start()");
    	                System.out.print("\n");
    	                gp2.Start();
    	                break;
    	            }

    	        case "2":
    	        { //PayCredit
    	                    System.out.print("  Operation:  PayCredit()");
    	                    System.out.print("\n");
    	                gp2.PayCredit();
    	                break;
    	            }

    	        case "3":
    	        { //Reject
    	                    System.out.print("  Operation:  Reject()");
    	                    System.out.print("\n");
    	                gp2.Reject();
    	                break;
    	            }

    	        case "4":
    	        { //Debit
    	                    System.out.print("  Operation:  PayDebit(string)");
    	                    System.out.print("\n");
    	                    System.out.println("Enter the Pin");
    	                    String a= sc.nextLine();
    	                gp2.PayDebit(a);
    	                break;
    	            }

    	        case "5":
    	        { //Pin
    	                    System.out.print("  Operation:  Pin(string)");
    	                    System.out.print("\n");
    	                    System.out.println("Enter the Pin");
    	                    String a= sc.nextLine();
    	                gp2.Pin(a);
    	                break;
    	            }

    	        case "6":
    	        { //Cancel
    	                      System.out.print("  Operation:  Cancel()");
    	                      System.out.print("\n");
    	                gp2.Cancel();
    	                break;
    	               }

    	        case "7":
    	        { //Approved
    	                    System.out.print("  Operation:  Approved()");
    	                    System.out.print("\n");
    	                gp2.Approved();
    	                break;
    	            }


    	        case "8":
    	        { //Diesel
    	                    System.out.print("  Operation:  Diesel()");
    	                    System.out.print("\n");
    	                gp2.Diesel();
    	                break;
    	            }

    	        case "9":
    	        { //Regular
    	                    System.out.print("  Operation:  Regular()");
    	                    System.out.print("\n");
    	                gp2.Regular();
    	                break;
    	            }
    	        case "10":
    	        {
    	        		System.out.print("  Operation:  Super()");
    	        		System.out.print("\n");
    	        		gp2.Super();
    	        		break;
    	        }
    	        case "11":
    	        {
    	        		System.out.print("  Operation:  StartPump()");
    	        		System.out.print("\n");
    	        		gp2.StartPump();
    	        		break;
    	        }
    	        case "12":
    	        {
    	        		System.out.print("  Operation:  PumpGallon()");
    	        		System.out.print("\n");
    	        		gp2.PumpGallon();
    	        		break;
    	        }
    	        case "13":
    	        {
    	        		System.out.print("  Operation:  StopPump()");
    	        		System.out.print("\n");
    	        		gp2.StopPump();
    	        		break;
    	        }
    	        case "14":
    	        {
    	        		System.out.print("  Operation:  FullTank()");
    	        		System.out.print("\n");
    	        		gp2.FullTank();
    	        		break;
    	        }
    	      }; // endswitch

    	   }; //endwhile
        		  break;
        	  }
    };
       }
}