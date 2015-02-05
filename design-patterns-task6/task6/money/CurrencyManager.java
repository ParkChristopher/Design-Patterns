//Chris Park

package task6.money;

import java.util.*;

public class CurrencyManager
{
	private static final int TEN = 10;
	private static final int FIVE = 5;
	private static final int TWO = 2;
	private static final int DOLLARCOIN = 100;
	private static final int QUARTER = 25;
	private static final int DIME = 10;
	private static final int NICKEL = 5;
	
	private Money _profit;
	
	public CurrencyManager()
	{
		_profit = new Money();
	}
	
	public Money getExchangeProfit()
	{
		return _profit;
	}
	
	public java.util.List<A_Currency> makeChange(Money money)
	{
		ArrayList<A_Currency> change = new ArrayList<A_Currency>();
		int tens, fives, twos, ones;
		int dollarCoins, quarters, dimes, nickels, profit;
		int dollars, cents, i;
		
		tens = fives = twos = ones = 0;
		dollarCoins = quarters = dimes = nickels = profit = 0;
		dollars = money.getDollars();
		cents = money.getCentsOfDollar();
		
		//Paper
		tens = dollars / TEN;
		dollars = dollars % TEN;
		fives = dollars / FIVE;
		dollars = dollars % FIVE;
		twos = dollars / TWO;
		dollars = dollars % TWO;
		ones = dollars;
		
		//Coins
		dollarCoins = cents / DOLLARCOIN;
		cents = cents % DOLLARCOIN;
		quarters = cents / QUARTER;
		cents = cents % QUARTER;
		dimes = cents / DIME;
		cents = cents % DIME;
		nickels = cents / NICKEL;
		profit = cents % NICKEL;
		
		_profit.add(new Money(profit));
		
		for(i = 0; i < tens; i++)
			change.add(new CurrencyPaperDollar_10());
		for(i = 0; i < fives; i++)
			change.add(new CurrencyPaperDollar_5());
		for(i = 0; i < twos; i++)
			change.add(new CurrencyPaperDollar_2());
		for(i = 0; i < ones; i++)
			change.add(new CurrencyPaperDollar_1());
		for(i = 0; i < dollarCoins; i++)
			change.add(new CurrencyCoinDollar_1());
		for(i = 0; i < quarters; i++)
			change.add(new CurrencyCoinCent_25());
		for(i = 0; i < dimes; i++)
			change.add(new CurrencyCoinCent_10());
		for(i = 0; i < nickels; i++)
			change.add(new CurrencyCoinCent_5());
		
		return change;
	}
	
	//need to figure out profit calculations here
	public Money sumCurrency(java.util.List<A_Currency> denominations)
	{
		Money sum = new Money();
		A_Currency currency;
		
		Iterator<A_Currency> iter = denominations.listIterator();
		
		while(iter.hasNext())
		{
			currency = iter.next();
			sum = sum.add(currency.getValue());
		}
		
		return sum;
	}
}
