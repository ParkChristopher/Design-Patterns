//Chris Park

package task6.money;

public abstract class A_Currency
{
	
	private String _description;
	private Money _money;
	public A_Currency(Money money, java.lang.String description)
	{
		if(money == null || description == null)
			throw new RuntimeException("Error: Null object reference");
		
		_money = money;
		_description = description;
	}
	
	public Money add(A_Currency amount)
	{
		return _money.add(amount.getValue());
	}
	
	public Money add(Money amount)
	{
		return _money.add(amount);
	}
	
	public int compareTo(A_Currency money)
	{
		if(_money.compareTo(money.getValue()) == 1)
			return 1;
		
		if(_money.compareTo(money.getValue()) == -1)
			return -1;
		
		return 0;
	}
	
	public java.lang.String getDescription()
	{
		return _description;
	}
	
	public Money getValue()
	{
		return _money;
	}
	
	public Money subtract(A_Currency amount)
	{
		return _money.subtract(amount.getValue());
	}
	
	public Money subtract(Money amount)
	{
		return _money.subtract(amount);
	}
	
	@Override
	public java.lang.String toString()
	{
		return _money.toString() + "/" + _description;
	}
	
}
