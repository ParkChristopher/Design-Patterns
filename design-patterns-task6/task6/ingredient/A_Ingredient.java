//Chris Park

package task6.ingredient;

import task6.money.*;

public abstract class A_Ingredient
{
	private java.lang.String _description;
	private Money _cost;
	private A_Ingredient _ingredientWrapped;
	
	public A_Ingredient(Money cost, java.lang.String description)
	{
		validateObject(cost);
		validateString(description);
		
		_cost = cost;
		_description = description;
		_ingredientWrapped = null;
	}
	
	public A_Ingredient(Money cost, java.lang.String description,
		A_Ingredient ingredientWrapped)
	{
		validateObject(cost);
		validateObject(ingredientWrapped);
		validateString(description);
		
		_cost = cost;
		_description = description;
		_ingredientWrapped = ingredientWrapped;
	}
	
	public Money getCost()
	{
		return _cost;
	}
	
	public Money getCostTotal()
	{
		if(!this.hasIngredientWrapped())
			return this.getCost();
		
		return this.getCost().add(_ingredientWrapped.getCostTotal());
	}
	
	public java.lang.String getDescription()
	{
		return _description;
	}
	
	public java.util.List<java.lang.String> getDescriptionTotal()
	{
		java.util.ArrayList<java.lang.String> descriptions = 
			new java.util.ArrayList<java.lang.String>();
			
		descriptions.add(this.getDescription());
		
		if(!this.hasIngredientWrapped())
			return descriptions;
		
		descriptions.addAll(_ingredientWrapped.getDescriptionTotal());
		return descriptions;
	}
	
	public java.util.List<A_Ingredient> getIngredients()
	{
		java.util.ArrayList<A_Ingredient> ingredients =
			new java.util.ArrayList<A_Ingredient>();
		
		ingredients.add(this);
		
		if(!this.hasIngredientWrapped())
			return ingredients;
		
		ingredients.addAll(_ingredientWrapped.getIngredients());
		return ingredients;
	}
	
	public A_Ingredient getIngredientWrapped()
	{
		validateObject(_ingredientWrapped);
		
		return _ingredientWrapped;
	}
	
	public boolean hasIngredientWrapped()
	{
		return _ingredientWrapped != null;
	}
	
	@Override
	public java.lang.String toString()
	{
		java.lang.String str = "";
		str += this.getClass().getSimpleName() + "{cost=" + _cost +
			" description=[" + _description + "]}";
		
		return str;
	}
	
	//Validation Methods
	protected void validateObject(Object obj)
	{
		if(obj == null)
			throw new RuntimeException("Error - Null object not allowed");
	}
	
	protected void validateString(java.lang.String str)
	{
		if(str.isEmpty() || str == null)
			throw new RuntimeException("Error - Description string is empty");
	}
}
