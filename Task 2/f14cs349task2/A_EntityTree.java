package f14cs349task2;

import f14cs349task2.contracts.I_CanAttackTree;

//=============================================================================================================================================================
/**
 * Defines the shared elements of an entity for a tree.
 * 
 * @author Dan Tappan [02.10.14]
 */
public abstract class A_EntityTree<_ATTACKER_ extends I_CanAttackTree> extends A_Entity<_ATTACKER_>
{
   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * Creates an entity.
    * 
    * @param id - the entity identifier
    * @param defenseMethod - a description of the method used for defense, grammatically formed in the progressive tense
    */
   public A_EntityTree(final String id, final String defenseMethod)
   {
      super(id, defenseMethod);
   }
}
