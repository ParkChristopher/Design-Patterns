package f14cs349task2;

import f14cs349task2.contracts.I_CanAttackTreePine;

//=============================================================================================================================================================
/**
 * Defines an entity for a pine tree.
 * 
 * @author Dan Tappan [02.10.14]
 */
public class EntityTreePine extends A_EntityTree<I_CanAttackTreePine>
{
   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * Creates an entity.
    * 
    * @param id - the entity identifier
    */
   public EntityTreePine(final String id)
   {
      super(id, "dropping pine needles");
   }
}
