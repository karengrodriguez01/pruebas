
import resources.Script6Helper;
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
public class Script6 extends Script6Helper
{
	/**
	 * Script Name   : <b>Script6</b>
	 * Generated     : <b>19/07/2018 10:00:30</b>
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
		tree2().drag(atPath("Composers->Haydn"));
		tree2().click(atPath("Composers->Haydn"));
		tree2().click(atPath("Composers->Haydn->Symphonies Nos. 99 & 101"));
		placeOrder().click();
		
		// Frame: Member Logon
		memberLogon().performTest(MemberLogon_stateVP());
	}
}

