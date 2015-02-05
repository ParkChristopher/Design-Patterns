//Chris Park

import task6.money.*;
import java.util.*;

public class drivertask6
{
	public static void main(String[] args)
	{
		System.out.println("Testing instantiation.");
		System.out.println();
		
		Money moneySum;
		ArrayList<A_Currency> currencyList = new ArrayList<A_Currency>();
		CurrencyManager currencyManager = new CurrencyManager();
		
		A_Currency currencyNickel = new CurrencyCoinCent_5();
		A_Currency currencyDime = new CurrencyCoinCent_10();
		A_Currency currencyQuarter = new CurrencyCoinCent_25();
		A_Currency currencyCoinDollar = new CurrencyCoinDollar_1();
		
		A_Currency currencyDollar = new CurrencyPaperDollar_1();
		A_Currency currencyTwo = new CurrencyPaperDollar_2();
		A_Currency currencyFive = new CurrencyPaperDollar_5();
		A_Currency currencyTen = new CurrencyPaperDollar_10();
		
		currencyList.add(currencyNickel);
		currencyList.add(currencyDime);
		currencyList.add(currencyQuarter);
		currencyList.add(currencyCoinDollar);
		currencyList.add(currencyDollar);
		currencyList.add(currencyTwo);
		currencyList.add(currencyFive);
		currencyList.add(currencyTen);
		
		System.out.println("--Individual Currencies");
		System.out.println();
		
		for(A_Currency currency : currencyList)
			System.out.println(currency.toString());
		
		System.out.println();
		System.out.println("Testing CurrencyManager sumCurrency.");
		System.out.println();
		
		moneySum = currencyManager.sumCurrency(currencyList);
		System.out.println(moneySum.toString());
		
		
		
		
		
	}
}
