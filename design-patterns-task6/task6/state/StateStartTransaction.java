//Chris Park

package task6.state;

import task6.*;
import task6.money.*;

public class StateStartTransaction extends A_State
{
	public StateStartTransaction()
	{
		super(new Transaction());
	}
	
	@Override
	public StateReturnRefund doReturnRefund()
	{
		return new StateReturnRefund(_transaction);
	}
	
	@Override
	public StateBuildCoffeeBaseDecaf doSelectCoffeeBaseDecaf()
	{
		return new StateBuildCoffeeBaseDecaf(_transaction);
	}
	
	@Override
	public StateBuildCoffeeBaseRegular doSelectCoffeeBaseRegular()
	{
		return new StateBuildCoffeeBaseRegular(_transaction);
	}
	
	public void insertMoney(A_Currency denomination)
	{
		validateObject(denomination);
		_transaction.addMoneyTendered(denomination);
	}
	
}
