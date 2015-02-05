package f14cs349task2.contracts;

import f14cs349task2.A_Entity;

//=============================================================================================================================================================
/**
 * Defines the contract for something that can attack.
 * 
 * @author Dan Tappan [02.10.14]
 */
public interface I_CanAttack extends I_Identifiable
{
   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * Starts an episode of this entity attacking another entity. Call this to attack an entity, then {@link #updateAttackOn_(A_Entity)} to continue the attack
    * any number of times, and finally {@link #endAttackOn_(A_Entity)} to end the episode.
    * 
    * This is for internal use only. A client should initiate an attack through {@link f14cs349task2.A_Entity#acceptAttackBy(I_CanAttack)}.
    * 
    * @param attackee - the entity being attacked
    */
   public void beginAttackOn_(final A_Entity<?> attackee);

   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * Ends an episode of this entity attacking another entity.
    * 
    * @param attackee - the entity being attacked
    */
   public void endAttackOn_(final A_Entity<?> attackee);

   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * Gets a description of the method used for attacking, grammatically formed in the progressive tense.
    * 
    * @return the description
    */
   public String getAttackMethod_();

   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * Updates an episode of this entity attacking another entity.
    * 
    * @param attackee - the entity being attacked
    */
   public void updateAttackOn_(final A_Entity<?> attackee);
}
