
import resources.Script4Helper;
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
public class Script4 extends Script4Helper
{
	/**
	 * Script Name   : <b>Script4</b>
	 * Generated     : <b>18/07/2018 17:24:06</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 16299 ()
	 * 
	 * @since  2018/07/18
	 * @author Xideral-023
	 */
	public void testMain(Object[] args) 
	{
		startApp("ClassicsJavaA");
		
		// Frame: ClassicsCD
		tree2().click(atPath("Composers->Mozart->Location(PLUS_MINUS)"));
		tree2().click(atPath("Composers->Mozart->Symphony in C, No. 41: Jupiter"));
		placeOrder().click();
		
		// Frame: Member Logon
		ok().click();
		
		// Frame: Place an Order
		cardNumberIncludeTheSpaces().click(atPoint(9,6));
		placeAnOrder().inputChars("2222222222222");
		expirationDate().click(atPoint(4,5));
		placeAnOrder().inputChars("11/11");
		placeOrder2().click();
		
		// 
		aceptar().click();
	}
}

