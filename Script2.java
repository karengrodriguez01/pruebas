
import resources.Script2Helper;
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
public class Script2 extends Script2Helper
{
	/**
	 * Script Name   : <b>Script2</b>
	 * Generated     : <b>18/07/2018 16:01:48</b>
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
		tree2().click(atPath("Composers->Schubert->Location(PLUS_MINUS)"));
		tree2().click(atPath("Composers->Schubert->Die schone Mullerin, Op. 25"));
		album().click(atText("Details"));
		placeOrder().click();
		
		// Frame: Member Logon
		nameCombo().click();
		nameCombo().click(atText("Claire Stratus"));
		ok().click();
		
		// Frame: Place an Order
		cardNumberIncludeTheSpaces().click(atPoint(28,13));
		placeAnOrder().inputChars("1234123412341234");
		expirationDate().click(atPoint(14,10));
		placeAnOrder().inputChars("10/10");
		placeOrder2().click();
		
		// 
		aceptar().click();
	}
}

