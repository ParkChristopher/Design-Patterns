package f14cs349task2;

import f14cs349task2.contracts.I_CanAttackBirdGround;
import f14cs349task2.contracts.I_CanAttackDog;
import f14cs349task2.contracts.I_CanAttackTree;

//=============================================================================================================================================================
/**
 * Defines an entity for a bird on the ground.
 * 
 * @author Dan Tappan [02.10.14]
 */
public class EntityBirdGround extends A_EntityBird<I_CanAttackBirdGround> implements I_CanAttackBirdGround, I_CanAttackDog, I_CanAttackTree
{
   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * Creates an entity.
    * 
    * @param id - the entity identifier
    */
   public EntityBirdGround(final String id)
   {
      super(id);
   }
}
