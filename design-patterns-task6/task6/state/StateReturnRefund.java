//Chris Park

package task6.state;

import task6.*;
import task6.money.*;

public class StateReturnRefund extends A_State
{
	public StateReturnRefund(Transaction transaction)
	{
		super(transaction);
	}
	
	@Override
	public StateStartTransaction doStartTransaction()
	{
		return new StateStartTransaction();
	}
	
	public java.util.List<A_Currency> makeChange()
	{
		CurrencyManager currencyManager = new CurrencyManager();
		return currencyManager.makeChange(_transaction.getMoneyTendered());
	}
}
