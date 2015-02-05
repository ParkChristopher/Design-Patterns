package f14cs349task2;

import f14cs349task2.contracts.I_CanAttackBird;

//=============================================================================================================================================================
/**
 * Defines the shared elements of an entity for a bird.
 * 
 * @author Dan Tappan [02.10.14]
 */
public abstract class A_EntityBird<_ATTACKER_ extends I_CanAttackBird> extends A_EntityAttacking<_ATTACKER_>
{
   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * Creates an entity.
    * 
    * @param id - the entity identifier
    */
   public A_EntityBird(final String id)
   {
      super(id, "chirping really annoyingly", "singing");
   }
}
