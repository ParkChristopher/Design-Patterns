//Chris Park

package task6;

import task6.money.*;
import task6.ingredient.*;

public class Transaction
{
	Money _tendered;
	A_Ingredient _product;
	
	public Transaction()
	{
		_tendered = new Money();
	}
	
	public Transaction(Money moneyTendered)
	{
		validateObject(moneyTendered);
		_tendered = moneyTendered;
	}
	
	public Money addMoneyTendered(A_Currency money)
	{
		validateObject(money);
		_tendered = _tendered.add(money.getValue());
		return _tendered;
	}
	
	public A_Ingredient getIngredientOuter()
	{
		if(_product != null)
			return _product;
		
		throw new RuntimeException("Error: No outer ingredient");
	}
	
	public Money getMoneyTendered()
	{
		return _tendered;
	}
	
	public Money getProductCost()
	{
		return _product.getCostTotal();
	}
	
	public boolean hasIngredientOuter()
	{
		return _product != null;
	}
	
	@Override
	public java.lang.String toString()
	{
		java.lang.String str = "";
		str += "moneyTendered=" + _tendered.toString() + " ingredientOuter=" +
			_product.getDescription();
		
		return str;
	}
	
	public java.util.List<A_Ingredient> unrollProduct()
	{
		java.util.ArrayList<A_Ingredient> productList =
			new java.util.ArrayList<A_Ingredient>();
			
		productList.addAll(_product.getIngredients());
		return productList;
	}
	
	public void updateIngredientOuter(A_Ingredient ingredient)
	{
		validateObject(ingredient);
		_product = ingredient;
	}
	
	//Validation Methods
	protected void validateObject(Object obj)
	{
		if(obj == null)
			throw new RuntimeException("Error: Null object not allowed");
	}
}
