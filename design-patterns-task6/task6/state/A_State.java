//Chris Park

package task6.state;

import task6.*;

public abstract class A_State
{
	private Transaction _transaction;
	
	public A_State(Transaction transaction)
	{
		validateObject(transaction);
		_transaction = transaction;
	}
	
	public StateDeliverProduct doDeliverProduct()
	{
		throw new RuntimeException("Error - Invalid state transition");
	}
	
	public StateReturnChange doReturnChange()
	{
		throw new RuntimeException("Error - Invalid state transition");
	}
	
	public StateReturnRefund doReturnRefund()
	{
		throw new RuntimeException("Error - Invalid state transition");
	}
	
	public StateBuildCoffeeBaseDecaf doSelectCoffeeBaseDecaf()
	{
		throw new RuntimeException("Error - Invalid state transition");
	}
	
	public StateBuildCoffeeBaseRegular doSelectCoffeeBaseRegular()
	{
		throw new RuntimeException("Error - Invalid state transition");		
	}
	
	public StateBuildCoffeeExtraCream doSelectExtraCream()
	{
		throw new RuntimeException("Error - Invalid state transition");
	}
	
	public StateBuildCoffeeExtraMilk doSelectExtraMilk()
	{
		throw new RuntimeException("Error - Invalid state transition");
	}
	
	public StateBuildCoffeeExtraSugar doSelectExtraSugar()
	{
		throw new RuntimeException("Error - Invalid state transition");
	}
	
	public StateStartTransaction doStartTransaction()
	{
		throw new RuntimeException("Error - Invalid state transition");
	}
	
	public Transaction getTransaction()
	{
		return _transaction;
	}
	
	@Override
	public java.lang.String toString()
	{
		java.lang.String str = "";
		str += getClass().getSimpleName() + "{transaction=" +
			_transaction.toString() + "}";
		
		return str;
	}
	
	protected void validateObject(Object obj)
	{
		if(obj == null)
			throw new RuntimeException("Error - Null object not allowed");
	}
}
