
import resources.Script1Helper;
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
public class Script1 extends Script1Helper
{
	/**
	 * Script Name   : <b>Script1</b>
	 * Generated     : <b>18/07/2018 15:42:24</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 16299 ()
	 * 
	 * @since  2018/07/18
	 * @author Xideral-023
	 */
	public void testMain(Object[] args) 
	{
		
		// Window: OptionalFeatures.EXE: CaracterÝsticas de Windows
		cerrarbutton(ANY,MAY_EXIT).click(atPoint(32,19));
		startApp("ClassicsJavaA");
		
		// Frame: ClassicsCD
		placeOrder().click();
		
		// Frame: Member Logon
		ok().click();
		
		// Frame: Place an Order
		quantity().click(atPoint(8,13));
		placeAnOrder().inputChars("5");
		cardNumberIncludeTheSpaces().click(atPoint(31,18));
		placeAnOrder().inputChars("1234123412341234");
		expirationDate().click(atPoint(5,5));
		placeAnOrder().inputChars("12/11");
		creditCombo().click();
		
		// 
		comboPopupPopup(ANY,NOT_SHOWING).click(atPoint(0,0));
		
		// Frame: Place an Order
		placeOrder2().click();
		
		// 
		aceptar().click();
	}
}

