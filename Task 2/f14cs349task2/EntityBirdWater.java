package f14cs349task2;

import f14cs349task2.contracts.I_CanAttackBirdWater;
import f14cs349task2.contracts.I_CanAttackFish;

//=============================================================================================================================================================
/**
 * Defines an entity for a bird on water.
 * 
 * @author Dan Tappan [02.10.14]
 */
public class EntityBirdWater extends A_EntityBird<I_CanAttackBirdWater> implements I_CanAttackBirdWater, I_CanAttackFish
{
   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * Creates an entity.
    * 
    * @param id - the entity identifier
    */
   public EntityBirdWater(final String id)
   {
      super(id);
   }
}
