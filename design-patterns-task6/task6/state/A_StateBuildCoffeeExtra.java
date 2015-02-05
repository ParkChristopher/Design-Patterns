//Chris Park

package task6.state;

import task6.*;

public abstract class A_StateBuildCoffeeExtra extends A_State
{
	public A_StateBuildCoffeeExtra(Transaction transaction)
	{
		super(transaction);
	}
	
	@Override
	public StateDeliverProduct doDeliverProduct()
	{
		return new StateDeliverProduct(_transaction);
	}
	
	@Override
	public StateReturnRefund doReturnRefund()
	{
		return new StateReturnRefund(_transaction);
	}
	
	@Override
	public StateBuildCoffeeExtraCream doSelectExtraCream()
	{
		return new StateBuildCoffeeExtraCream(_transaction);
	}
	
	@Override
	public StateBuildCoffeeExtraMilk doSelectExtraMilk()
	{
		return new StateBuildCoffeeExtraMilk(_transaction);
	}
	
	@Override
	public StateBuildCoffeeExtraSugar doSelectExtraSugar()
	{
		return new StateBuildCoffeeExtraSugar(_transaction);
	}
}
