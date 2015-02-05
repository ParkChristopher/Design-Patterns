package f14cs349task2;

import f14cs349task2.contracts.I_CanAttackBirdWater;
import f14cs349task2.contracts.I_CanAttackClam;
import f14cs349task2.contracts.I_CanAttackFish;

//=============================================================================================================================================================
/**
 * Defines an entity for a fish.
 * 
 * @author Dan Tappan [02.10.14]
 */
public class EntityFish extends A_EntityAttacking<I_CanAttackFish> implements I_CanAttackBirdWater, I_CanAttackClam, I_CanAttackFish
{
   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * Creates an entity.
    * 
    * @param id - the entity identifier
    */
   public EntityFish(final String id)
   {
      super(id, "nibbling", "blowing bubbles");
   }
}
