//Chris Park

package task6.money;

public class Money
{
	private int _dollars, _cents;
	private boolean _isPositive, _isNegative;
	private boolean _isZero = false;
	
	public Money()
	{
		_isPositive = false;
		_isNegative = false;
		_isZero = true;
		_dollars = 0;
		_cents = 0;
	}
	
	public Money(int cents)
	{
		_dollars = 0;
		_cents = cents;
		
		_isPositive = (cents > 0) ? true : false;
		_isNegative = (cents < 0) ? true : false;
		
		if(cents == 0)
		{
			_isNegative = false;
			_isPositive = false;
			_isZero = true;
		}
	}
	
	public Money(int dollars, int cents)
	{
		if( dollars < 0 || cents < 0 || cents > 99)
			throw new RuntimeException("Error: Incorrect values for constructor");
		
		if(dollars == 0 && cents == 0)
		{
			_isNegative = false;
			_isPositive = false;
			_isZero = true;
		}
		
		_dollars = dollars;
		_cents = cents;
	}
	
	public Money(int dollars, int cents, boolean isPositive)
	{	
		if(dollars < 0 || cents < -99 || cents > 99)
			throw new RuntimeException("Error: Incorrect values for constructor.");
		
		if(dollars == 0 && cents == 0)
		{
			_isNegative = false;
			_isPositive = false;
			_isZero = true;
		}
		
		_dollars = dollars;
		_cents = cents;
		_isPositive = isPositive;
		_isNegative = (dollars < 0 || cents < 0) ? true : false;
	}
	
	public Money add(Money money)
	{
		int dollars = 0;
		int cents = 0;
		
		dollars += (_dollars + money.getDollars());
		cents += (_cents + money.getCentsOfDollar());
		dollars += cents / 100;
		cents = cents % 100;
		
		return new Money(dollars, cents);
	}
	
	public int compareTo(Money money)
	{
		int result;
		
		if(_dollars < money.getDollars() ||
			(_dollars == money.getDollars() && _cents < money.getCentsOfDollar()))
			return -1;
		
		if(_dollars > money.getDollars() || 
			(_dollars == money.getDollars() && _cents > money.getCentsOfDollar()))
			return 1;
		
		return 0;
	}
	
	@Override
	public boolean equals(java.lang.Object object)
	{
		if(this.compareTo((Money)object) == 0)
			return true;
		
		return false;
	}
	
	public int getCentsOfDollar()
	{
		return _cents;
	}
	
	public int getCentsTotal()
	{
		return _cents + (_dollars * 100);
	}
	
	public int getDollars()
	{
		return _dollars;
	}
	
	@Override
	public int hashCode()
	{
		java.lang.String str = _dollars + " " + _cents;
		
		return str.hashCode();
	}
	
	public boolean isNegative()
	{
		return _isNegative;
	}
	
	public boolean isPositive()
	{
		return _isPositive;
	}
	
	public boolean isZero()
	{
		return _isZero;
	}
	
	public Money subtract(Money money)
	{
		int dollars = 0;
		int cents = 0;
		boolean isPositive;
		
		dollars += (_dollars - money.getDollars());
		cents += (_cents - money.getCentsOfDollar());
		dollars += cents / 100;
		cents = cents % 100;
		
		isPositive = (dollars > 0 || cents > 0) ? true : false;
		
		return new Money(dollars, cents, isPositive);
	}
	
	@Override
	public java.lang.String toString()
	{
		String str = "$[-]" + _dollars + "." + _cents + "."; 
		return str;
	}
}
