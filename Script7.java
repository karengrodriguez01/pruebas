
import resources.Script7Helper;
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
public class Script7 extends Script7Helper
{
	/**
	 * Script Name   : <b>Script7</b>
	 * Generated     : <b>19/07/2018 10:13:59</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 16299 ()
	 * 
	 * @since  2018/07/19
	 * @author Xideral-023
	 */
	public void testMain(Object[] args) 
	{
		startApp("ClassicsJavaA");
		
		// Frame: ClassicsCD
		tree2().drag(atPath("Composers->Bach"));
		tree2().click(atPath("Composers->Bach"));
		tree2().doubleClick(atPath("Composers->Bach->Brandenburg Concertos Nos. 1 & 3"));
		placeOrder().click();
		
		// Frame: Member Logon
		ok().click();
		
		// Frame: Place an Order
		placeAnOrder().performTest(PlaceAnOrder_stateVP());
	}
}

