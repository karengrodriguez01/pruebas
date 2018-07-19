
import resources.Script3Helper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author Xideral-023
 */
public class Script3 extends Script3Helper
{
	/**
	 * Script Name   : <b>Script3</b>
	 * Generated     : <b>18/07/2018 16:09:27</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 16299 ()
	 * 
	 * @since  2018/07/18
	 * @author Xideral-023
	 */
	public void testMain(Object[] args) 
	{
		
		// Frame: ClassicsCD
		tree2().click(atPath("Composers->Haydn->Location(PLUS_MINUS)"));
		tree2().click(atPath("Composers->Haydn->Symphonies Nos. 99 & 101"));
		placeOrder().click();
		
		// Frame: Member Logon
		ok().click();
		
		// Frame: Place an Order
		cardNumberIncludeTheSpaces().click(atPoint(30,5));
		placeAnOrder().inputChars("111111111111111");
		expirationDate().click(atPoint(12,8));
		placeAnOrder().inputChars("11/11");
		placeOrder2().click();
		
		// 
		aceptar().click();
		startApp("ClassicsJavaA");
		
		// Frame: ClassicsCD
		tree2().drag(atPath("Composers->Schubert"), 
               atPath("Composers->Haydn"));
		tree2().click(atPath("Composers->Haydn"));
		tree2().doubleClick(atPath("Composers->Haydn"));
		tree2().doubleClick(atPath("Composers->Haydn->Symphonies Nos. 99 & 101"));
		placeOrder().click();
		
		// Frame: Member Logon
		ok().click();
		
		// Frame: Place an Order
		cardNumberIncludeTheSpaces().click(atPoint(18,4));
		placeAnOrder().inputChars("1111111111");
		expirationDate().click(atPoint(33,10));
		placeAnOrder().inputChars("11/11");
		placeOrder2().click();
		
		// 
		aceptar().click();
	}
}

