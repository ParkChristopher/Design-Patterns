//Chris Park

package task6.state;

import task6.*;

public class StateDeliverProduct extends A_State
{
	public StateDeliverProduct(Transaction transaction)
	{
		super(transaction);
	}
	
	@Override
	public StateReturnChange doReturnChange()
	{
		return new StateReturnChange(_transaction);
	}
}
