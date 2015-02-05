package f14cs349task2;

import f14cs349task2.contracts.I_CanAttackClam;
import f14cs349task2.contracts.I_CanAttackFish;

//=============================================================================================================================================================
/**
 * Defines an entity for a clam.
 * 
 * @author Dan Tappan [02.10.14]
 */
public class EntityClam extends A_EntityAttacking<I_CanAttackClam> implements I_CanAttackFish
{
   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * Creates an entity.
    * 
    * @param id - the entity identifier
    */
   public EntityClam(final String id)
   {
      super(id, "gomping", "making pearls");
   }
}
