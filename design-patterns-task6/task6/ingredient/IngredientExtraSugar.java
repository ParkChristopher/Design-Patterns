//Chris Park

package task6.ingredient;

import task6.money.*;

public class IngredientExtraSugar extends A_IngredientExtra
{
	public IngredientExtraSugar(A_Ingredient ingredientWrapped)
	{
		super(new Money(14), "sugar", ingredientWrapped);
	}
}
