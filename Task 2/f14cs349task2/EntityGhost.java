package f14cs349task2;

import f14cs349task2.contracts.I_CanAttackBirdAir;
import f14cs349task2.contracts.I_CanAttackBirdGround;
import f14cs349task2.contracts.I_CanAttackDog;
import f14cs349task2.contracts.I_CanAttackGhost;
import f14cs349task2.contracts.I_CanAttackTree;

//=============================================================================================================================================================
/**
 * Defines an entity for a ghost.
 * 
 * @author Dan Tappan [02.10.14]
 */
public class EntityGhost extends A_EntityAttacking<I_CanAttackGhost> implements I_CanAttackBirdAir, I_CanAttackBirdGround, I_CanAttackDog, I_CanAttackTree
{
   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * Creates an entity.
    * 
    * @param id - the entity identifier
    */
   public EntityGhost(final String id)
   {
      super(id, "making spooking noises", "floating around");
   }
}
