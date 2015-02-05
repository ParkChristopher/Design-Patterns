package f14cs349task2;

import f14cs349task2.contracts.I_CanAttackTreeOak;

//=============================================================================================================================================================
/**
 * Defines an entity for an oak tree.
 * 
 * @author Dan Tappan [02.10.14]
 */
public class EntityTreeOak extends A_EntityTree<I_CanAttackTreeOak>
{
   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * Creates an entity.
    * 
    * @param id - the entity identifier
    */
   public EntityTreeOak(final String id)
   {
      super(id, "dropping acorns");
   }
}
