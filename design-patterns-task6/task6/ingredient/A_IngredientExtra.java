//Chris Park

package task6.ingredient;

import task6.money.*;

public abstract class A_IngredientExtra extends A_Ingredient
{
	public A_IngredientExtra(Money cost, java.lang.String description,
		A_Ingredient ingredientWrapped)
	{
		super(cost, description, ingredientWrapped);
	}
}
